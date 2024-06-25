package defaults;

public class Interface14 implements Interface1, Interface4{


    public void methodA() {
        System.out.println("Method A "+ Interface14.class);
    }

    public static void main(String[] args) {
        Interface14 client = new Interface14();
        client.methodA();
    }

}
