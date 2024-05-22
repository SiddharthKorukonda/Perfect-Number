/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 2
   Question 4 (PerfectNumber.java)
 */

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = s.nextInt();

        String perfectNumbers = "";

        System.out.print("The perfect numbers below "+upperLimit+" are: ");
        for (int i=2; i<=upperLimit; i++) {
            int sum = 1;
            for (int j=2; Math.pow(j,2)<=i; j++) {
                if (i%j==0) {
                    sum+=j;
                    if (Math.pow(j,2)!=i) {
                        sum+=i/j;
                    }
                }
            }
            if (sum==i) {
                System.out.print(i+" ");
            }
        }
    }
}
