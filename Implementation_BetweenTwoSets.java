import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Implementation_BetweenTwoSets {
    
    public static int gcd (int a, int b) {
        while(b > 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    
    public static int gcd (int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i ++) {
            result = gcd(result, input[i]);
        }
        return result;
    }
    
    public static int lcm (int a, int b) {
        return a*(b/gcd(a, b));
    }
    
    public static int lcm (int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        int A_LCM = lcm(a);
        int B_GCD = gcd(b);
        int count = 0;
        
        for (int i = 1; i <= B_GCD; i ++) {
            if ((B_GCD % (A_LCM * i)) == 0) {
                count++;
            } 
        }
        
        System.out.println(count);
        
    }
    
    
}
