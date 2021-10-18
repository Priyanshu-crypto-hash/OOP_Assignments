
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
 interface client {
    void viewLecture();
    void viewAssessments();
    void viewComments();
    void addComments();
}
class Lectures{
     private String topic;
     private int numOfSlides;
     private String instructorName;
     private ArrayList<String> lecturesMaterialRecord = new ArrayList<>();
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
     private String problem;
     private int maxMarks;
     private String instructorName;
     private HashMap<Integer,String> assMap = new HashMap<>();
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
     private Lectures lectureRef;
    @Override
    public void addComments() {

    }

    @Override
    public void viewAssessments() {

    }

    @Override
    public void viewComments() {

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
    @Override
    public void addComments() {

    }

    @Override
    public void viewAssessments() {

    }

    @Override
    public void viewComments() {

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
    public void addClassMaterial(){

    }
    public void addAssessment(){

    }
    public void gradeAssessments(){

    }
    public void closeAssessments(){

    }

}
class discussion{

}


class ass2 {
     public static ArrayList<Lectures> lecturesRecord = new ArrayList<>();
     ArrayList<Student> studentsClient = new ArrayList<>();
    ArrayList<Student> instructorsClient = new ArrayList<>();
    HashMap<Integer,Instructor> instructorMap = new HashMap<>();
    HashMap<Integer,Student> studentMap = new HashMap<>();
    HashMap<Integer,Lectures> lecturesMap = new HashMap<>();
    HashMap<Integer,Assessments> assessmentsMap = new HashMap<>();
    public static void main(String[] args) {

        ArrayList<Instructor> instructorRecord = new ArrayList<>();
        ArrayList<Student> studentsRecord = new ArrayList<>();

        ArrayList<Assessments > assessmentsRecord = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to Backpack\n" +
                    "1. Enter as instructor\n" +
                    "2. Enter as student\n" +
                    "3. Exit");
             int n= scn.nextInt();
             if (n==1){
                 System.out.println("Instructors:\n" +
                         "0 - I0\n" +
                         "1 - I1");
                 int a = scn.nextInt();
                 while(true){
                     if(a==0){
                         System.out.println("Welcome I0");
                     }
                     else if (a==1){
                         System.out.println("Welcome I1");
                     }
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
                             System.out.println("Enter content of slides: ");
                             int numOfSlides = scn.nextInt();
                             if (a==0){
                                 obj.setInstructorName("I0");
                             }
                             else if(a==1){
                                 obj.setInstructorName("I1");
                             }
                             obj.setNumOfSlides(numOfSlides);
                             obj.setTopic(topic);
                             obj.setVideo(false);
                             obj.setD(new Date());
                             for(int i=0;i<numOfSlides;i++){
                                 System.out.println("Content of slide "+i+": ");
                                 String content = scn.nextLine();
                                 obj.setLecturesMaterialRecord(content);
                             }
                             lecturesRecord.add(obj);




                         }
                         else if (c==2){
                             Lectures obj = new Lectures();
                             System.out.println("Enter topic of video: ");
                             String topic = scn.nextLine();
                             System.out.println("Enter filename of video: ");
                             String fileName = scn.nextLine();
                             if(fileName.substring(fileName.length()-4).equals(".mp4")){
                                 obj.setLecturesMaterialRecord(fileName);
                                 obj.setVideo(true);
                                 obj.setD(new Date());
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
                             String prob = scn.nextLine();
                             obj.setProblem(prob);
                             System.out.println("Enter max marks: ");
                             int maxMarks = scn.nextInt();
                             obj.setMaxMarks(maxMarks);
                             obj.setD(new Date());
                             if (a==0){
                                 obj.setInstructorName("I0");

                             }
                             else if (a==1){
                                 obj.setInstructorName("I1");
                             }
                             assessmentsRecord.add(obj);


                         }
                         else if(c==2){
                             Assessments obj = new Assessments();
                             System.out.println("Enter quiz question: ");
                             String question = scn.nextLine();
                             obj.setProblem(question);
                             obj.setD(new Date());
                             

                         }
                         else {
                             System.out.println("Wrong Input ");
                             break;
                         }

                     }
                     else if (b==3){

                     }
                     else if (b==4){

                     }
                     else if (b==5){

                     }
                     else if (b==6){

                     }
                     else if (b==7){

                     }
                     else if (b==8){

                     }
                     else if (b==9){
                         break;
                     }



                 }



             }
             else if (n==2){
                 System.out.println("Students:\n" +
                         "0 - S0\n" +
                         "1 - S1\n" +
                         "2 - S2");
                 int a = scn.nextInt();
                 while (true){
                     if (a==0){
                         System.out.println("Welcome S0");

                     }
                     else if (a==1){
                         System.out.println("Welcome S1");

                     }
                     else if (a==2){
                         System.out.println("Welcome S2");

                     }
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

                     }
                     else if (b==2){

                     }
                     else if (b==3){

                     }
                     else if (b==4){

                     }
                     else if (b==5){

                     }
                     else if (b==6){

                     }
                     else if (b==7){

                     }
                     else if (b==8){
                         break;

                     }

                 }

             }
             else if (n==3){
                 break;
             }

        }
        
    }
}
