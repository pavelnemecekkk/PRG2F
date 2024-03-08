package methods;

import java.util.Arrays;

public class practice {

    public static int randomnum(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }


    public static int[] randomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomnum(max, min);
        }
        return array;
    }

    //time convert

    public static String minuteconvert(int seconds) {
        String time;
        int hours = seconds / 3600;
        int remainingSeconds = seconds - (hours * 3600);
        int min = remainingSeconds / 60;
        int sec = remainingSeconds % 60;


        return hours + ":" + min + ":" + sec;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomnum(-2, 2));
        }
        System.out.println(minuteconvert(3662));;
    }
}