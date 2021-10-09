package com.company;

import java.util.Scanner;


public class Main {
    int idCounter =0;

    public void addVaccine(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Vaccine Name: ");
        String name = scn.next();
        System.out.println("Number of Doses: ");
        int num = scn.nextInt();
        if (num!=1){
            System.out.println("Gap between Doses: ");
            int gap = scn.nextInt();
            System.out.println("Vaccine Name: "+name+", Number of Doses: "+num+", Gap Between Doses: "+gap);
        }
        else{
            System.out.println("Vaccine Name: "+name+", Number of Doses: "+num+", Gap Between Doses: "+0);
        }


}
public void regHospital(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Hospital Name: ");
        idCounter+=1;
        int uniqueId = 200000+idCounter;
        String name = scn.next();
        int pin = scn.nextInt();
        System.out.println("Hospital Name: "+name+", Pincode: "+pin);



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
