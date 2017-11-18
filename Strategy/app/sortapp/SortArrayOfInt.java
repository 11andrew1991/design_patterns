package sortapp;

public class SortArrayOfInt {

    private final Sorting sorting;

    public SortArrayOfInt(Sorting sorting) {
        this.sorting = sorting;
    }

    public void sort(int[] array) {
        this.sorting.sort(array);
    }

}
