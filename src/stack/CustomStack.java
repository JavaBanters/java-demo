package stack;

public class CustomStack {

    int[] stack;

    private static final int INITIAL_SIZE = 5;

    int ptr = -1;

    public CustomStack() {
        this(INITIAL_SIZE);
    }

    public CustomStack(int size) {
        this.stack = new int[size];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return this.stack.length - 1 == ptr;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        } else {
            stack[++ptr] = data;
            return true;
        }
    }

//    public boolean pop() {
//        if(isEmpty()){
//            System.out.println("The stack is empty from pop");
//            return false;
//        } else {
//            ptr--;
//            return true;
//        }
//    }

    public int pop() {
        if(isEmpty()){
            System.out.println("The stack is empty from pop");
            return -1;
        } else {
            return this.stack[ptr--]; // 50 -> 4 ||  40 -> 3 || 30 -> 2
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("The stack is empty from peek");
            return -16465785;
        }
       return this.stack[ptr];
    }


}
