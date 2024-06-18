package GAMEMAZE;

public class Maze {
    int[][] mazeArray;
    char wall, playerIcon, freeSpace, treasure;
    Player player;

    public Maze(int[][] mazeArray, char wall, char playerIcon, char freeSpace, char treasure, Player player) {
        this.mazeArray = mazeArray;
        this.wall = wall;
        this.playerIcon = playerIcon;
        this.freeSpace = freeSpace;
        this.treasure = treasure;
        this.player = player;
    }

    void printMaze(){
        for (int i = 0; i < mazeArray.length; i++) {
            for (int j = 0; j < mazeArray[i].length; j++) {
                if (i == player.y && j == player.x){
                    System.out.print(playerIcon + " ");
                } else {
                    System.out.print(translate(mazeArray[i][j]) + " ");
                }

            }
            System.out.println();
        }
    }

    char translate(int num){
        switch (num){
            case 1: return wall;
            case 0: return  freeSpace;
            case 2: return treasure;
            default:return '?';
        }
    }

    public static void main(String[] args) {
        int[][] mazeArray = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 3, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        Player p = new Player("John", 1, 4);

        Maze m = new Maze(mazeArray, '#', 'O', ' ', 'X', p);
        m.printMaze();
    }
}
