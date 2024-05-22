package stack;

public class CustomStack {

    int[] stack; // declaration

    private static final int INITIAL_SIZE = 5;

    int ptr = -1;

    public CustomStack() {
        this(INITIAL_SIZE);
    }

    public CustomStack(int size) {
        this.stack = new int[size];
    }

    public boolean isEmpty() {
//        if(ptr == -1) {  // true / false
//            return true;
//        } else {
//            return false;
//        }
        return ptr == -1;
    }

    public boolean isFull() {
//        if(this.stack.length - 1 == ptr) {
//            return true;
//        } else {
//            return false;
//        }
        return this.stack.length - 1 == ptr;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        } else {
            ptr++;
            stack[ptr] = data;
            return true;
        }
    }


}
