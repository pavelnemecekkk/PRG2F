package cvika;

import java.util.Scanner;

public class Randomloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random1 = (int) (Math.random() * 21);
        int random2 = (int) (Math.random() * 21);
        int tries = 1;
        System.out.println(random2 + " , " + random1);
        while (random2 != random1){
            random1 = (int) (Math.random() * 21);
            random2 = (int) (Math.random() * 21);
            tries++;
            System.out.println(random2 + " , " + random1);
        }
        System.out.println("Trvalo to " + tries + " pokusů");

        int counter = 0;
        for (int i = 0; i < 100; i++) {
            random1 = (int) (Math.random() * 21);
            random2 = (int) (Math.random() * 21);
            System.out.println(random2 + " , " + random1);
            if (random1 == random2){
                counter++;
            };
        }
        System.out.println("Totožná čísla padla " + counter + "x");

        int levels = sc.nextInt();

        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
