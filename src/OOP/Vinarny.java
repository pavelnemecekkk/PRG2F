package OOP;

public class Vinarny {

    public static void main(String[] args) {
        WineShop shop = new WineShop(10,50000);// Vytvoření vinařství
        shop.PrintInfo();
        shop.sell(5);
        shop.buy(15);
        shop.PrintInfo();


        System.out.println();
        WineShop shop1 = new WineShop(6,25000);// Vytvoření vinařství
        shop1.PrintInfo();
        shop1.sell(5);
        shop1.buy(15);
        shop1.PrintInfo();

    }
}
