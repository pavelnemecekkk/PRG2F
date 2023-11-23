package Pole;

import java.util.Arrays;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pole = new int[6];
        int num;
        int score = 0;
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) (Math.random() * 15 + 1);
        }
        System.out.println(Arrays.toString(pole));

        for (int i = 0; i < 7; i++) {
            System.out.println("Tipni číslo");
            num = sc.nextInt();
            for (int j = 0; j < pole.length; j++) {
                if (num == pole[j]){
                    score += 100;
                    System.out.println("Uhádl si");
                    pole[j] = -1;
                }
            }
            // uhodle vše
            if(score >= pole.length * 100){
                break;
            }
        }
        System.out.println("Game over, score: " + score);
    }
}
