import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static void getCountOfOnes(String m){
        int count = 0;
        int max = 0;
        
        for(int i = 0; i < m.length(); i++) {
            char number = m.charAt(i);
            int digit = number - '0';
            
            if (digit == 1){
                if(i < m.length()-1) {
                    count ++;
                } else {
                    count++;
                    if(count >= max) {
                        max = count;
                    }
                }
            } else {
                if(count >= max) {
                    max = count;
                    count = 0;
                } else {
                    count = 0;
                }
            }
        }
        System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String binary = Integer.toBinaryString(n);        
        getCountOfOnes(binary);

        scanner.close();
    }
}
