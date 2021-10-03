import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

    public void print255(){
        for (int i=0; i<=255; i++){
            System.out.println(i);
        }
    }


    public void printOdd(){
        for(int i=1; i<=255; i=i+2){
            System.out.println(i);
        }
    }

    public int printSum(){
        int sum = 0;
        for(int i=0; i<=255; i++){
            sum = sum + i;
        }
        return sum;
    }

    public void iterateArr(int[] x){
        for(int i=0; i<=x.length-1; i++){
            System.out.println(x[i]);

        }
    }

    public void findMax(int[] y){
        int max = 0;
        for(int i=0; i<y.length; i++){
            if(max<y[i]){
                max=y[i];
            }
        }
        System.out.println(max);
    }

    public void oddArr(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=1; i<=255; i=i+2){
            y.add(i);
        }
        System.out.println(y);
    }

    public void printAvg(int[] t){
        int avg = 0;
        int sum = 0;
        for(int i=0; i<=t.length-1; i++){
            sum = sum + t[i];
        }
        avg = sum/t.length;
        System.out.println(avg);
    }

    // public int grThanY (int[] f){
    //     int y = 3;
    //     int great = 0;
    //     for(int i=0; i<=f.length; i++){
    //         if(f[i]>y){
    //             great = great + 1;
    //         }
    //         return great;
    //     }
    // }

    public void sqr(int[] s){
        ArrayList<Integer> q = new ArrayList<Integer>();
        for(int i=0; i<s.length; i++){
            q.add(s[i] * s[i]);
        }
        System.out.println(q);
    }

    public void noNeg(int[] m){
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i=0; i<m.length; i++){
            if(m[i]<0){
                m[i] = 0;
            }
            n.add(m[i]);
        }
        System.out.println(n);
    }

    public int[] maxMinAvg(int[] x) {
        int[] newArr = new int[3];

        int max = x[0];
        for (int i=0; i<x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        newArr[0] = max;

        int min = x[0];
        for (int i=0; i<x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        newArr[1] = min;

        int sum = 0;
        int avg = 0;
        for (int i = 0; i<x.length; i++) {
                sum = sum + x[i];
            }
            avg = sum / x.length;
            newArr[2] = avg;

            return newArr;
    }

    public void shiftValues(int[] x) {
        for (int i = 0; i<x.length; i++) {
            if (i == x.length-1) {
                x[i] = 0;
                break;
            }
            x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
    }
}
