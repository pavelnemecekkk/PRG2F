package methods;

public class Basic {
    static void greeting(){
        System.out.println("Ahoj návštěvníku");
    }
    public static int sum(int a,int b){
     return a + b;
    }
    public static void main(String[] args) {
        greeting();
        int result = sum(40, 2);
        System.out.println(result);
        System.out.println(sum(5,2));





    }
}
