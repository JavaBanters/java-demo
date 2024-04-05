package arrays;

public class ArrayElementCountOccurances {

    public int findOccurances(int [] array , int num) {
        int count = 0;

        for(int i = 0; i < array.length ; i++) {
            if (array[i] == num) { // array[0] == 6
                count = count + 1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 2, 4, 6, 8, 9, 1, 3, 5, 6, 7, 8, 9, 2, 3, 5, 7, 8, 4, 6, 8, 9};
        ArrayElementCountOccurances obj = new ArrayElementCountOccurances();
        int result = obj.findOccurances(array , 7);
        System.out.println(result);
    }

}
