package arrays;

public class ArrayInitializationExample {

    public static void main(String[] args) {

        int [] arr = new int[5]; // declaring an array of size 5 []
                      //1  2   3    4   5
        int [] arr1 = {10, 20, 33, 40, 55};

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        for (int anjana : arr1) { //10, 20, 33, 40, 55
            System.out.println(anjana); // arr[0] arr[1] arr[2] arr[3] arr[4]

            for(int i = 1 ; i <= 10; i++) {
                System.out.println(anjana+ " * " + i + " = " + anjana * i);
            }

            System.out.println("======================");

        }

        System.out.println("---------------------------------");

        for(int i = 0 ; i < arr.length; i++) {
            System.out.println(arr[i]); // arr[0] arr[1] arr[2] arr[3] arr[4]

            for(int j = 1 ; j <= 10; j++) {
                System.out.println(arr[i]+ " * " + j+ " = " + arr[i] * j);
            }

            System.out.println("======================");
        }

    }

}
