/*
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

package main.java.problems;

public class Euler6 {
    public static void solve(){
        long sumSquare = 0;
        long squareSum = 0;
        for(int i = 1; i <= 100; i++){
            sumSquare += (long)Math.pow(i, 2);
            squareSum += i;
        }
        System.out.println("Answer is: " + ((long)Math.pow(squareSum, 2) - sumSquare));
    }
}
