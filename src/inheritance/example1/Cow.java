package inheritance.example1;

public class Cow extends Animal{
    public Cow(String breed, int age, double weight, String colour) {
        super(breed, age, weight, colour);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
