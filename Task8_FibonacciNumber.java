package lab1;

public class Task8_FibonacciNumber {

    public static void main(String[] args) {

        int n = 10;
        int first = 0;
        int second = 1;
        int next = 0;

        if (n == 1) {
            System.out.println("The " + n + "st Fibonacci number is: " + first);
        } else if (n == 2) {
            System.out.println("The " + n + "nd Fibonacci number is: " + second);
        } else {
            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("The " + n + "th Fibonacci number is: " + next);
        }
    }
}