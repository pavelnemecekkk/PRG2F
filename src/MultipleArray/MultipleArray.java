package MultipleArray;

import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {


        // Zápis x[][]{
        // {x,x,x},
        // {y,y,y},
        // {z,z,z}
        // }
        // můžeme tam napsat více polí


       int[][] array2 = {
               {1,2,3},
               {4,5,6},
               {3,99,64}
       };
       System.out.println(array2[1][2]);

       int rows = 10;
       int cols = 10;
       int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90 + 10 );
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }



        // vypsání n-teho radku, n zada uzivatel

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < matrix.length;i++) {
            System.out.print(matrix[input-1][i] + "\t");

        }
// Vypsání n-tého sloupce
        int n = sc.nextInt();
        for (int i = 0; i < matrix.length;i++) {
            System.out.println(matrix[i][n-1] + "\t");
        }

        //nasobilka
        System.out.println("Zadej cislo");
        int num = sc.nextInt();

        int[][] cube = new int[num][num];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length ; j++) {
                cube[i][j] = (j+1)*(i+1);
                System.out.print(cube[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
