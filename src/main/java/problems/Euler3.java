/*
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */

package main.java.problems;

public class Euler3 extends Euler {
    public void solve() {
        long number = 600851475143L;
        System.out.println("Give me a few years to complete....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException interup) {
            System.out.println("I was interrupted!");
        }
        // This is purely brute force, could just check the square root!
        for (long a = number - 1; a >= 1; a--) {
            System.out.println("Checking " + a);
            if (number % a == 0) {
                // Lets see if this baby is prime
                boolean is_prime = true;
                for (long b = 4; b <= a; b++) {
                    if (a % b == 0) {
                        is_prime = false;
                        break;
                    }
                }
                if (is_prime) {
                    System.out.println("This is the largest prime factor: " + a);
                    break;
                }
            }
        }
    }
}
