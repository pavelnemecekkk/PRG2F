package MultipleArray;

public class MultipleArray {
    public static void main(String[] args) {


        // Zápis x[][]{
        // {x,x,x},
        // {y,y,y},
        // {z,z,z}
        // }
        // můžeme tam napsat více polí


       int[][] array2 = {
               {1,2,3},
               {4,5,6},
               {3,99,64}
       };
       System.out.println(array2[1][2]);

       int rows = 10;
       int cols = 10;
       int counter = 1;
       int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
