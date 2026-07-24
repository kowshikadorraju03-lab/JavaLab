package lab1;

import java.util.Arrays;

public class Task5_KthSmallestElement {

    public static void main(String[] args) {

        int[] arr = {12, 3, 5, 7, 19};
        int k = 3;

        Arrays.sort(arr);

        System.out.println("The " + k + "rd smallest element is: " + arr[k - 1]);
    }
}