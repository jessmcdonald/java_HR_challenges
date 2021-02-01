import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
                
        for(int k=0;k<testCases;k++) {
            String even, odd;
            even = odd = "";
            
            String newString = scan.next();
            char[] charArray = newString.toCharArray();
            
            for (int i = 0; i < charArray.length; i += 2) {
                even += charArray[i];
            }
            for (int j = 1; j < charArray.length; j += 2) {
                odd += charArray[j];
            }
            System.out.println(even + " " + odd);
        }
    }
}