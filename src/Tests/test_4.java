package Tests;

import java.util.ArrayList;
import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ÚKOL č1

//        int[][] score = new int[3][4];
//        int sum = 0;
//        boolean flag = false;
//        int counter = 0;
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                score[i][j] = (int) (Math.random() *100 + 1);
//            }
//        }
//        for (int i = 0; i < score.length; i++) {
//            System.out.print("Zak" + (i+1) + " ");
//            for (int j = 0; j < score[i].length; j++) {
//                System.out.print(score[i][j] + "\t");
//                sum += score[i][j];
//                if (sum > 100){
//                    flag = true;
//                    sum = 0;//                counter++;
//                }
//
//            }
//
//            if (flag){
//                System.out.print(" " + " prošel");

//            }
//            else {
//                System.out.print(" " + "neprošel");
//            }
//            System.out.println();
//        }
//        System.out.println("Žáků prošlo: " + counter);


 //úkol 2
         int[][] pole = new int[4][4];
         int input = sc.nextInt();
         int min = 0;

        for (int i = 0; i < pole.length; i++) {
           for (int j = 0; j < pole[i].length; j++) {
               pole[i][j] = (int) (Math.random() *10 + 1);
           }
       }

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < pole.length; i++) {
            if (min < pole[i][input]);
            min = pole[i][input];
        }

        System.out.println(min);


        // Úkol 3
//        ArrayList<String> password = new ArrayList<>();
//        String input = sc.nextLine();
//        while (!input.equals("konec")){
//            if (input.length() >= 8){
//                if (input.contains("*")){
//                    password.add(input);
//                    input = sc.nextLine();
//                }
//            }else{
//                input = sc.nextLine();
//            }
//        }
//
//        System.out.println(password);


    }
}
