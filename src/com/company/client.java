
import java.util.HashMap;
import java.util.Scanner;
public interface client {
    void viewLecture();
    void viewAssessments();
    void viewComments();
    void addComments();
}
class Student implements client {
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
    HashMap<Integer,Instructor> instructorMap = new HashMap<>();
    HashMap<Integer,Student> studentMap = new HashMap<>();
    public static void main(String[] args) {

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
                     if (b==0){
                         
                     }
                     else if (b==1){
                         
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

                 }

             }
             else if (n==3){
                 break;
             }

        }
        
    }
}

