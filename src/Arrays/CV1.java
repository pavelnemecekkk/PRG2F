package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pole = {5,32,15,2};
        int[] poleJinak = new int[10];
//        System.out.println(pole[2]);
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }
        System.out.println("1: " + pole[1] + " 2: " + pole[2]);
        pole[2] = 10;
        for (int i = 0; i < poleJinak.length; i++) {
            poleJinak[i] = (int)(Math.random()*101);
        }
        System.out.println("---");
        for (int i = 0; i < poleJinak.length; i++) {
            System.out.println(poleJinak[i]);
        }
        System.out.println("---");
        int[] numberfives = new int[15];
        for (int i = 0; i < numberfives.length; i++) {
            numberfives[i] = (i +1) * 5;
        }
        System.out.println(Arrays.toString(numberfives));



    }
}
