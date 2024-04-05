package arrays;

public class ArrayDataFloatTypes {

    public void displayArrayElements(float [] num) {
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }

    public void displayName(String name ) {
        System.out.println("The name passed is " +name);
    }
    public static void main(String[] args) {
        float [] arr = new float[5]; // generics
        arr[0] = 0.1f;
        arr[1] = 1;
        arr[2] = 0.3f;
        arr[3] = 2;
        arr[4] = 2.5f;

        ArrayDataFloatTypes obj = new ArrayDataFloatTypes();

        obj.displayArrayElements(arr);
        obj.displayName("Anant");
    }

}
