package cycles;

import java.util.Scanner;

public class Prvočísla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo");
        int input = sc.nextInt();

        for (int i = 2; i < input; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j != 0){
                    System.out.println(j);
                }

            }

            }
        }
    }

