package stack;


import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack stack = new Stack(); //Generics
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        int popped = (int) stack.pop();


        //System.out.println(stack.peek());

        System.out.println(popped);

        int [] arr = new int [5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int a = 10;

        //int [] arr = {1,2,3,4,5};

    }

}
