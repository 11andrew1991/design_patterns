package sortapp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 10, 20, 4, 3};

        Sorting sorting = new BubbleSort();
        SortArrayOfInt sortArrayOfInt = new SortArrayOfInt(sorting);
        sortArrayOfInt.sort(array);
        System.out.println(Arrays.toString(array));

        sorting = new InsertionSort();
        sortArrayOfInt = new SortArrayOfInt(sorting);
        sortArrayOfInt.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
