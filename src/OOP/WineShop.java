package OOP;

public class WineShop {
    int bottles;
    int balance;

    final int Price_per_sell = 500;
    final int PRICE_PER_BUY = 250; // Final = const
    public WineShop(int bottles, int balance) {
        this.bottles = bottles;
        this.balance = balance;
    }

    void sell(int bottles){
        if (this. bottles <= bottles){
            System.out.println("Nemám toho dost, sellnuti krabicák");
        } else {
            this.bottles -= bottles;
            balance += Price_per_sell  * bottles;
        }

    }

    void buy(int bottles){
        if (balance >= PRICE_PER_BUY * bottles){
        balance -= PRICE_PER_BUY * bottles;
        this.bottles += bottles;
    } else {
            System.out.println("GG, jdu žebrat o cash");
        }
    }

    void PrintInfo(){
        System.out.println("Na skladě: " + bottles);
        System.out.println("Na účtu: " + balance);
    }
}
