package arrays;


import java.util.Scanner;

public class ArrayDataStringTypes {

    public void displayArrayElements(String[] num, Scanner obj) {
        System.out.println("Enter the elements you want to store in the array of size " + num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element for index number " + i);
            String element = obj.next();
            num[i] = element;
        }

        System.out.println("Displaying array elements");
        for (int i = num.length - 1; i >= 0; i--) { // i = 4 3 2 1 0 -1
            System.out.println(num[i]); //num[4] num[3]......
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        String[] elements = new String[size]; // int [] arr = new int[5]

        System.out.println("Printing out elements array after creation");
        for(String element : elements) {
            System.out.print(element+ " ");
        }
        // elements[0] = Anant
        // elements[1] = Anjana
        // elements[2] = Dolker
        //elements[3] = Zimpa
        //elements[4] = Santhi
        ArrayDataStringTypes array = new ArrayDataStringTypes(); //creating an object
        array.displayArrayElements(elements, sc);

    }

}
