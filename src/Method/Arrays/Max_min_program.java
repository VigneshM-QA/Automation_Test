package Method.Arrays;

public class Max_min_program {
    public static void main(String[] args) {
        int[] numbers = {67, 90, 12, 87, 34, 10, 56, 72};
        int max_value = give_max(numbers);
        int min_value = give_min(numbers);
        System.out.printf("The maximum number is %d", max_value);
        System.out.println();
        System.out.printf("The maximum number is %d", min_value);
    }

    static int give_max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int give_min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
