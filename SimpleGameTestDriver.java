public class SimpleGameTestDriver {
    public static void main(String[] args) {
        SimpleGame game = new SimpleGame();
        GamePlayer player = new GamePlayer();
        int random = (int) (Math.random() * 5);
        int[] uNum = {random,random+1,random+2};
        boolean isRun =  true;
        int score = 0;
        game.setLocalNum(uNum);
        while( isRun) {
            String pnum = player.getUserPrint("entry your guess");
            String result = game.guessNum(pnum);
            score++;
            if(result.equals("kill")) {
                isRun = false;
                System.out.println("用户分数"+score);
            }
        }
    }
}