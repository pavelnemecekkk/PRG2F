package Strings;

public class Stringy {
    public static void main(String[] args) {

        // x.contains() => je tam něco, obsahuje to
        // x.equal() => je stejný jako
        // spojení x + y


        String song = "Dr;are;15";
        String[] split = song.split(";");

        // rozedělí mi ty věci podle oddělovače (nyní ;)
        // pomocí x.split a můžu uložit do pole Stringů
        // x.substring(x,y) => vybere to z nějakého slova indexy podle toho co zadáme
        // ! počítáto jenom  <x,y) Př. <1,3) vezme to jenom indexy 1 a 2


        // String x = "52";
        //Integer.parseInt("x") => vezmu si ze stringu "52" a převedu do Stringu
        // Můžeme použít i v double či char
        // O převedení z Int do Stringu můžeme to převést takhle:
        // y = 5555;
        // String.valueOf(y) => "5555";
     }
}
