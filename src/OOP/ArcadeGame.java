package OOP;

public class ArcadeGame {

    final int MAX_PLAYERS = 3;
    int score;
    int playersJoined;

    int highestScore = 0;
    public ArcadeGame() {
        score = 0;
        playersJoined = 0;
    }

    void login() {
        if (playersJoined < MAX_PLAYERS) {
            playersJoined++;
        } else {
            System.out.println("Jste full, víc to nejde");
        }
    }

    void Logout(){
        if (playersJoined > 0){
            playersJoined--;
            if (playersJoined == 0){
                score = 0;
            }

        } else {
            System.out.println("");
        }
    }

   void ScoreIncrease(int score){
        if (playersJoined > 0) {
            this.score += score;
            if (this.score > highestScore){
                highestScore = this.score;
            }
        } else {
            System.out.println("Nikdo nehraje!!");
        }
    }


    void scoreDecreased(int score){
        if (playersJoined > 0 && this.score >= score && score > 0) {
        this.score -= score;
        } else {
            System.out.println("Nikdo nehraje nebo nemáš body!!");
        }
    }
    public int getScore() {
        System.out.println(score);
        return score;
    }

    public int getHighestScore() {
        System.out.println(highestScore);
        return highestScore;
    }
}