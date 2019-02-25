package e1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Fibonacci {
    private static ArrayList<Long> results = new ArrayList<>(){{ add(0l); add(1l); add(1l);}};

    public static long fiboRec1(int n){
        if (n == 0){
            return 0;
        } else if (n == 1 || n == 2){ //Rekusionsbasis
            return 1;
        }else{ //Rekursionsvorschrift
           return fiboRec1(n-2)+ fiboRec1(n-1);
        }
    }

    public static long fiboRec2(int n){
        if ( n+1 > results.size()){
            long n1 = fiboRec2(n-2);
            long n2 = fiboRec2(n-1);
            results.add(n2 + n1);
            return n1 + n2;
        }else{
            return results.get(n);
        }
    }

    public static long fiboIter(int n){
        long f1 = 1;
        long f2 = 1;
        int i = 2;

        if(n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }else {
            while (n > i) {
                long temp = f2;
                f2 = f1 + f2;
                f1 = temp;
                i++;
            }
            return f2;
        }
    }
}
