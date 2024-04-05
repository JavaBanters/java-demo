package arrays;

public class ArrayFindLargestNumber {

    // find smallest number in an array
    public void findLargestNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] > max) {
               max = nums[i];
           }
        }
        System.out.println("The maximum value is "+max);
    }

    public int getLargestNumber(int [] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max; // -2
    }

    public static void main(String[] args) {

        int[] array = {-2, -5, -6000, -8, -10, -34, -26, -1009, -100, -2005};
        ArrayFindLargestNumber obj = new ArrayFindLargestNumber(); //constructor
        int result = obj.getLargestNumber(array);
        System.out.println(result);
    }

}
