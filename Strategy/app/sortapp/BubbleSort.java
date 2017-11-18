package sortapp;

public class BubbleSort implements Sorting {

    public void sort(int[] array) {
        int i = 0, n = array.length;
        boolean swapNeeded = true;

        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapNeeded = true;
                }
            }

            if (!swapNeeded) {
                break;
            }

            i++;
        }
    }
}