package OOP_TEST;

public class SlotMachine {

    int balance,debt,loan;

    public SlotMachine(int balance, int debt) {
        this.balance = balance;
        this.debt = debt;
    }


    void bet() {

        if (balance > 150) {
            balance -= 150;
            int num1 = (int) (Math.random() * 7 + 1);
            int num2 = (int) (Math.random() * 7 + 1);
            int num3 = (int) (Math.random() * 7 + 1);
            if (num3 == num2 && num1 == num3){
                balance += 1500;
                System.out.println("Vyhrál si cinkačku, GG pro casino");
            }
            else {
                System.out.println("Loosnul jsi peníze XDDDDDD");
            }
        } else{
            System.out.println("jseš troska, nemáš už peníze, běž si půjčit další");
        }
    }

    void loan(int loan){
        balance += loan;
        this.loan = (int) (loan * 1.5);

    }


    void getBalance(){
        System.out.println("Máš ještě na účtě:" + balance);
        System.out.println("Dlužíš kasinu:" + loan);

        if (loan > balance){
            System.out.println("Jseš v mínusu: " + (balance-loan));
        }
    }

}
