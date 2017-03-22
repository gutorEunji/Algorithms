import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Implementation_GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int grade[] = new int[n];
        int finalGrade[] = new int[n];
        
        for(int a0 = 0; a0 < n; a0++){
            grade[a0] = in.nextInt();
        }
        
        for(int a0 = 0; a0 < n; a0++){
            
            if (grade[a0] < 38) {
                finalGrade[a0] = grade[a0];
            }
            else if (grade[a0] % 5 > 2) {
                finalGrade[a0] = (5 - (grade[a0] % 5) + grade[a0]);
            }
            else {
                finalGrade[a0] = grade[a0];
            }
        }
        
        for(int a0 = 0; a0 < n; a0++){
            System.out.println(finalGrade[a0]);
        }        
        
    }
}
