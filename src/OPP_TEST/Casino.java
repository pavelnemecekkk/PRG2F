package OPP_TEST;

public class Casino {

    public static void main(String[] args) {

        SlotMachine pepa = new SlotMachine(1500, 100);
        pepa.getBalance();
        pepa.loan(150);
        pepa.getBalance();
        pepa.bet();
        pepa.getBalance();


    }
}
