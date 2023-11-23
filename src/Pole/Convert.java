package Pole;

public class Convert {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 1, 1, 1, 1, 0, 1};
        int result = 0;
        int result2 = 0;

        for (int i = 0; i < binaryArray.length; i++) {
            result += binaryArray[i] * (int) (Math.pow(2, i));
//            if (binaryArray[i] == 1) {
//                result += (int) Math.pow(2, i);
//            }
//        }
        }
        System.out.println(result);


        for (int i = binaryArray.length-1; i >= 0; i--) {

            if (binaryArray[i] == 1) {
                result2 += (int) Math.pow(2, i);
            }
        }
        System.out.println(result2);
    }
}