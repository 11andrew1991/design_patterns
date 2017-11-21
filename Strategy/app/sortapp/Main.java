package sortapp;

import sortapp.strategies.BubbleSort;
import sortapp.strategies.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------BUBBLE SORT--------------");
        int[] array0 = {1, 5, 10, 20, 4, 3};
        SortArrayOfIntContext sortArrayOfInt = new SortArrayOfIntContext(new BubbleSort());
        System.out.println("[ARRAY 0] BEFORE: \t" + Arrays.toString(array0));
        sortArrayOfInt.sort(array0);
        System.out.println("[ARRAY 0] AFTER: \t" + Arrays.toString(array0));

        System.out.println("-------------INSERTION SORT-------------");
        int[] array1 = {1, 5, 10, 20, 4, 3};
        sortArrayOfInt = new SortArrayOfIntContext(new InsertionSort());
        System.out.println("[ARRAY 1] BEFORE: \t" + Arrays.toString(array1));
        sortArrayOfInt.sort(array1);
        System.out.println("[ARRAY 1] AFTER: \t" + Arrays.toString(array1));
    }
}
