//Name:Yujia JI
//Student Number:A00246407
//Program Description: This small command-line program is to help users to
//convert between different forms of measurement. The supported units are
//"km-mi","cm-in","kg-lb","g-oz","F-C","cups-L". Upper and lower units are
//allowed. Int and Double numbers are allowed.
//Please make sure that the input should be entered step by step.
//All suggestions and comments are welcomed and contribute to improving the code.
//This is a simplified version!

import java.util.Scanner;

public class Convert{
    public static void main(String[] args){

        String[][] unitData = {{"mi", "1.61","0","km"},
                                {"in", "2.54","0","cm"},
                                {"lb", "0.45","0","kg"},
                                {"oz", "28.35","0","g"},
                                {"f", "0.5556","-17.7778","C"},
                                {"cups", "0.24","0","L"},
                                {"km", "0.62","0","mi"},
                                {"cm", "0.39","0","in"},
                                {"kg", "2.21","0","lb"},
                                {"g", "0.04","0","oz"},
                                {"L", "4.17","0","cups"},
                                {"c", "1","273.15","K"}};

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
                //i for loop data in arrays & count for counting whether the
                //value is found in arrays.
                int i = 0;
                int count = 0;

                while (i < 12){
                    double attri = Double.parseDouble(unitData[i][1]);
                    double minus = Double.parseDouble(unitData[i][2]);
                    //data preparation : String arrays to Double
                    if(units.equals(unitData[i][0])){
                        System.out.println(number+(unitData[i][0])+"="+(attri*number+minus)+(unitData[i][3]));
                        count++;
                        //output and calculation
                    }
                    i++;
                }
                if(count == 0){
                    System.out.println("Unit unavailable.");//no found
                }

            }else{
                //case2: Int input
                //STEP1: store Int
                // System.out.println("It is int" +input);
                int number = Integer.valueOf(input);
                //STEP2: store and identify unit
                System.out.print("please enter current unit:");
                String units = keyb.nextLine().toLowerCase();

                int i = 0;
                int count = 0;
                while (i < 12){
                    double attri = Double.parseDouble(unitData[i][1]);
                    double minus = Double.parseDouble(unitData[i][2]);

                    if(units.equals(unitData[i][0])){
                        System.out.println(number+(unitData[i][0])+"="+(attri*number+minus)+(unitData[i][3]));
                        count++;
                    }
                    i++;
                }
                if(count == 0){
                    System.out.println("Unit unavailable.");
                }

            }//end of identify first input

        }//end of while true

    }}


//2021-09-27 YUJIA JI - FOR STUDY ONLY - VERSION 2
