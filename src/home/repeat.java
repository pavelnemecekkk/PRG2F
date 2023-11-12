package home;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int cislo = sc.nextInt();
//        for (int i = 0; i < cislo ; i++) {
//            for (int j = 0; j < cislo ; j++) {
//                System.out.print("# \t");
//            }
//            System.out.println();
//        }

        System.out.println("Zadej číslo, zadavaní ukončís zastavíš -1");
        int input = sc.nextInt();
        while (input != -1){
            if (input % 2 == 0){
                System.out.println(input);
            }
            input = sc.nextInt();

        }
    }
}
