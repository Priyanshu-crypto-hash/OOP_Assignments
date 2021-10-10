package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Vaccine{
    private String name;
    private int num;
    private int gap;
    private int serialNum;

    public int getSerialNum() {
        return serialNum+1;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

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
    private int slots;
    private long citizenID;
    private int quantity;




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

     public void setSlots(int slots) {
         this.slots = slots;
     }
 }
 class Citizens{
    private String name;
    private String vacGiven;
    private int totalDoses;
    private int age;
    private long uniqueID;
    private String status;
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
    public int getage(){
        return age;
    }
    public long getUniqueID(){
        return uniqueID;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setUniqueID(long uniqueID){
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
    public void regHospital(){

}
    public void makeSlots(){
    }

    public void regCititzen(){
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int vaccinecounter=0;
        int slotCounter=0;

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
                            obj.setSerialNum(vaccinecounter);
                            vacRecord.add(obj);

                        }
                        else {
                            System.out.println("Vaccine Name: " + name + ", Number of Doses: " + num + ", Gap Between Doses: " + 0);
                            Vaccine obj = new Vaccine();
                            obj.setGap(0);
                            obj.setName(name);
                            obj.setNum(num);
                            obj.setSerialNum(vaccinecounter);
                            vacRecord.add(obj);

                        }
                        vaccinecounter+=1;
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
                    long uniqueID = scn.nextLong();
                    System.out.println("Citizen Name: "+name+", Age: "+age+", Unique ID: "+uniqueID);
                    if (age<18){
                        System.out.println("Only above 18 are allowed\n" +
                                "--------------------------------");
                    }
                    Citizens obj = new Citizens();
                    obj.setAge(age);
                    obj.setName(name);
                    obj.setStatus("REGISTERED");
                    obj.setUniqueID(uniqueID);
                    citizenRecord.add(obj);
                    System.out.println("---------------------------------");
                }
                else if (n==4){
                    int var=0;
                    Hospital obj1= new Hospital();
                    String vaccine;
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
                        for(Vaccine temp : vacRecord ){
                            System.out.println(temp.getSerialNum()+". "+temp.getName());
                        }
                        int m = scn.nextInt();
                        for(Vaccine temp : vacRecord){
                            if(m==temp.getSerialNum()){
                                vaccine = temp.getName();
                                Slots obj = new Slots();
                                obj.setHospitalID(hospitalID);
                                obj.setVacname(vaccine);
                                for(Slots temp1: slotsRecord){
                                    if (temp1.getHospitalID().equals(hospitalID) && temp1.getDay()==dayNum && temp1.getVacname().equals(vaccine)){
                                        obj.setQuantity(obj.getQuantity()+quantity);
                                        System.out.println("Slots added by Hospital " + hospitalID + " for Day: " + dayNum + ", Available Quantity: " + temp1.getQuantity()+quantity + " of Vaccine " + vaccine);
                                    }
                                    else{
                                        obj.setQuantity(quantity);
                                        System.out.println();
                                    }
                                }
                                obj.setDay(dayNum);
                                slotsRecord.add(obj);
                                obj1.setSlotsrec(obj);
                            }
                        }
                    }
                    System.out.println("---------------------------------");

                }
                else if (n==5){
                    String hospId;
                    int sno=0;
                    System.out.println("Enter patient Unique ID: ");
                    long uniqueID = scn.nextLong();
                    System.out.println("1. Search by area\n" +
                            "2. Search by Vaccine\n" +
                            "3. Exit");
                    System.out.println("Enter option: ");
                    int opt = scn.nextInt();
                    if (opt ==1){
                        System.out.println("Enter Pin Code: ");
                        int pinCode = scn.nextInt();
                        for(Hospital temp: hospitalRecord){
                            if (pinCode==temp.getPin()){
                                System.out.println(temp.getUniqueID()+" "+temp.getName());
                            }

                        }
                        System.out.println("Enter Hospital ID: ");
                        hospId=scn.next();
                        for(Slots temp: slotsRecord ){
                            if (temp.getHospitalID().equals(hospId)){
                                System.out.println(sno+"->Day: "+temp.getDay()+" Vaccine: "+temp.getVacname()+" Available Qty: "+ temp.getQuantity());
                                sno+=1;
                            }
                        }
                        int choice = scn.nextInt();

                        break;
                    }
                    else if (opt == 2){
                        System.out.println("Enter Vaccine name: ");
                        String VacName=scn.next();
                        for(Vaccine temp: vacRecord){
                            for(Hospital temp1 : hospitalRecord){
                                for(Slots temp2: temp1.getSlotsrec()){
                                    if(VacName.equals(temp2.getVacname())){
                                        System.out.println(temp2.getHospitalID()+" "+temp1.getName());
                                    }
                                }
                            }
                        }
                        System.out.println("Entry Hospital ID: ");
                        hospId=scn.next();
                        for(Slots temp: slotsRecord ){
                            if (temp.getHospitalID().equals(hospId)){
                                System.out.println(sno+"->Day: "+temp.getDay()+" Vaccine: "+temp.getVacname()+" Available Qty: "+ temp.getQuantity());
                            }
                        }
                        break;
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

                }
                else if (n==7){
                    System.out.println("Enter Patient ID: ");
                    int patientID = scn.nextInt();
                    for (Citizens temp : citizenRecord){
                        if (temp.getStatus().equals("REGISTERED")){
                            System.out.println("Citizen REGISTERED");
                        }
                        else if (temp.getStatus().equals("FULLY VACCINATED")){
                            System.out.println("FULLY VACCINATED");
                        }
                        else if (temp.getStatus().equals("PARTIALLY VACCINATED")){
                            System.out.println("PARTIALLY VACCINATED");
                        }

                    }

                    System.out.println("---------------------------------");
                }
            }
        }
    }
}
