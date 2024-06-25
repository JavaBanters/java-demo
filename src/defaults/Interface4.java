package defaults;

public interface Interface4 {

    default void methodA() {
        System.out.println("Method A "+ Interface1.class);
    }
}
