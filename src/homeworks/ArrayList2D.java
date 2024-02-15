package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // cv. 1 Výpis něčeho pozpátku
//
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(5);
//        nums.add(6);
//        nums.add(56);
//
//        for (int i = nums.size() - 1; i >= 0; i--) {
//            System.out.println(nums.get(i));
//        }

        //cv.2 vypsání součtu slopce

//        int[][] nums = new int[5][5];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                nums[i][j] = (int) (Math.random() * 20 + 1);
//            }
//        }
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = 0; j < nums[i].length ; j++) {
//                System.out.print(nums[i][j] + "\t");
//                }
//            System.out.println();
//            }
//
//        System.out.println("Napiš číslo na vypsání součtu sloupce");
//        int input = sc.nextInt();
//        int soucet = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = 0; j < nums[i].length ; j++) {
//              if (input == j){
//                  soucet += nums[i][j];
//              }
//            }
//    }
//        System.out.println("Součet je: " + soucet);

        //cv.3 Psaní Stringu a poté vypsání Stringu podle toho, čím začíná

//        ArrayList<String> spanishword = new ArrayList<>();
//        String input = sc.nextLine();
//        while (!input.equals("fin")) {
//            if (input.startsWith("el") || input.startsWith("la") || input.startsWith("un")) {
//                spanishword.add(input);
//                input = sc.nextLine();
//            } else {
//                input = sc.nextLine();
//            }
//        }
//        System.out.println(spanishword);


        //cv.4 Genereca random čísel do Arraylistu poté odstranit čísla menší jako 50, poté počet čísel vypsat, kteri byli odstraněny

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            nums.add((int) (Math.random() * 101));
        }
//        ArrayList<Integer> numslower = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) < 50){
//                numslower.add(i);
//            }
//        }
//
//        nums.removeAll(numslower);
//        System.out.println(numslower);
//        System.out.println(numslower.size());
//
//       nums.removeIf(n -> (n<50) );
//        System.out.println(nums);
//        System.out.println(nums.size());


        //cv.5 Průměr z 2D pole
        String[][] score = {{"film1", "1", "5", "3", "2", "6"},
                {"film2", "4", "5", "2", "5", "6"},
                        {"film3", "9", "9", "7", "8", "9"},
                                {"film4", "3", "3", "1", "1", "2"},
                                };
        long avarage = 0;
        int counter = 0;
        int cislo = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 1; j < score[i].length; j++) {
               cislo = Integer.parseInt(score[i][j]);
               avarage += cislo;
                System.out.print(avarage + " ");
            }
            avarage = avarage / score[i].length;
            System.out.print("Pepe" + avarage + " ");
            if (avarage >= 7) {
                counter++;
            }
        }
        System.out.println("Počet filmů s hodnocením větším jak 7 jsou: " + counter);

        //cv 6 - Bonus

//        int size = sc.nextInt();
//        int[][] pole = new int[size][size];
//        int poklad = 1;
//        int randomx = (int) (Math.random() * size);
//        int randomy = (int) (Math.random() * size);
//        pole[randomx][randomy] = poklad;
//        for (int i = 0; i < pole.length; i++) {
//            for (int j = 0; j < pole[i].length; j++) {
//                System.out.print(pole[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int inputx = sc.nextInt();
//        int inputy = sc.nextInt();
//        boolean flag = true;
//        int counter = 0;
//
//        while (flag) {
//            for (int i = 0; i < pole.length; i++) {
//                for (int j = 0; j < pole[i].length; j++) {
//                    if (inputy - 1 == randomy) {
//                        break;
//                    }
//                }
//                if (inputx - 1 != randomx) {
//                    counter++;
//                    System.out.println("Netrefil si to");
//                    System.out.println("Počet pokusů je: " + counter);
//                    inputx = sc.nextInt();
//                    inputy = sc.nextInt();
//                } else {
//                    flag = false;
//                    counter++;
//                    break;
//                }
//            }
//
//        }
//        System.out.println("Počet pokusů je: " + counter);

    }
    }
