import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Implementation_AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int[] apple_falled = new int[m];
        int[] orange_falled = new int[n];
        
        for(int apple_i=0; apple_i < m; apple_i++){
            apple_falled[apple_i] = a + apple[apple_i];
        }
        for(int orange_i=0; orange_i < n; orange_i++){
           orange_falled[orange_i] = b + orange[orange_i];
        }
        
        int apple_count = 0;
        int orange_count = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            if (s <= apple_falled[apple_i] && apple_falled[apple_i] <= t) {
                apple_count ++;
            }
        }
        for(int orange_i=0; orange_i < n; orange_i++){
           if (s <= orange_falled[orange_i] && orange_falled[orange_i] <= t) {
                orange_count ++;
            }
        }
        
        System.out.println(apple_count);
        System.out.println(orange_count);
        
    }
}
