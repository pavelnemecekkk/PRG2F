package Tests;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



//        int[] pole = new int[20];
//        int soucet = 0;
//        for (int i = 0; i < pole.length; i++) {

//            pole[i] = (int) (Math.random() * 201 - 100);
//            soucet += pole[i];
//        }

//        if (soucet > 0){
//            System.err.println(soucet);
//        }
//        else {
//            System.out.println(soucet);
//        }

        // Cvičení 2

//        int[] pole = new int [10];
//
//        for (int i = 0; i < pole.length; i++) {
//            pole[i] = (int) (Math.random() * 41 -20);
//        }
//
//        for (int i = 0; i < pole.length; i++) {
//
//            if (pole[i] >= -10 && pole[i] <= 10){
//                System.out.print(pole[i] + " ");
//            }
//
//        }


        int[] score = new int[8];
        int soucet = 0;
        boolean success = true;


        for (int i = 0; i < score.length; i++) {
            score[i] = (int) (Math.random()*101);
        }
        for (int i = 0; i < score.length; i++) {
            soucet += score[i];
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] <= 60) {
                success = false;
                break;
            }
        }
        if (soucet / score.length <= 70){
            success = false;
        }
        System.out.println("Student měl skóre: " + soucet + " a Uspěl? " + success);
    }
}