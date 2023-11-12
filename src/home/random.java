package home;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num1 = sc.nextInt();
//        for (int i = 1; i <= num1; i++) {
//            for (int j = 1; j <= num1; j++) {
//                System.out.print((j * i) + "\t");
//            }
//            System.out.println();
//        }

//        int mocnitel = sc.nextInt();
//        int num1 = sc.nextInt();
//        for (int i = 0; i < mocnitel - 1; i++) {
//            System.out.println(num1*mocnitel);
//        }

//        int jackpot = (int) (Math.random() * 135 + 1);
//        int jackpot2 = (int) (Math.random() * 135 + 1);
//        int jackpot3 = (int) (Math.random() * 135 + 1);
//        int counter = 1;
//        System.out.println( jackpot + " " + jackpot2 + " " + jackpot3);
//
//        while (jackpot != jackpot2 || jackpot != 7 || jackpot3 != jackpot){
//            counter++ ;
//            jackpot = (int) (Math.random() * 135 + 1);
//            jackpot2 = (int) (Math.random() * 135 + 1);
//            jackpot3 = (int) (Math.random() * 135 + 1);
//            System.out.println( jackpot + " " + jackpot2 + " " + jackpot3);
//        }
//        System.out.println(counter);
//        System.out.println("Zaplatil si: " + 100 * counter);

        for (;;) {
            int randomInteger = -1000 + (int) (Math.random() * ((1000 - (-1000)) + 1));
            System.out.println(randomInteger);
        }

    }
}
