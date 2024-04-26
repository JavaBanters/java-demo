package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        //int[] arr = {1002, 2, 13, -123, -2,24,787,23,68,14,-8,0,2,6,8,9,1,4,56,7,6,8,78,78}; // {1,2,5,7,8}
        int [] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
                int lastIndex = arr.length - 1 - i;
                int maxIndex = findMax(arr, lastIndex);
                swap(arr, lastIndex, maxIndex);
        }
    }

    private static void swap(int[] arr, int lastIndex, int maxIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int findMax(int[] arr, int lastIndex) {
        int maxIndex = 0;
        for(int i = 1; i <= lastIndex; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
