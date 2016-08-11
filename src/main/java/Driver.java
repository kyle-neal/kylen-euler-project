package main.java;

import java.util.Scanner;

import main.java.problems.*;

public class Driver {
    public static void main(String[] args) {
        Euler problems[] = {
                null, // Using index of 1-8
                new Euler1(),
                new Euler2(),
                new Euler3(),
                new Euler4(),
                new Euler5(),
                new Euler6(),
                new Euler7(),
                new Euler8()
        };
        do {
            print_menu();
            int choice = get_choice(problems.length - 1);
            problems[choice].solve();
        } while (true);
    }

    private static int get_choice(int max) {
        do {
            System.out.print("java_practice> ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                if (choice <= 0 || choice > max) {
                    System.out.println("Invalid choice, please choose a number between 0 and " + max);
                } else {
                    return choice;
                }
            } else {
                String choice;
                choice = sc.next();
                choice = choice.toLowerCase();
                if (choice.equals("q") || choice.equals("quit")) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice, please choose a number between 0 and " + max);
                }
            }
        } while (true);
    }

    private static void print_menu() {
        System.out.println("---------------MENU---------------");
        System.out.println("| 1) Multiples of 3 and 5        |");
        System.out.println("| 2) Even Fibonacci numbers      |");
        System.out.println("| 3) Largest Prime Factor        |");
        System.out.println("| 4) Largest Palindrome Product  |");
        System.out.println("| 5) Smallest Multiple           |");
        System.out.println("| 6) Sum Square Difference       |");
        System.out.println("| 7) 10001st Prime               |");
        System.out.println("| 8) Largest Product in a Series |");
        System.out.println("|                                |");
        System.out.println("| q || quit) To Quit             |");
        System.out.println("----------------------------------");
    }
}