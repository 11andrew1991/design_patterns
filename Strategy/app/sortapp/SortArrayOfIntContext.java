package sortapp;

import sortapp.strategies.Sorting;

public class SortArrayOfIntContext {

    private final Sorting sorting;

    public SortArrayOfIntContext(Sorting sorting) {
        this.sorting = sorting;
    }

    public void sort(int[] array) {
        this.sorting.sort(array);
    }

}
