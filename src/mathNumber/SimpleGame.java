package src.mathNumber;
import java.util.ArrayList;

public class SimpleGame {
    private ArrayList<String> localNum;
    int count = 0;

    public void setLocalNum (ArrayList<String> initNum) {
        localNum = initNum;
    }
    public String guessNum(String userNUm) {
        int guess = Integer.parseInt(userNUm);
        String result = "miss";
        int idx = localNum.indexOf(guess);
        if(idx >= 0) {
            localNum.remove(idx);
            if(localNum.isEmpty()) {
                result =  "kill";
            }else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
}
