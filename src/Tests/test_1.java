package Tests;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int dmg = (int) ((Math.random() * 50) + 100);
    int nexthp = dmg;
    int num = 1;
        System.out.println(dmg);

//        for (int i = 0; i < 1500; i++) {
//            dmg = (int) ((Math.random() * 150) + 100);
//            nexthp = nexthp + dmg;
//            num++;
//            System.out.println(dmg);
//            if (nexthp >= 1500){
//                break;
//        }
            while(nexthp < 1500){
                dmg = (int) ((Math.random() * 50) + 100);
                nexthp += dmg;
                num++;
                System.out.println(dmg);
            }
        System.out.println("Museli jste mu ubrat: " + num + "x");

        int PIN = sc.nextInt();
        while(PIN < 1000 || PIN > 9999){
            System.out.println("Vypiš jiný PIN");
            PIN = sc.nextInt();
        }
        System.out.println("Pin je ok");


       int cislo = sc.nextInt();
       for (int i = 0; i <= cislo; i++) {
           if (i % 2 == 0) {
               System.out.println(i);
           }
           }
       }
   }
