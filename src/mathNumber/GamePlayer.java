package src.mathNumber;
import java.io.*;
public class GamePlayer {
    public String getUserPrint(String prompt) {
        String inputLine = null;
        System.out.print(prompt+"");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0 ) return null;
        } catch (Exception e) {
            System.out.println("Exception"+ e);
        }
        return inputLine;
    }
}
