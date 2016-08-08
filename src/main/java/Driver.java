package main.java;

import java.util.Scanner;

import main.java.problems.*;

public class Driver {
    public static void main(String[] args) {
        String choice;
        do {
            print_menu();
            Scanner sc = new Scanner(System.in);
            choice = sc.next();
            choice = choice.toLowerCase();
            // Clear the console
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (choice) {
                case "1":
                    Euler1.solve();
                    break;
                case "2":
                    Euler2.solve();
                    break;
                case "3":
                    Euler3.solve();
                    break;
                case "4":
                    Euler4.solve();
                    break;
                case "q":
                    break;
                case "quit":
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (!((choice.equals("quit")) || (choice.equals("q"))));
    }

    private static void print_menu() {
        System.out.println("");
        System.out.println("---------------MENU---------------");
        System.out.println("| 1) Multiples of 3 and 5        |");
        System.out.println("| 2) Even Fibonacci numbers      |");
        System.out.println("| 3) Largest Prime Factor        |");
        System.out.println("| 4) Largest Palindrome Product  |");
        System.out.println("|                                |");
        System.out.println("| q || quit) To Quit             |");
        System.out.println("----------------------------------");
        System.out.print("java_practice> ");
    }
}