package com.company;

import java.util.Scanner;


public class Main {
    public static Scanner scn = new Scanner(System.in);
    public void addVaccine(){
        String name = scn.next();
        int num = scn.nextInt();
        int gap = scn.nextInt();
}

    public static void main(String[] args) {

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
                else if (n==1){

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
