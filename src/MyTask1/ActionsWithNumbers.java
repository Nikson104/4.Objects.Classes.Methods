package MyTask1;

import java.util.Arrays;
import java.util.Scanner;

public class ActionsWithNumbers {
    private int[] numbers;
    private Scanner scan;
    private int size;

    int[] inputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        System.out.println("Insert elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    void outputArray(int[] numbers) {
        System.out.println("Inserted elements: " + Arrays.toString(numbers));
    }

    void sorting (int [] numbers){
        Arrays.sort(numbers);
    }
}
