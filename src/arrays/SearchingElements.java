package arrays;

public class SearchingElements {

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 7, 9, 0, 10, 5, 3, 8, 9, 36, 23, 65};
        SearchingElements se = new SearchingElements();
        int target = 2;//-1`
        boolean result = se.findElement(array, target);
        //System.out.println(result);

        int index = se.findElementIndex(array, target);
        //System.out.println(index);

        int a = (int) 49.5;
        System.out.println(a);
    }

    public boolean findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
