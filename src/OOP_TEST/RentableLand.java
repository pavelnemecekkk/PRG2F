package OOP_TEST;

public class RentableLand {

    int COST_PER_SQUARE_METER = 150;
    boolean farming;
    int price = 0;

    public RentableLand(boolean farming) {
        this.farming = farming;
    }

    public int rent(int width, int length, int days){

        if (farming && days >= 182){
            price += (((width * length) * COST_PER_SQUARE_METER) * days) - 100000;
        } else {
            price += (((width * length) * COST_PER_SQUARE_METER) * days);
        }

        if (price == 0){
            System.out.println("Co děláš, máš zadat udaje o pronajmutí");
        } else {
            System.out.println(price);
        }
        return price;
    }
}
