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

        int popped = (int) stack.pop();


        //System.out.println(stack.peek());

        System.out.println(popped);

    }

}
