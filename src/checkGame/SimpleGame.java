package src.checkGame;

public class SimpleGame {
    int[] localNum;
    int count = 0;

    public void setLocalNum (int[] initNum) {
        localNum = initNum;
    }

    public String guessNum(String userNUm) {
        int guess = Integer.parseInt(userNUm);
        String result = "miss";
        for(int cell: localNum) {
            if(guess == cell) {
                result = "hit";
                count++;
                break;
            }
        }
        if(count == localNum.length) {
            result = "kill";
        }
        System.out.print(result);
        return result;
    }
}
