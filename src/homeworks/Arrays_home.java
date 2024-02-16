package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vygenerujte n náhodných čísel do pole. Délku tohoto pole získejte od uživatele.
//        int[] pole = new int[sc.nextInt()];
//        int n = sc.nextInt();
//        for (int i = 0; i < pole.length; i++) {
//            pole[i] = (int) (Math.random() * n + 1);
//        }
//        System.out.println(Arrays.toString(pole));

        //Vypočtěte součet všech sudých čísel a všech lichých v poli celých čísel. Výsledek vypište do
        //konzole. (myšleno součet sudých, resp. lichých čísel, ne čísel, které jsou na sudých, resp.
        //lichých pozicích)
//        int suda = 0;
//        int lichost = 0;
//        int[] pole = {sc.nextInt()};
//        for (int i = 0; i < pole.length; i++) {
//            System.out.println(pole[i]);
//            if (pole[i] % 2 == 0){
//                suda += pole[i];
//            } else {
//                lichost += pole[i];
//            }

//        }
//        System.out.println(suda + " " + lichost);


        //Mějte pole celých čísel, to bude obsahovat. Takové pole můžete vytvořit staticky, nebo jej
        //poté nějak naplnit. Vytvořte pak další pole, které bude na stejných pozicích obsahovat
        //odmocniny těchto čísel

//        int[] pole = {4,9,16,25,100};
//        int[] pole2 = new int[pole.length];
//
//        for (int i = 0; i < pole.length; i++) {
//
//            pole2[i] = (int) Math.sqrt(pole[i]);
//        }
//        System.out.println(Arrays.toString(pole2));


        //. Zeptejte se uživatele na hodnotu. Tu si uložte a vyhledejte všechny výskyty této hodnoty
        //v poli celých čísel. Vypište, kolikrát a kde je.

//        int[] pole = {1, 2, 3, 4, 5, 3, 6};
//        int guess = sc.nextInt();
//        int soucet = 0;
//        for (int i = 0; i < pole.length; i++) {
//            if(guess == pole[i]) {
//                soucet++;
//                System.out.println(i);
//            }
//        }
//        System.out.println("Vyskytuje se: " + soucet + "x");


        //Mějte prázdné pole celých čísel (délka např. 10). Napište program, který uživatele vyzve, aby
        //zadával čísla, která do pole budou vložena.

//        int[] pole = new int[5];
//        System.out.println("Piš do délky pole[" + pole.length + "] celé čísla");
//            for (int i = 0; i < pole.length; i++) {
//                pole[i] = sc.nextInt();
//    }
//                System.out.println(Arrays.toString(pole));


        //Těžší varianta: nechte, aby uživatel zadal pouze čísla 10–100, jiná čísla neakceptujte.
        //Zároveň se ptejte tak dlouho, dokud uživatel pole nezaplní.

//        int[] pole = new int[5];
//        System.out.println("Piš do délky pole[" + pole.length + "] celé čísla");
//        for (int i = 0; i < pole.length; i++) {
//            int num = sc.nextInt();
//            if(num <= 100 && num >= 10){
//                pole[i] = num;
//            }
//            else {
//                i--;
//            }
//        }
//        System.out.println(Arrays.toString(pole));

        //BONUS: Tipovací hra #2/sportka:

        //V poli pickedNumbers je uloženo 10 celých čísel (mezi 1 a 30) a v poli guesses bude zadáno 5 čísel,
        //která tipuje soutěžící. (pole můžete otestovat ručně naplněná, náhodně generovaná anebo třeba
        //pickedNumbers generovat náhodně a guesses načíst od uživatele)
        //Vypisujte postupně tipovaná čísla, a pokud je mezi taženými, vypište jej červeně. Nakonec vypište,
        //kolik čísel soutěžící uhodl.

//        int[] pickedNumbers = new int[10];
//        int[] guesses = new int[5];
//        int tip = 0;
//        for (int i = 0; i < pickedNumbers.length; i++) {
//            pickedNumbers[i] = (int) (Math.random() * 30 + 1);
//        }
//        System.out.println(Arrays.toString(pickedNumbers));
//        for (int i = 0; i < guesses.length; i++) {
//                guesses[i] = sc.nextInt();
//            }
//        System.out.println("Picked numbers " + Arrays.toString(pickedNumbers));
//        System.out.println("Guesses" + Arrays.toString(guesses));
//        int num = 0;
//        for (int i = 0; i < guesses.length; i++) {
//            for (int j = 0; j < pickedNumbers.length; j++) {
//                if (pickedNumbers[j] == guesses[i]) {
//                    num = guesses[i];
//                    tip++;
//                    break;
//                }
//            }
//            if (num == guesses[i]){
//                System.out.print("\u001B[31m" + num + " " + "\u001B[0m");
//            } else {
//                System.out.print(guesses[i] + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("Tips:" + tip);

    }
}

