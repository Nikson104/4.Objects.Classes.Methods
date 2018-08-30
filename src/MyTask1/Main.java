package MyTask1;

public class Main {
    public static void main(String[] args) {
        ActionsWithNumbers array = new ActionsWithNumbers();
        int [] numbers = array.inputArray();
        array.outputArray(numbers);
        array.sorting(numbers);
        array.outputArray(numbers);
    }

}
