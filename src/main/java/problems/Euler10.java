/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

package main.java.problems;

public class Euler10 extends Euler {
    private long max = 2000000;

    // TODO: Correct, but slow as f***!
    public void solve() {
        // Set sum equal to first prime
        long sum = 2;
        // We'll skip all the evens, they're never prime
        for (long x = 3; x < max; x = x + 2)
            if (isPrime(2, x)) sum += x;
        System.out.println("Sum is " + sum);
    }

    private boolean isPrime(long divisor, long x) {
        do {
            if (x % divisor == 0) return false;
            divisor++;
        } while (2 * divisor < x);
        return true;
    }
}
