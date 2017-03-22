import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Implementation_BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        for(int score_i=0; score_i < n; score_i++){
            int score = in.nextInt();
            myMap.put(score_i, score);
            
        }
        // your code goes here
        
        int max = myMap.get(0);
        int min = myMap.get(0);
        int max_count = 0;
        int min_count = 0;
        
        for(int i=0; i < n; i++){
            if(myMap.get(i) > max) {
                max = myMap.get(i);
                max_count++;
            }
            if(myMap.get(i) < min) {
                min = myMap.get(i);
                min_count++;
            }
        }
        
        System.out.println(max_count + " " + min_count);
        
    }
}
