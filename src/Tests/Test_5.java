package Tests;

import java.util.Arrays;

public class Test_5 {
    public static String checkPulse(int[] pulses){

        String check = " ";
        for (int i = 0; i < pulses.length; i++) {
            if (pulses[i] <= 30){
                check = "Danger";
                if (pulses[i] == 0){
                    check = "Died";
                }
            } else {
                check = "Ok";
            }

        }
        return check;
    }





    public static void newerdate(String date, String otherDate) {

        String[] first = date.split("\\.");
        String[] sec = otherDate.split("\\.");

        int day = Integer.parseInt(first[0]);
        int day2 = Integer.parseInt(sec[0]);

        int month = Integer.parseInt(first[1]);
        int month2 = Integer.parseInt(sec[1]);


        if (day > day2 && month > month2){
            System.out.println(date);
        } else if ((day < day2 && month < month2)) {
            System.out.println(otherDate);
        } else if ((day > day2 && month < month2)){
            System.out.println(otherDate);

        }
        else {
            System.out.println(date);
        }
        }




    public static double cena(int meters, boolean lakovat){
        double result = 0;

        if (lakovat){
            result = ((meters * 3) * 33) + ((meters * 3) * 33) * 0.23;
        }
        else {
            result = ((meters * 3) * 33);
        }



        return result;
    }

    public static void main(String[] args) {


        int[] pulses = {40,40,20,0};
      System.out.println(checkPulse(pulses));
        newerdate("15.10", "16.10");

        // cv.3
        System.out.println(cena(5, true));




    }

}
