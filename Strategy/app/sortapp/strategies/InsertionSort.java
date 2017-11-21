package sortapp.strategies;

public class InsertionSort implements Sorting {

    public void sort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int valueToSort = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > valueToSort) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = valueToSort;
        }
    }
}
