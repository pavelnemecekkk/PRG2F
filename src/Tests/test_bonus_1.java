package Tests;

import java.util.Scanner;

public class test_bonus_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if((j+i) % 2 == 0){
                    System.out.print("\t X");
                }
                else {
                    System.out.print("\t O");
                }
            }
            System.out.println();
        }

    }
}
