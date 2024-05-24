package stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CustomStack cs = new CustomStack();
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        System.out.println(cs.peek());

        cs.pop();
        System.out.println(cs.peek());
        cs.pop();
        System.out.println(cs.peek());
        cs.pop();
        System.out.println(cs.peek());
        cs.pop();
        System.out.println(cs.peek());
        cs.pop();
        System.out.println(cs.peek());
        cs.pop();









    }

}
