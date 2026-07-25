package lab1;

import java.util.Scanner;

@FunctionalInterface
interface Fibonacci {
    int find(int n);
}

public class Task8_Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Fibonacci fib = (num) -> {
            if (num == 0)
                return 0;
            if (num == 1)
                return 1;

            int a = 0, b = 1;

            for (int i = 2; i <= num; i++) {
                int c = a + b;
                a = b;
                b = c;
            }

            return b;
        };

        System.out.println("Fibonacci = " + fib.find(n));

        sc.close();
    }
}
