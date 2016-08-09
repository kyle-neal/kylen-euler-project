/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

package main.java.problems;

public class Euler5 {
    public static void solve() {
        int x = 19;
        boolean solved = false;
        do {
            x++;
            for (int i = 1; i <= 20; i++) {
                if (x % i != 0) {
                    break;
                } else if (i == 20 && x % i == 0) {
                    solved = true;
                }
            }
        } while (!solved);
        System.out.println("Smallest number evenly divisible by 1-20 is " + x);
    }
}
