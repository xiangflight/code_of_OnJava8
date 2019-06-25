package chapter8;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-24 19:04
 */

public class Chess extends BoardGame{
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
