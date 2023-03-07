// package src.checkGame;
import src.checkGame.SimpleGame;

public class SimpleGameTestDriver {
    public static void main() {
        SimpleGame player = new SimpleGame();
        int[] uNum = {1,2,3};
        player.setLocalNum(uNum);
        String result = player.guessNum("1");
    }
}