package defaults;

public class Client123 implements Interface1, Interface2, Interface3{

    public void methodA() {
        System.out.println("Method A " + Client123.class);
    }
    public static void main(String[] args) {
      Client123 client123  = new Client123();
      client123.methodA(); //resolve to the child implementation
      client123.methodB();
      client123.methodC();
    }

}
