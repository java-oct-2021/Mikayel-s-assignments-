import java.util.ArrayList;
import java.util.Random;


public class PuzzlingTester {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        System.out.println(generator.tenRolls());
        System.out.println(generator.rndLetter());
        System.out.println(generator.password());
        System.out.println(generator.getNewPass(3));
        // System.out.println(generator.shuffleArr());
    }
}
