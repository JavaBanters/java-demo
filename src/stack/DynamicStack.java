package stack;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int data) {
        if(isFull()) {
            int [] temp = new int[this.stack.length * 2];
            for(int i = 0; i< this.stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        super.push(data);
        return true;
    }

}
