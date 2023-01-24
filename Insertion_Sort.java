import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        
        boolean sorted = false;
        
        while(!sorted) {

            for(int i = n -1; i > 0; i--) {

                int current = arr.get(i);
                
                int next = arr.get(i - 1);

                if(current < next) {
                    
                    arr.set(i, next);
                    
                    printArray(arr);
                    
                    arr.set(i - 1, current);

                    break;
                }

                if(i == 1) {
                    
                    sorted = true;
                }

            }
            
        }
        
        for (Integer e : arr) {
            
            System.out.print(e);
            
            System.out.print(" ");
        }

        System.out.println();
    

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
