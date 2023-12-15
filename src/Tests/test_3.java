package Tests;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Jednička

        String[] names = {"Pavel", "Petr", "Pepa", "Štěpán", "Ivan", "Miloš"};
        String[] surnames = {"Nový", "Novák", "Veselý", "Pavel", "Zeman"};
        String fullname = "";

//      String name = names[(int) (Math.random() * names.length)] + " " + surnames[(int) (Math.random() * surnames.length)];
//        System.out.println(name);

        int random = (int) (Math.random() * names.length);
        System.out.println(random);
        for (int i = 0; i < names.length; i++) {
            if (i == random){
                fullname += names[i] + " ";
                break;
            }
        }

        int random2 = (int) (Math.random() * surnames.length);
        System.out.println(random2);
        for (int i = 0; i < surnames.length; i++) {
            if (i == random2){
                fullname += surnames[i] + " ";
                break;
            }
        }
        System.out.println(fullname);







     // Dvojka
       String thing = "Jsem rád za všechny! Taky mám rád i Pepu.";
       String[] split = thing.split(" ");
       int num = 0;

       for (int i = 0; i < split.length; i++) {
           if (split[i].endsWith("!") || split[i].endsWith(".") || split[i].endsWith("?")  ){
               num++;
           }
       }
       System.out.println("Počet vět tam je: " + num);

//
//        for (int i = 0; i < thing.length(); i++) {
//            if (thing.charAt(i) == '!' || thing.charAt(i) == '.'){
//                num++;
//            }
//        }



       // Trojka

       System.out.println("Zadej tel. číslo s předvolbou");
       String tel = sc.nextLine();

       if (tel.length() == 13 ){
           System.out.println("Délka čísla je ok");
           if (tel.startsWith("+420")){
               System.out.println("Předvolba čísla je taky ok");
           }
       }
        }
    }