//Name:Yujia JI
//Student Number:A00246407
//Program Description: This small command-line program is to help users to
//convert between different forms of measurement. The supported units are
//"km-mi","cm-in","kg-lb","g-oz","F-C","cups-L". Upper and lower units are
//allowed. Int and Double numbers are allowed.
//Please make sure that the input should be entered step by step.
//All suggestions and comments are welcomed and contribute to improving the code.

import java.util.Scanner;

public class Convert{
    public static void main(String[] args){
        System.out.println("WELCOME TO CONVERTER");
        Scanner keyb = new Scanner(System.in);
        while(true){//loop program
            System.out.print("please enter a value to convert:");

            String input = keyb.nextLine();
            //first input number and identify.
            if(input.contains(".")){
                //case1: double input
                //STEP1: store double
                // System.out.println("It is Double" +input);
                double number = Double.valueOf(input);
                //STEP2: store and identify unit
                System.out.print("please enter current unit:");
                String units = keyb.nextLine().toLowerCase();
                // System.out.print("unit is"+units);

                if(units.equals("mi")){
                    System.out.println(number+"mi"+"="+1.61*number+"km");
                }else if(units.equals("in")){
                    System.out.print(number+"in"+"="+2.54*number+"cm");
                }else if(units.equals("lb")){
                    System.out.println(number+"lb"+"="+0.45*number+"kg");
                }else if(units.equals("oz")){
                    System.out.println(number+"oz"+"="+28.35*number+"g");
                }else if(units.equals("f")){
                    System.out.println(number+"F"+"="+(number-32)*5/9+"C");
                }else if(units.equals("cups")){
                    System.out.println(number+"cups"+"="+0.24*number+"L");
                }else if(units.equals("km")){
                    System.out.println(number+"km"+"="+0.62*number+"mi");
                }else if(units.equals("cm")){
                    System.out.println(number+"cm"+"="+0.39*number+"in");
                }else if(units.equals("kg")){
                    System.out.println(number+"kg"+"="+2.21*number+"lb");
                }else if(units.equals("g")){
                    System.out.println(number+"g"+"="+0.04*number+"oz");
                }else if(units.equals("l")){
                    System.out.println(number+"L"+"="+4.17*number+"cups");
                }else if(units.equals("c")){
                    System.out.println(number+"C"+"="+(number+273.15)+"K");
                }else{
                    System.out.println("Unit unavailable.");
                }

            }else{
                //case2: Int input
                //STEP1: store Int
                // System.out.println("It is int" +input);
                int number = Integer.valueOf(input);
                //STEP2: store and identify unit
                System.out.print("please enter current unit:");
                String units = keyb.nextLine().toLowerCase();

                if(units.equals("km")){
                    System.out.println(number+"km"+"="+0.62*number+"mi");
                }else if(units.equals("cm")){
                    System.out.println(number+"cm"+"="+0.39*number+"in");
                }else if(units.equals("kg")){
                    System.out.println(number+"kg"+"="+2.21*number+"lb");
                }else if(units.equals("g")){
                    System.out.println(number+"g"+"="+0.04*number+"oz");
                }else if(units.equals("l")){
                    System.out.println(number+"L"+"="+4.17*number+"cups");
                }else if(units.equals("c")){
                    System.out.println(number+"C"+" = "+(number+273.15)+"K");
                }else if(units.equals("mi")){
                    System.out.println(number+"mi"+"="+1.61*number+"km");
                }else if(units.equals("in")){
                    System.out.println(number+"in"+"="+2.54*number+"cm");
                }else if(units.equals("lb")){
                    System.out.println(number+"lb"+"="+0.45*number+"kg");
                }else if(units.equals("oz")){
                    System.out.println(number+"oz"+"="+28.35*number+"g");
                }else if(units.equals("f")){
                    System.out.println(number+"F"+"="+(number-32)*5/9+"C");
                }else if(units.equals("cups")){
                    System.out.println(number+"cups"+"="+0.24*number+"L");
                }else{
                    System.out.print("Unit unavailable.");
                }}//end of identify first input

        }//end of while true

    }}


//2021-09-27 YUJIA JI - FOR STUDY ONLY
