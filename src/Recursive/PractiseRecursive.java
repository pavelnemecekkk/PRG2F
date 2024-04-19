package Recursive;

public class PractiseRecursive {




    static void doSomething(){
        System.out.println("cau");
        doSomething();;
    }

    public static void main(String[] args) {
        doSomething();
    }

}
