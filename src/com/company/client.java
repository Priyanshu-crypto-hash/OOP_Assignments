
//final remaining
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
interface client {
    void viewLecture();
    void viewAssessments();
    void viewComments();
    void addComments(String name);
}
class Lectures{
     private  String  topic;
     private int numOfSlides;
     private String instructorName;
     private final ArrayList<String> lecturesMaterialRecord = new ArrayList<>();
     private boolean video;
     private HashMap<Integer,String> slidesMap = new HashMap<>();
     private Date d;

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setLecturesMaterialRecord(String slide) {
        lecturesMaterialRecord.add(slide);
    }

    public ArrayList<String> getLecturesMaterialRecord() {
        return lecturesMaterialRecord;
    }

    public int getNumOfSlides() {
        return numOfSlides;
    }

    public void setNumOfSlides(int numOfSlides) {
        this.numOfSlides = numOfSlides;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setSlidesMap(HashMap<Integer, String> slidesMap) {
        this.slidesMap = slidesMap;
    }
}
class Assessments{
    private HashMap<Student,String > subMap = new HashMap<>();
    private HashMap<Student,Integer> gradeMap = new HashMap<>();
    public HashMap<Student, Integer> getgradeMap()
    {
        return gradeMap;
    }
    public void setGradeMap(Student s , int a) {
        gradeMap.put(s,a);
    }
    public HashMap<Student, String> getsubMap()
    {
        return subMap;
    }
    public void setsubMap(Student student , String a) {
        subMap.put(student,a);
    }

     private int assID;
     private String problem;
     private int maxMarks=1;
     private String instructorName;
     private String grader;
     private String solution;
     private boolean quiz;

    public void setGrader(String grader) {
        this.grader = grader;
    }

    public String getGrader() {
        return grader;
    }

    public int getAssID() {
        return assID;
    }

    public void setAssID(int assID) {
        this.assID = assID;
    }

    public boolean isQuiz() {
        return quiz;
    }

    public void setQuiz(boolean quiz) {
        this.quiz = quiz;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    private Date d;

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getMaxMarks() {
        return maxMarks;

    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
}
class Student implements client {
    private int studentID;
     private String name;
     private HashMap<Assessments,Integer> submissionMap = new HashMap<>(); // -1 if deadline is closed,0 if not submitted,1 if submitted
     private HashMap<Assessments,Integer> statusMap = new HashMap<>(); // 0 if assignment is ungraded
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return studentID;
    }
    public HashMap<Assessments, Integer> getStatusMap() {
        return statusMap;
    }
    public HashMap<Assessments, Integer> getSubmissionMap() {
        return submissionMap;
    }
    public void setStatusMap( Assessments ass , int a) {
        statusMap.put(ass,a);
    }
    public void setSubmissionMap(Assessments ass,int a) {
        submissionMap.put(ass,a);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void addComments(String name) {
        Scanner scn = new Scanner(System.in);
        Discussion obj = new Discussion();
        System.out.println("Enter comment: ");
        String comment = scn.nextLine();
        obj.setComment(comment);
        obj.setD(new Date());
        obj.setName(name);
        ass2.commentsRecord.add(obj);
     }

    @Override
    public void viewAssessments() {
        for(int i=0;i<ass2.assessmentsRecord.size();i++){
            if(!ass2.assessmentsRecord.get(i).isQuiz()){
                System.out.println("ID: "+i+" Assignment: "+ass2.assessmentsRecord.get(i).getProblem()+" Max Marks: "+ass2.assessmentsRecord.get(i).getMaxMarks());
                System.out.println("----------------");

            }
            else if (ass2.assessmentsRecord.get(i).isQuiz()){
                System.out.println("ID: "+i+" Question: "+ass2.assessmentsRecord.get(i).getProblem());
                System.out.println("----------------");
            }
        }
    }


    @Override
    public void viewComments() {
        for(Discussion temp: ass2.commentsRecord){
            System.out.println(temp.getComment()+" - "+temp.getName());
            System.out.println(temp.getD());
        }

    }

    @Override
    public void viewLecture() {
        for(Lectures temp: ass2.lecturesRecord){
            if(!temp.isVideo()){
                System.out.println("Title: "+temp.getTopic());
                for(int i=0;i<temp.getNumOfSlides();i++){
                    System.out.println("Slide: "+i+1+": "+temp.getLecturesMaterialRecord().get(i));

                }
                System.out.println("Number of slides: "+temp.getNumOfSlides());
                System.out.println("Date of upload: "+temp.getD());
                System.out.println("Uploaded by: "+temp.getInstructorName());
            }
        }
        for(Lectures temp: ass2.lecturesRecord){
            if(temp.isVideo()){
                System.out.println("Title of Video: "+temp.getTopic());
                System.out.println("Video file: "+temp.getLecturesMaterialRecord().get(0));
                System.out.println("Date of upload: "+temp.getD());
                System.out.println("Uploaded by: "+temp.getInstructorName());
            }
        }
    }




}
class Instructor implements client{
    private int id ;
     private String name;
     public void setName(String name) {
         this.name = name;
     }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void addComments(String name) {
        Scanner scn = new Scanner(System.in);
        Discussion obj = new Discussion();
        System.out.println("Enter comment: ");
        String comment = scn.nextLine();
        obj.setComment(comment);
        obj.setD(new Date());
        obj.setName(name);
        ass2.commentsRecord.add(obj);
    }

    @Override
    public void viewAssessments() {
        for(int i=0;i<ass2.assessmentsRecord.size();i++){
            if(!ass2.assessmentsRecord.get(i).isQuiz()){
                System.out.println("ID: "+i+" Assignment: "+ass2.assessmentsRecord.get(i).getProblem()+" Max Marks: "+ass2.assessmentsRecord.get(i).getMaxMarks());
                System.out.println("----------------");

            }
            else if (ass2.assessmentsRecord.get(i).isQuiz()){
                System.out.println("ID: "+i+" Question: "+ass2.assessmentsRecord.get(i).getProblem());
                System.out.println("----------------");
            }
        }
    }

    @Override
    public void viewComments() {
        for(Discussion temp: ass2.commentsRecord){
            System.out.println(temp.getComment()+" - "+temp.getName());
            System.out.println(temp.getD());
        }
    }

    @Override
    public void viewLecture() {
        for(Lectures temp: ass2.lecturesRecord){
            if(!temp.isVideo()){
                System.out.println("Title: "+temp.getTopic());
                for(int i=0;i<temp.getNumOfSlides();i++){
                    System.out.println("Slide: "+i+1+": "+temp.getLecturesMaterialRecord().get(i));

                }
                System.out.println("Number of slides: "+temp.getNumOfSlides());
                System.out.println("Date of upload: "+temp.getD());
                System.out.println("Uploaded by: "+temp.getInstructorName());
            }
            else if(temp.isVideo()){
                System.out.println("Title of Video: "+temp.getTopic());
                System.out.println("Video file: "+temp.getLecturesMaterialRecord().get(0));
                System.out.println("Date of upload: "+temp.getD());
                System.out.println("Uploaded by: "+temp.getInstructorName());
            }
        }


    }
    public void addClassMaterial(){

    }
    public void addAssessment(){

    }
    public void gradeAssessments(){

    }
    public void closeAssessments(){

    }

}
class Discussion{
     private String name;
     private String comment;
     private Date d;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public Date getD() {
        return d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class ass2 {

    public static HashMap<String,Student> studentMap = new HashMap<>();
    public static HashMap<String,Instructor> instructorMap = new HashMap<>();
     public static ArrayList<Lectures> lecturesRecord = new ArrayList<>();
     public static ArrayList<Assessments > assessmentsRecord = new ArrayList<>();
     public static ArrayList<Discussion> commentsRecord = new ArrayList<>();

    public static void main(String[] args) {

        studentMap.put("S0",new Student());
        studentMap.put("S1",new Student());
        studentMap.put("S2",new Student());

        instructorMap.put("I0",new Instructor());
        instructorMap.put("I1",new Instructor());
        for(int i=0;i<studentMap.size();i++){
            studentMap.get("S"+i).setName("S"+i);
            studentMap.get("S"+i).setStudentID(i);
        }
        for(int i=0;i<instructorMap.size();i++){
            instructorMap.get("I"+i).setName("I"+i);
            instructorMap.get("I"+i).setId(i);
        }
        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.println("Welcome to Backpack\n" +
                    "1. Enter as instructor\n" +
                    "2. Enter as student\n" +
                    "3. Exit");
             int n = scn.nextInt();
             if (n==1){
                 System.out.println("Instructors: ");
                 for(int i=0;i<instructorMap.size();i++){
                     System.out.println(i+" - "+"I"+i);
                 }
                 int a = scn.nextInt();
                 for(String i : instructorMap.keySet()){
                     if(i.equals("I"+a)){
                     while(true){
                             System.out.println("Welcome I"+a);
                             System.out.println("INSTRUCTOR MENU\n" +
                                     "1. Add class material\n" +
                                     "2. Add assessments\n" +
                                     "3. View lecture materials\n" +
                                     "4. View assessments\n" +
                                     "5. Grade assessments\n" +
                                     "6. Close assessment\n" +
                                     "7. View comments\n" +
                                     "8. Add comments\n" +
                                     "9. Logout");
                             int b = scn.nextInt();
                             if (b==1){
                                 System.out.println("1. Add Lecture Slide\n" +
                                         "2. Add Lecture Video");
                                 int c = scn.nextInt();
                                 if(c==1){
                                     Lectures obj = new Lectures();
                                     System.out.println("Enter topic of slides: ");
                                     String topic = scn.nextLine();
                                     scn.nextLine();
                                     System.out.println("Enter Number of slides: ");
                                     int numOfSlides = scn.nextInt();
                                     obj.setInstructorName("I"+a);
                                     obj.setNumOfSlides(numOfSlides);
                                     obj.setTopic(topic);
                                     obj.setVideo(false);
                                     obj.setD(new Date());
                                     scn.nextLine();
                                     for(int j=0;j<numOfSlides;j++){
                                         System.out.println("Content of slide "+j+1+": ");
                                         String content = scn.nextLine();
                                         obj.setLecturesMaterialRecord(content);
                                     }
                                     lecturesRecord.add(obj);
                                 }

                                 else if (c==2){
                                     Lectures obj = new Lectures();
                                     System.out.println("Enter topic of video: ");
                                     String topic = scn.nextLine();
                                     scn.nextLine();
                                     System.out.println("Enter filename of video: ");
                                     String fileName = scn.nextLine();

                                     if(fileName.substring(fileName.length()-4).equals(".mp4") && fileName.length()>4){
                                         obj.setLecturesMaterialRecord(fileName);
                                         obj.setVideo(true);
                                         obj.setD(new Date());
                                         obj.setTopic(topic);
                                         obj.setInstructorName(i);
                                         lecturesRecord.add(obj);
                                     }

                                     else{
                                         System.out.println("Video Format Should be .mp4");
                                         break;
                                     }
                                 }
                                 else {
                                     break;
                                 }


                             }
                             else if (b==2){

                                 System.out.println("1. Add Assignment\n" +
                                         "2. Add Quiz");
                                 int c = scn.nextInt();
                                 if (c==1){

                                     Assessments obj = new Assessments();
                                     System.out.println("Enter Problem Statement: ");
                                     scn.nextLine();
                                     String prob = scn.nextLine();
                                     obj.setProblem(prob);

                                     System.out.println("Enter max marks: ");
                                     int maxMarks = scn.nextInt();
                                     obj.setMaxMarks(maxMarks);
                                     obj.setD(new Date());
                                     obj.setInstructorName("I"+a);
                                     assessmentsRecord.add(obj);
                                     obj.setAssID(assessmentsRecord.indexOf(obj));
                                     for(int k=0;k<studentMap.size();k++){
                                         studentMap.get("S"+k).setStatusMap(obj,0);
                                         studentMap.get("S"+k).setSubmissionMap(obj,0);
                                     }



                                 }
                                 else if(c==2){

                                     Assessments obj = new Assessments();
                                     System.out.println("Enter quiz question: ");
                                     scn.nextLine();
                                     String question = scn.nextLine();
                                     obj.setInstructorName("I"+a);
                                     obj.setProblem(question);
                                     obj.setD(new Date());
                                     obj.setQuiz(true);
                                     assessmentsRecord.add(obj);
                                     obj.setAssID(assessmentsRecord.indexOf(obj));
                                     for(int k=0;k<studentMap.size();k++){
                                         studentMap.get("S"+k).setStatusMap(obj,0);
                                     }


                                 }
                                 else {
                                     System.out.println("Wrong Input ");
                                     break;
                                 }

                             }
                             else if (b==3){
                                 instructorMap.get(i).viewLecture();

                             }
                             else if (b==4){
                                 instructorMap.get(i).viewAssessments();

                             }
                             else if (b==5){
                                 System.out.println("List of assesments");
                                 if(assessmentsRecord.size()!=0){
                                     for(Assessments l: assessmentsRecord){

                                         if(!l.isQuiz()){
                                             System.out.println("ID: "+l.getAssID()+" Assignment: "+l.getProblem()+" Max Marks: "+l.getMaxMarks());
                                             System.out.println("----------------");
                                         }
                                         else if (l.isQuiz()){
                                             System.out.println("ID: "+l.getAssID()+" Question: "+l.getProblem());
                                             System.out.println("----------------");
                                         }
                                     }
                                     System.out.println("Enter ID of assessment to view submissions: ");
                                     int id = scn.nextInt();
                                     
                                     if(studentMap.get(i).getSubmissionMap().size()!=0){
                                         System.out.println("Choose ID from these ungraded submissions");
                                         for(Assessments l : studentMap.get(i).getSubmissionMap().keySet()){
                                             if (l.getAssID()==id){
                                                 for(Student s : l.getsubMap().keySet()){
                                                     System.out.println(s.getStudentID()+"."+s.getName());
                                                 }

                                             }
                                         }

                                         int e = scn.nextInt();
                                         System.out.println("Submission: ");
                                         for(Assessments l : studentMap.get(i).getSubmissionMap().keySet()){
                                             if (l.getAssID()==id){
                                                 for(Student s : l.getsubMap().keySet()){
                                                     if(s.getStudentID()==e){
                                                         System.out.println("Submission: "+l.getsubMap().get(s));
                                                         System.out.println("-------------------------------");
                                                         System.out.println("Max Marks: "+l.getMaxMarks());

                                                     }
                                                 }
                                             }
                                         }
                                         System.out.println("Marks Scored: ");
                                         int marks = scn.nextInt();
                                         for(Assessments l : studentMap.get(i).getSubmissionMap().keySet()){
                                             if (l.getAssID()==id){
                                                 for(Student s : l.getsubMap().keySet()){
                                                     if(s.getStudentID()==e){
                                                         l.setGradeMap(s,marks);
                                                         s.setStatusMap(l,1);

                                                     }
                                                 }
                                             }
                                         }

                                     }
                                     else{
                                         System.out.println("No assessment to submit");

                                     }

                                 }
                                 else{
                                     System.out.println("No assessment to submit");
                                 }

                             }
                             else if (b==6){
                                 System.out.println("List of Open Assignments: ");
                                 for(Assessments l: studentMap.get("S0").getSubmissionMap().keySet()){ //printing open ass
                                     if(studentMap.get("S0").getSubmissionMap().get(l)==0){
                                         if(!l.isQuiz()){
                                             System.out.println("ID: "+l.getAssID()+" Assignment: "+l.getProblem()+" Max Marks: "+l.getMaxMarks());
                                             System.out.println("----------------");
                                         }
                                         else if (l.isQuiz()){
                                             System.out.println("ID: "+l.getAssID()+" Question: "+l.getProblem());
                                             System.out.println("----------------");
                                         }
                                     }
                                 }
                                 System.out.println("Enter ID of assignment to close: ");
                                 int id = scn.nextInt();
                                 for(int k=0;k<studentMap.size();k++){ //closing ass
                                     for(Assessments l: studentMap.get("S"+k).getSubmissionMap().keySet()){
                                         if(l.getAssID()==id){
                                             studentMap.get("S"+k).getSubmissionMap().put(l,-1);
                                         }
                                     }
                                 }
                             }
                             else if (b==7){
                                 instructorMap.get(i).viewComments();
                             }
                             else if (b==8){
                                 instructorMap.get(i).addComments(i);
                             }
                             else if (b==9){
                                 break;
                             }



                         }
                     }
                 }

             }
             else if (n==2){
                 System.out.println("Students: ");
                 for(int i=0;i<studentMap.size();i++){
                     System.out.println(i+" - "+"S"+i);
                 }
                 int a = scn.nextInt();
                 for(String i : studentMap.keySet()){
                     if (i.equals("S"+a)){
                         while (true){
                             System.out.println("Welcome S"+a);
                             System.out.println("STUDENT MENU\n" +
                                     "1. View lecture materials\n" +
                                     "2. View assessments\n" +
                                     "3. Submit assessment\n" +
                                     "4. View grades\n" +
                                     "5. View comments\n" +
                                     "6. Add comments\n" +
                                     "7. Logout");
                             int b = scn.nextInt();
                             if (b==1){
                                 studentMap.get(i).viewLecture();
                             }
                             else if (b==2){
                                 studentMap.get(i).viewAssessments();
                             }
                             else if (b==3){
                                 if(studentMap.get(i).getSubmissionMap().size()!=0){
                                     System.out.println("Pending assessments");
                                     for(Assessments temp: studentMap.get(i).getSubmissionMap().keySet()){
                                         if(studentMap.get(i).getSubmissionMap().get(temp)==0){
                                             if(!temp.isQuiz()){
                                                 System.out.println("ID: "+temp.getAssID()+" Assignment: "+temp.getProblem()+" Max Marks: "+temp.getMaxMarks());

                                             }
                                             else if (temp.isQuiz()){
                                                 System.out.println("ID: "+temp.getAssID()+" Question: "+temp.getProblem());
                                             }
                                         }
                                     }
                                     System.out.println("Enter ID of assessment: ");
                                     int id = scn.nextInt();
                                     System.out.println("Enter File name of assessment: ");
                                     scn.nextLine();//submitting the ass
                                     String fileName = scn.nextLine();
                                     if(fileName.substring(fileName.length()-4).equals(".zip") && fileName.length()>4){
                                         for(Assessments temp: studentMap.get(i).getSubmissionMap().keySet()){
                                             if(studentMap.get(i).getSubmissionMap().get(temp)==0){
                                                 temp.setsubMap(studentMap.get(i),fileName);
                                             }
                                         }

                                         for(Assessments temp: studentMap.get(i).getSubmissionMap().keySet()){ //changing the status
                                             if(temp.getAssID()==id){
                                                 studentMap.get(i).getSubmissionMap().put(temp,1);
                                             }
                                         }
                                     }
                                     else{
                                         System.out.println("File format should be .zip");
                                         break;
                                     }
                                 }

                             }
                             else if (b==4){
                                 System.out.println("Graded Submissions");
                                 for(Assessments as : studentMap.get(i).getSubmissionMap().keySet()){
                                     if(studentMap.get(i).getSubmissionMap().get(as)==1){
                                         System.out.println("gg1");
                                         if(studentMap.get(i).getStatusMap().get(as)==1){
                                             System.out.println("gg2");
                                             System.out.println("Submission: " +as.getsubMap().get(studentMap.get(i)));
                                             System.out.println("Marks Scored: "+as.getgradeMap().get(studentMap.get(i)));
                                         }
                                     }
                                 }
                                 System.out.println("Ungraded Submissions");
                                 for(Assessments as : studentMap.get(i).getSubmissionMap().keySet()){
                                     if(studentMap.get(i).getSubmissionMap().get(as)==0){
                                         if(studentMap.get(i).getStatusMap().get(as)==1){
                                             System.out.println("Submission: " +as.getsubMap().get(studentMap.get(i)));
                                         }
                                     }
                                 }


                             }
                             else if (b==5){
                                 studentMap.get(i).viewComments();

                             }
                             else if (b==6){
                                 studentMap.get(i).addComments(i);

                             }
                             else if (b==7){
                                 break;

                             }
                         }

                     }


                 }


             }
             else if (n==3){
                 break;
             }

        }
        
    }
}
