package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class stringy_home {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Cvičení jedna
//        String[] users = {"Petr", "Tomáš", "Pavel", "Jan"};
//        String user = "Tomáš";
//
//        for (int i = 0; i < users.length; i++) {
//            if (users[i].equals(user)){
//                System.out.println(users[i]);
//                break;
//            }
//        }

        // Cvičení dva
//       String text = sc.nextLine();
//       boolean text1 = false;
//       for (int i = 0; i < text.length(); i++) {
//           if (text.length() - 1 == i){
//               break;
//           }
//           else {
//               if (text.charAt(i) == text.charAt(i+1)){
//                   text1 = true;
//                   break;
//               }
//           }
//       }
//       if (text1){
//           System.out.println("Jsou tam zdvojené hlásky");
//       }else {
//           System.out.println("Nejsou tam zdvojené hlásky");
//       }

        // Cvičení tři

//       String oppositeCase = "pepazdepa";
//       String novy = "";
//       for (int i = 0; i < oppositeCase.length(); i++) {
//
//           if (oppositeCase.charAt(i) % 2 == 1) {
//               novy += oppositeCase.toLowerCase().charAt(i);
//           } else {
//               novy += oppositeCase.toUpperCase().charAt(i);
//           }
//       }
//       System.out.println(novy);


        // Cvičení čtyři

//        String words = "Jsem rád za všechny lidi.";
//        String[] split = words.split(" ");
//        System.out.println(split.length);


        // Cvičení pět

//        String[] names = {"Jan", "Karel", "„František Dlouhojmenný", "„Pablo Diego José Francisco de Paula Juan\n" +
//                "Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y\n" +
//                "Picasso", "Eva"};
//        String end = " ";
//        for (int i = 0; i < names.length; i++) {
//            for (int j = 0; j < names.length ; j++) {
//                if (names[i].length() > names[j].length()){
//                    end = names[i];
//                    break;
//                }
//            }
//        }
//        System.out.println(end);

        // Cvičení šest

//        String number = "4200";
//        String num = "";
//
//        for (int i = number.length()-1; i >= 0; i--) {
//            num += number.charAt(i);
//
//        }
//        System.out.println(num);

        // cvičení sedm

//        String name = "meme";
//        String koncovka = sc.nextLine();
//        String fileName = name + "." + koncovka ;
//        System.out.println(fileName);

        // Bonus Palindrom

//        String thing = sc.nextLine();
//        String palindrom = "";
//
//        for (int i = thing.length()-1; i >= 0; i--) {
//            palindrom += thing.charAt(i);
//        }
//        if (thing.equalsIgnoreCase(palindrom)){
//            System.out.println("Jedná se o palindrom");
//        } else {
//            System.out.println("Nejedná se o palindrom");
//        }
        }
    }
