package GAMEMAZE;

import java.util.Scanner;

public class Player {
    String nickname;
    int x, y;

    public Player(String nickname, int x, int y) {
        this.nickname = nickname;
        this.x = x;
        this.y = y;
    }

    void readMove(){
        System.out.println("Vyber si smer (a,w,s,d): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input){
            case "a": x--; break;
            case "w": y--; break;
            case "s": y++; break;
            case "d": x++; break;
            default: System.out.println("Spatny input");
        }
    }
}
