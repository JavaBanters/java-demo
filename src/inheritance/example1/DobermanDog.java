package inheritance.example1;

public class DobermanDog extends Dog{

    String name;

    public DobermanDog(int age, double weight, String colour, String name) {
        super("Doberman", age, weight, colour);
        this.name = name;
    }

    @Override
    public String toString() {
        return "DobermanDog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
