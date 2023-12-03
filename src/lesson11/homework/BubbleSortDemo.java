package lesson11.homework;

import lesson11.ArraySort;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        System.out.println("Array before sort: ");

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arrayForSort);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));
    }
}
