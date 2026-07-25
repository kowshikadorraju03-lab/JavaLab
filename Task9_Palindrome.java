package lab1;

import java.util.Scanner;

@FunctionalInterface
interface Palindrome {
    boolean check(int n);
}

public class Task9_Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Palindrome p = (n) -> {
            int original = n;
            int reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            return original == reverse;
        };

        if (p.check(num))
            System.out.println(num + " is a Palindrome Number.");
        else
            System.out.println(num + " is Not a Palindrome Number.");

        sc.close();
    }
}
