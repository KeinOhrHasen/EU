package com.company;
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {
//        uncomment line to call functions
//        hypotenuse();
//        nextAndPrev();
//        divideAndConquer();
        divideAndConquerV2();
    }

    public static void hypotenuse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'a' leg");
        Integer a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter 'b' leg");
        Integer b = Integer.parseInt(scanner.nextLine());

        System.out.println("Hypotenuse equals to: " + Math.pow(0.5, Math.pow(2, a) + Math.pow(2, b)));
    };

    public static void nextAndPrev() {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());

        int prevDigit = digit - 1;
        int nextDigit = digit + 1;

        System.out.println(String.format("The next number for the number %d is %d", digit, nextDigit));
        System.out.println(String.format("The previous number for the number %d is %d", digit, prevDigit));
    }

    public static void divideAndConquer() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.toIntExact(k / n));
    }

    public static void divideAndConquerV2() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        System.out.println(k % n);
    }

}
