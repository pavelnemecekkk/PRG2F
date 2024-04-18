package Recursive;

public class RecursiveBasics {



    static void countdown(int n){
        System.out.print(n + " ");
        n--;
        if (n > 0){
            countdown(n);
        }
    }

    public static void main(String[] args) {
        countdown(15);
    }
}
