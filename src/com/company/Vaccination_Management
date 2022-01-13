package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Vaccine{
    private String name;
    private int num;
    private int gap;




    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getGap() {
        return gap;
    }
    public void setGap(int gap) {
        this.gap = gap;
    }
//
//    public Vaccine (String name,int num,int gap){
//        this.name = name;
//        this.num = num;
//        this.gap=gap;
//    }
}
class Hospital{
    private String name;
    private int pin;
    private String uniqueID ;
    private ArrayList<Slots> slotsrec = new ArrayList<>();

    public ArrayList<Slots> getSlotsrec() {
        return slotsrec;
    }

    public void setSlotsrec(Slots arg1) {
        slotsrec.add(arg1);
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setName(String name){
        this.name=name;
    }



//    Hospital(String name,int pin,int uniqueID){
//        this.name=name;
//        this.pin=pin;
//        this.uniqueID=uniqueID;
//    }
}
 class Slots{

    private String vacname;
    private int day;
    private int doses;
    private int gap;
    private String hospitalID;


    private int quantity;

     private int doseCounter;

     public void setDoseCounter(){
         this.doseCounter+=1;
     }
     public void setHospitalID(String hospitalID) {
         this.hospitalID = hospitalID;
     }


     public int getDay() {
         return day;
     }

     public void setDay(int day) {

         this.day = day;
     }


     public int getGap() {
         return gap;
     }

     public void setGap(int gap) {
         this.gap = gap;
     }

     public String getVacname() {
         return vacname;
     }

     public void setVacname(String vacname) {
         this.vacname = vacname;
     }

     public int getDoses() {
         return doses;
     }

     public void setDoses(int doses) {
         this.doses = doses;
     }

     public int getQuantity() {
         return quantity;
     }

     public void setQuantity(int quantity) {
         this.quantity = quantity;

     }

     public String getHospitalID() {
         return hospitalID;
     }

 }
 class Citizens{
    private String name;
    private String vacGiven;
    private int givenDoses;
    private int totalDoses;
    private int day;
    private int gap;
     private String uniqueID;
     private String status;
    private int  dueDate;

     public int getDueDate() {
         return dueDate;
     }

     public void setDueDate(int dueDate) {
         this.dueDate = dueDate;
     }

     public void setGivenDoses() {
         this.givenDoses+=1;
     }

     public int getGivenDoses() {
         return givenDoses;
     }

     public void setGap(int gap) {
         this.gap = gap;
     }

     public int getGap() {
         return gap;
     }

     public int getDay() {
         return day;
     }

     public void setDay(int day) {
         this.day = day;
     }


    public String getStatus(){
        return status;
    }

     public String getVacGiven() {
         return vacGiven;
     }

     public void setVacGiven(String vacGiven) {
         this.vacGiven = vacGiven;
     }

     public int getTotalDoses() {
         return totalDoses;
     }

     public void setTotalDoses(int totalDoses) {
         this.totalDoses = totalDoses;
     }

     public void setStatus(String status) {
         this.status =status;
     }
     public String getname(){
        return name;
    }

    public String getUniqueID(){
        return uniqueID;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setUniqueID(String uniqueID){
        this.uniqueID=uniqueID;
    }

//    Citizens(String name,int age,long uniqueID){
//        this.name=name;
//        this.age=age;
//        this.uniqueID=uniqueID;
//    }
}

public class Main {
    public static ArrayList<Vaccine> vacRecord = new ArrayList<Vaccine>();
    public static ArrayList<Hospital> hospitalRecord = new ArrayList<Hospital>();
    public static ArrayList<Citizens> citizenRecord = new ArrayList<Citizens>();
    public static  ArrayList<Slots> slotsRecord = new ArrayList<Slots>();
    public static int hospitalIdCounter =0;
    public static long citizenIDCounter =0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("CoWin Portal initialized....\n" +
                "---------------------------------\n" +
                "1. Add Vaccine\n" +
                "2. Register Hospital\n" +
                "3. Register Citizen\n" +
                "4. Add Slot for Vaccination\n" +
                "5. Book Slot for Vaccination\n" +
                "6. List all slots for a hospital\n" +
                "7. Check Vaccination Status\n" +
                "8. Exit\n" +
                "---------------------------------");
        while(true){
            int n;
            n=scn.nextInt();
            if(n==8){
                break;
            }
            else{

                if (n==1){
                        int gap;
                        System.out.println("Vaccine Name: ");
                        String name = scn.next();
                        System.out.println("Number of Doses: ");
                        int num = scn.nextInt();
                        if (num!=1){
                            System.out.println("Gap between Doses: ");
                            gap = scn.nextInt();
                            System.out.println("Vaccine Name: "+name+", Number of Doses: "+num+", Gap Between Doses: "+gap);
                            Vaccine obj = new Vaccine();
                            obj.setGap(gap);
                            obj.setName(name);
                            obj.setNum(num);

                            vacRecord.add(obj);

                        }
                        else {
                            System.out.println("Vaccine Name: " + name + ", Number of Doses: " + num + ", Gap Between Doses: " + 0);
                            Vaccine obj = new Vaccine();
                            obj.setGap(0);
                            obj.setName(name);
                            obj.setNum(num);

                            vacRecord.add(obj);

                        }

                    System.out.println("---------------------------------");
                }
                else if (n==2){

                    System.out.println("Hospital Name: ");
                    String name = scn.next();
                    hospitalIdCounter+=1;
                    int uniqueId = 100000+hospitalIdCounter;
                    String uniquehospID =String.valueOf(uniqueId);
                    System.out.println("Pincode: ");
                    int pin = scn.nextInt();
                    System.out.println("Hospital Name: "+name+", Pincode: "+pin+", Unique ID: "+uniqueId);
                    Hospital obj = new Hospital();
                    obj.setName(name);
                    obj.setPin(pin);
                    obj.setUniqueID(uniquehospID);
                    hospitalRecord.add(obj);
                    System.out.println("---------------------------------");

                }
                else if (n==3){
                    citizenIDCounter+=1;
                    System.out.println("Citizen Name: ");
                    String name = scn.next();
                    System.out.println("Age: ");
                    int age = scn.nextInt();
                    System.out.println("Unique ID: ");
                    String uniqueID = scn.next();
                    System.out.println("Citizen Name: "+name+", Age: "+age+", Unique ID: "+uniqueID);
                    if (age<18){
                        System.out.println("Only above 18 are allowed\n" +
                                "--------------------------------");
                    }
                    Citizens obj = new Citizens();


                    obj.setName(name);
                    obj.setStatus("REGISTERED");
                    obj.setUniqueID(uniqueID);
                    citizenRecord.add(obj);
                    System.out.println("---------------------------------");
                }
                else if (n==4){

                    System.out.println("Enter Hospital ID: ");
                    String hospitalID = scn.next();
                    System.out.println("Enter number of slots to be added: ");
                    int slots = scn.nextInt();
                    for (int i=0;i<slots;i++) {
                        System.out.println("Enter Day Number: ");
                        int dayNum = scn.nextInt();
                        System.out.println("Enter Quantity: ");
                        int quantity = scn.nextInt();
                        System.out.println("Select Vaccine");
                        for(int j =0;j<vacRecord.size();j++){
                            System.out.println(j+". "+vacRecord.get(j).getName());
                        }
                        int m = scn.nextInt();
                        for(int l=0;l<hospitalRecord.size();l++){
                            boolean flag = true;
                            if (hospitalRecord.get(l).getUniqueID().equals(hospitalID)) {

                                Slots obj3 = new Slots();

                                for (int r = 0; r < hospitalRecord.get(l).getSlotsrec().size(); r++) {

                                    if (hospitalRecord.get(l).getSlotsrec().get(r).getVacname().equals(vacRecord.get(m).getName()) && hospitalRecord.get(l).getSlotsrec().get(r).getDay() == dayNum)
                                    {

                                        hospitalRecord.get(l).getSlotsrec().get(r).setQuantity(hospitalRecord.get(l).getSlotsrec().get(r).getQuantity() + quantity);
                                        flag = false;
                                    }
                                }
                                if (flag) {
                                    obj3.setDay(dayNum);
                                    obj3.setHospitalID(hospitalID);
                                    obj3.setVacname(vacRecord.get(m).getName());
                                    obj3.setDoses(vacRecord.get(m).getNum());
                                    obj3.setGap(vacRecord.get(m).getGap());
                                    slotsRecord.add(obj3);
                                    hospitalRecord.get(l).setSlotsrec(obj3);
                                    obj3.setQuantity(quantity);
                                }



                            }
                        }

                        for(int p =0;p<hospitalRecord.size();p++){
                            if (hospitalRecord.get(p).getUniqueID().equals(hospitalID)){

                                for(int s=0;s<hospitalRecord.get(p).getSlotsrec().size();s++){

                                        if(hospitalRecord.get(p).getSlotsrec().get(s).getVacname().equals(vacRecord.get(m).getName()) &&hospitalRecord.get(p).getSlotsrec().get(s).getDay()==dayNum){

                                        System.out.println("Slots added by Hospital " + hospitalID + " for Day: " + dayNum + ", Available Quantity: " + hospitalRecord.get(p).getSlotsrec().get(s).getQuantity() + " of Vaccine " + hospitalRecord.get(p).getSlotsrec().get(s).getVacname());
                                    }

                                }
                            }

                        }
                    }
                    System.out.println("---------------------------------");
                }
                else if (n==5){
                    String hospId;
                    System.out.println("Enter patient Unique ID: ");
                    String uniqueID = scn.next();
                    System.out.println("1. Search by area\n" +
                            "2. Search by Vaccine\n" +
                            "3. Exit");
                    System.out.println("Enter option: ");
                    int opt = scn.nextInt();
                    if (opt ==1){
                        ArrayList<Slots> tempList = new ArrayList<>();
                        System.out.println("Enter Pin Code: ");
                        int pinCode = scn.nextInt();
                        for(Hospital temp: hospitalRecord){
                            if (pinCode==temp.getPin()){
                                System.out.println(temp.getUniqueID()+" "+temp.getName());
                            }
                        }
                        System.out.println("Enter Hospital ID: ");
                        hospId=scn.next();
                        Citizens c = null;
                        for(Citizens temp1: citizenRecord){
                            if(temp1.getUniqueID().equals(uniqueID)){
                                c=temp1;
                            }
                        }
                        for(Slots temp: slotsRecord ){
                            if (temp.getHospitalID().equals(hospId)&&temp.getDay()>=c.getDueDate() && (temp.getVacname().equals(c.getVacGiven())||c.getGivenDoses()==0)){
                                tempList.add(temp);
                            }
                        }

                        if(tempList.size()==0){
                            System.out.println("NO slot available");
                        }

                        else {
                            for (int i = 0; i < tempList.size(); i++) {
                                System.out.println(i + "->Day: " + tempList.get(i).getDay() + " Vaccine: " + tempList.get(i).getVacname() + " Available Qty: " + tempList.get(i).getQuantity());
                            }

                            System.out.println("Choose Slot: ");
                            int choice = scn.nextInt();
                            for (int i = 0; i < citizenRecord.size(); i++) {
                                if (uniqueID.equals(citizenRecord.get(i).getUniqueID())) {

                                    citizenRecord.get(i).setVacGiven(tempList.get(choice).getVacname());
                                    citizenRecord.get(i).setDay(tempList.get(choice).getDay());
                                    citizenRecord.get(i).setGap(tempList.get(choice).getGap());


                                    System.out.println(citizenRecord.get(i).getname() + " Vaccinated with " + tempList.get(choice).getVacname());
                                    citizenRecord.get(i).setGivenDoses();
                                    citizenRecord.get(i).setDueDate(tempList.get(choice).getDay() + citizenRecord.get(i).getGap());
                                    for (int w = 0; w < hospitalRecord.size(); w++) { //decrease quantity
                                        if (hospId.equals(hospitalRecord.get(w).getUniqueID())) {
                                            for (int e = 0; e < hospitalRecord.get(w).getSlotsrec().size(); e++) {
                                                if (hospitalRecord.get(w).getSlotsrec().get(e).getVacname().equals(vacRecord.get(choice).getName()) && hospitalRecord.get(w).getSlotsrec().get(e).getDay() == tempList.get(choice).getDay()) {
                                                    hospitalRecord.get(w).getSlotsrec().get(e).setQuantity(hospitalRecord.get(w).getSlotsrec().get(e).getQuantity() - 1);
                                                }
                                            }
                                        }
                                    }


                                    for (int j = 0; j < vacRecord.size(); j++) {
                                        if (vacRecord.get(j).getName().equals(tempList.get(choice).getVacname())) {
                                            citizenRecord.get(i).setTotalDoses(tempList.get(choice).getDoses());
                                            //System.out.println(tempList.get(choice).getDoses());
                                        }
                                    }

                                    for (int j = 0; j < citizenRecord.size(); j++) {
                                        if (vacRecord.get(choice).getName().equals(tempList.get(choice).getVacname())) {
                                            if (vacRecord.get(choice).getGap() == 0 && citizenRecord.get(j).getTotalDoses() == 1) {
                                                citizenRecord.get(j).setStatus("FULLY VACCINATED");
                                            } else {
                                                if (citizenRecord.get(j).getGivenDoses() < citizenRecord.get(j).getTotalDoses()) {
                                                    citizenRecord.get(j).setStatus("PARTIALLY VACCINATED");


                                                } else if (citizenRecord.get(j).getTotalDoses() == citizenRecord.get(j).getGivenDoses()) {
                                                    citizenRecord.get(j).setStatus("FULLY VACCINATED");
                                                }


                                            }

                                        }
                                    }
                                }
                            }
                        }


                        }
                    else if (opt == 2){
                        ArrayList<Slots> tempList = new ArrayList<>();
                        System.out.println("Enter Vaccine name: ");
                        String VacName=scn.next();

                            for(Hospital temp1 : hospitalRecord){
                                for(Slots temp2: temp1.getSlotsrec()){
                                    if(VacName.equals(temp2.getVacname())){
                                        System.out.println(temp2.getHospitalID()+" "+temp1.getName());

                                    }
                                }
                            }

                        System.out.println("Enter Hospital ID: ");
                        hospId=scn.next();
                        Citizens c = null;
                        for(Citizens temp1: citizenRecord){
                            if(temp1.getUniqueID().equals(uniqueID)){
                                c=temp1;
                            }
                        }
                        for(Slots temp: slotsRecord ){
                            if (temp.getHospitalID().equals(hospId)&&temp.getDay()>=c.getDueDate() && (temp.getVacname().equals(VacName))){
                                tempList.add(temp);
                            }
                        }
                        for(int i =0;i<tempList.size();i++){

                            System.out.println(i+"->Day: "+tempList.get(i).getDay()+" Vaccine: "+tempList.get(i).getVacname()+" Available Qty: "+ tempList.get(i).getQuantity());
                        }

                        if(tempList.size()==0){
                            System.out.println("NO slot available");
                        }

                        else{System.out.println("Choose Slot: ");
                        int choice = scn.nextInt();

                        for(int i =0;i<citizenRecord.size();i++){
                            if (uniqueID.equals(citizenRecord.get(i).getUniqueID())){
                                citizenRecord.get(i).setVacGiven(tempList.get(choice).getVacname());
                                citizenRecord.get(i).setDay(tempList.get(choice).getDay());
                                citizenRecord.get(i).setGap(tempList.get(choice).getGap());
                                System.out.println(citizenRecord.get(i).getname()+" Vaccinated with "+tempList.get(choice).getVacname());
                                citizenRecord.get(i).setGivenDoses();

                                citizenRecord.get(i).setDueDate(tempList.get(choice).getDay()+citizenRecord.get(i).getGap());
                                for(int w=0;w<hospitalRecord.size();w++){ //decrease quantity
                                    if(hospId.equals(hospitalRecord.get(w).getUniqueID())){
                                        for(int e=0;e<hospitalRecord.get(w).getSlotsrec().size();e++){
                                            if(hospitalRecord.get(w).getSlotsrec().get(e).getVacname().equals(vacRecord.get(choice).getName()) &&hospitalRecord.get(w).getSlotsrec().get(e).getDay()==tempList.get(choice).getDay()){
                                                hospitalRecord.get(w).getSlotsrec().get(e).setQuantity(hospitalRecord.get(w).getSlotsrec().get(e).getQuantity()-1);
                                            }
                                        }
                                    }
                                }

                                for(int j=0;j<vacRecord.size();j++){
                                    if (vacRecord.get(j).getName().equals(tempList.get(choice).getVacname())){
                                        citizenRecord.get(i).setTotalDoses(tempList.get(choice).getDoses());
                                    }
                                }
                                for (int j = 0; j < citizenRecord.size(); j++) {
                                    if (vacRecord.get(choice).getName().equals(tempList.get(choice).getVacname())) {
                                        if (vacRecord.get(choice).getGap() == 0 && citizenRecord.get(j).getTotalDoses() == 1) {
                                            citizenRecord.get(j).setStatus("FULLY VACCINATED");
                                        } else {
                                            if (citizenRecord.get(j).getGivenDoses() < citizenRecord.get(j).getTotalDoses()) {
                                                citizenRecord.get(j).setStatus("PARTIALLY VACCINATED");


                                            } else if (citizenRecord.get(j).getTotalDoses() == citizenRecord.get(j).getGivenDoses()) {
                                                citizenRecord.get(j).setStatus("FULLY VACCINATED");
                                            }


                                        }

                                    }
                                }

                            }
                        }}

                    }
                    else if (opt ==3){
                        break;

                    }
                    System.out.println("---------------------------------");

                }
                else if (n==6){
                    System.out.println("Enter Hospital Id: ");
                    String hospID =scn.next();
                    for(Slots temp: slotsRecord ){
                        if (temp.getHospitalID().equals(hospID)){
                            System.out.println("Day: "+temp.getDay()+" Vaccine: "+temp.getVacname()+" Available Qty: "+ temp.getQuantity());
                        }
                    }
                    System.out.println("---------------------------------");
                }
                else if (n==7){
                    System.out.println("Enter Patient ID: ");
                    String patientID = scn.next();

                    for (Citizens temp : citizenRecord){
                        if (temp.getUniqueID().equals(patientID)){
                            if (temp.getStatus().equals("REGISTERED")){
                                System.out.println("Citizen REGISTERED");
                            }
                            else if (temp.getStatus().equals("FULLY VACCINATED") &&temp.getGivenDoses()==temp.getTotalDoses()){
                                System.out.println("FULLY VACCINATED");
                                System.out.println("Vaccine Given: ");
                                System.out.println(temp.getVacGiven());
                                System.out.println("Number of Doses given: "+temp.getGivenDoses());

                            }
                            else if (temp.getStatus().equals("PARTIALLY VACCINATED")){
                                System.out.println("PARTIALLY VACCINATED");
                                System.out.println("Vaccine Given: "+temp.getVacGiven());
                                System.out.println("Number of Doses given: "+temp.getGivenDoses());
                                System.out.println("Next Dose due date: ");
                                System.out.println(temp.getDueDate());

                            }
                        }
                    }

                    System.out.println("---------------------------------");

                }
            }
        }
    }
}
