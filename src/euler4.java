/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class euler4 {
    public static void main(String[] args) {
        int largest = 0;
        for (int x = 999; x >= 1; x--) {
            for (int y = 999; y >= 1; y--) {
                int z = x * y;
                String numForwards = Integer.toString(z);
                String numBackwards = new StringBuilder(numForwards).reverse().toString();
                if (numForwards.equals(numBackwards)) {
                    if (z > largest) {
                        largest = z;
                        System.out.println("Current largest palindrome: " + largest);
                    }
                }
            }
        }
        System.out.println("Largest palindrome is " + largest);
    }
}
