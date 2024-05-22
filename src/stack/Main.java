package stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CustomStack cs = new CustomStack();
        System.out.println(cs.stack.length);
        //System.out.println(cs.isEmpty());
        System.out.println(cs.push(1));
        System.out.println(cs.push(2));
        System.out.println(cs.push(3));
        System.out.println(Arrays.toString(cs.stack));
        System.out.println(cs.push(4));
        System.out.println(cs.push(5));
        //System.out.println(cs.isFull());
        System.out.println(cs.push(6));
        System.out.println(Arrays.toString(cs.stack));



    }

}
