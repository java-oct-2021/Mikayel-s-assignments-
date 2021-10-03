import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTester {
    public static void main(String[] args) {
        BasicJava bj = new BasicJava();

        int[] arr01 = {1,3,5,7,9,13};
        int[] arr02 = {6, -7, 5, 0};

        bj.print255();
        bj.printOdd();
        System.out.println(bj.printSum());
        bj.iterateArr(arr01);
        bj.findMax(arr02);
        bj.oddArr();
        bj.printAvg(arr01);
        // System.out.println(bj.grThanY(arr01));
        bj.sqr(arr02);
        bj.noNeg(arr02);
        int[] miMaAv = bj.maxMinAvg(arr02);
        System.out.println(Arrays.toString(miMaAv));
        bj.shiftValues(arr02);
    }
    
}
