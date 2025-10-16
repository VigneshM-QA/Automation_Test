package Method.Arrays;

import java.util.Scanner;

public class Array_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number"+(i+1)); // indexing + 1
            numbers[i] = sc.nextInt();
        }
        System.out.println("-----");
        //  print the numbers entered by user

        System.out.println("The numbers are");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
