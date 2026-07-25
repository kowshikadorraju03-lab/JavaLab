package lab1;

import java.util.Scanner;

@FunctionalInterface
interface DigitSum {
    int calculate(int num, String option);
}

public class Task7_DigitSumOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.print("Enter Option (even/odd): ");
        String option = sc.next();

        DigitSum ds = (n, opt) -> {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;

                if (opt.equalsIgnoreCase("even") && digit % 2 == 0)
                    sum += digit;
                else if (opt.equalsIgnoreCase("odd") && digit % 2 != 0)
                    sum += digit;

                n /= 10;
            }
            return sum;
        };

        System.out.println("Sum = " + ds.calculate(num, option));

        sc.close();
    }
}
