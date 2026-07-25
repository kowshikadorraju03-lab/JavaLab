package lab1;

import java.util.Scanner;

@FunctionalInterface
interface LastDigit {
    int getLastDigit(int n);
}

public class Task10_LastDigitSum {

    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Method Reference
        LastDigit ld = Task10_LastDigitSum::lastDigit;

        int sum = ld.getLastDigit(num1) + ld.getLastDigit(num2);

        System.out.println("Sum of last digits = " + sum);

        sc.close();
    }
}
