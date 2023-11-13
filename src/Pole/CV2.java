package Pole;

import java.util.Arrays;

public class CV2 {
    public static void main(String[] args) {

//        int[] arr =  {1,5,3,5};
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 49);
        }
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // vypiš všechna čísla v poli
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // Výpis pole zig-zag

//        for (int i = 0; i <array.length/2 ; i++) {
//            System.out.print(array[i] + " ");
//            System.out.print(array[array.length - i -1] + " ");
//        }
//        System.out.println(array[array.length/2]);
        }
    }
