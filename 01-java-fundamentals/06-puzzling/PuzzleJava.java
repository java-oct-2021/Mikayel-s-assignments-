import java.security.AlgorithmParameterGeneratorSpi;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class PuzzleJava {
    
    public ArrayList tenRolls() {
        ArrayList<Integer> rand10 = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i<=9; i++) {
            rand10.add(rnd.nextInt(21));
        }
        return rand10;
    }

    public char rndLetter() {
        Random rnd = new Random();
        // Need help with this version of solution.
        ArrayList<Character> alpha = new ArrayList<Character>();
        for (char i = 'a'; i<='z'; i++){
            alpha.add(i);

        }
        System.out.println(alpha);

        // char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char letter = alpha.get(rnd.nextInt(26));
        return letter;
    }

    public String password(){
    String pswrd = "";
        for(int i = 0; i < 8; i++){
            pswrd = pswrd + rndLetter();
        }
        return pswrd;
    }

    public ArrayList<String> getNewPass(int length) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            newPassword.add(password());
        }
        return newPassword;
    }

}
