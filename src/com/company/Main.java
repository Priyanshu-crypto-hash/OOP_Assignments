package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ServiceLoader;


public class Main {
    ArrayList<Vaccine> vacRecord = new ArrayList<Vaccine>();
    ArrayList<Hospital> hospitalRecord = new ArrayList<Hospital>();
    ArrayList<Citizens> citizenRecord = new ArrayList<Citizens>();
    ArrayList<Slots> slotsRecord = new ArrayList<Slots>();
    public class Hospital{}
    public class Citizens{}
    public class Slots{}
    int hospitalIdCounter =0;
    long citizenIDCounter =0;
    public void addVaccine(){
        int gap;
        Scanner scn = new Scanner(System.in);
        System.out.println("Vaccine Name: ");
        String name = scn.next();
        System.out.println("Number of Doses: ");
        int num = scn.nextInt();
        if (num!=1){
            System.out.println("Gap between Doses: ");
            gap = scn.nextInt();
            System.out.println("Vaccine Name: "+name+", Number of Doses: "+num+", Gap Between Doses: "+gap);
            Vaccine obj = new Vaccine(name,num,gap);
        }
        else{
            System.out.println("Vaccine Name: "+name+", Number of Doses: "+num+", Gap Between Doses: "+0);
            Vaccine obj = new Vaccine(name,num,0);
        }
}
public class Vaccine{
        String name;
        int num;
        int gap;
        public Vaccine (String name,int num,int gap){
            this.name = name;
            this.num = num;
            this.gap=gap;
        }
}
    public void regHospital(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Hospital Name: ");
        hospitalIdCounter+=1;
        int uniqueId = 100000+hospitalIdCounter;
        String name = scn.next();
        int pin = scn.nextInt();
        System.out.println("Hospital Name: "+name+", Pincode: "+pin+", Unique ID: "+uniqueId);
}
    public void makeSlots(){
        String vaccine;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Hospital ID: ");
        int hospitalID = scn.nextInt();
        System.out.println("Enter number of slots to be added: ");
        int slots = scn.nextInt();
        for (int i=0;i<slots;i++){
        System.out.println("Enter Day Number: ");
        int dayNum = scn.nextInt();
        System.out.println("Enter Quantity: ");
        int quantity = scn.nextInt();
        System.out.println("Select Vaccine\n" +
                "0. Covax\n" +
                "1. Covi\n");
        int temp = scn.nextInt();
        if (temp==0){
            vaccine="Covax";
        }
        else{
            vaccine="Covi";
        System.out.println("Slots added by Hospital "+hospitalID+" for Day: "+dayNum+", Available Quantity: "+quantity+" of Vaccine "+vaccine);
    }
        }
    }
    public void regCititzen(){
        citizenIDCounter+=1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Citizen Name: ");
        String name = scn.next();
        System.out.println("Age: ");
        int age = scn.nextInt();
        System.out.println("Unique ID: ");
        long uniqueID = scn.nextLong();
        System.out.println("Citizen Name: "+name+", Age: "+age+", Unique ID: "+uniqueID);
        if (age>18){
            System.out.println("Only above 18 are allowed\n" +
                    "--------------------------------");
        }

    }

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
                "---------------------------------\n");
        while(true){
            int n;
            n=scn.nextInt();
            if(n==8){
                break;
            }
            else{

                if (n==1){

                }

                else if (n==2){

                }
                else if (n==3){

                }
                else if (n==4){

                }
                else if (n==5){

                }
                else if (n==6){

                }
                else if (n==7){

                }
            }
        }



    }
}
