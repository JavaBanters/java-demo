package arrays;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] arr = {1002, 2, 13, -123, -2,24,787,23,68,14,-8,0,2,6,8,9,1,4,56,7,6,8,78,78}; // {1,2,5,7,8}
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) { // i= 4 max

            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j]; //c = a
                    arr[j] = arr[j +1]; // a = b
                    arr[j+1] = temp; // b = c
                }
            }

        }

    }

}
