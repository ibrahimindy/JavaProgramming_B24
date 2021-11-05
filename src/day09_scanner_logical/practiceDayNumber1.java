package day09_scanner_logical;

import java.util.Scanner;

public class practiceDayNumber1 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double screensize;
        String cpu,resolution;
        int ram,memory;
        int price=0;

        String storageType;


        System.out.println("Select screen size:");
        screensize=scan.nextDouble();
        if(screensize==13.3){
            price+=200;
        }else if(screensize==15.0){
            price+=300;
        }else{
            price+=400;
        }

        System.out.println("Select CPU type:");
        scan.next();
        cpu=scan.nextLine();
        if(cpu.equals("i3")){
            price+=150;

        }else if(cpu.equals("i5")){
            price+=250;

        }else{
            price+=350;
        }




        System.out.println("Select RAM size:");
        ram=scan.nextInt();
        price+=(ram/4)*50;





        System.out.println("Select storage type:");


        storageType=scan.next();



        System.out.println("Enter memory size:");
        memory=scan.nextInt();

        if(storageType.equals("SSD")){
            price+=(memory/500)*50;
        }else{
            price+=(memory/500)*100;
        }


        System.out.println("Enter screen resolution:");
        scan.next();
        resolution=scan.nextLine();

        if(resolution.equals("FULLHD")){
            price+=100;
        }else{
            price+=200;
        }

        System.out.println("Laptop price is: $"+price);



    }




}
