/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

package main.java.problems;

public class Euler7 extends Euler {
    private int target = 10001;

    public void solve() {
        int count = 0;
        int num = 1;
        do {
            num = num + 1;
            boolean is_prime = true;
            for (int i = 1; i <= num; i++) {
                if ((num % i == 0) && (i != num) && (i != 1)) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                count++;
                System.out.println("Current prime count: " + count + " given " + num);
            }
        } while (count != this.target);
        System.out.println("The " + count + "'st prime number is " + num);
    }
}
