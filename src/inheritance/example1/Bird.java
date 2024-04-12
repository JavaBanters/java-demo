package inheritance.example1;

public class Bird extends Animal{

    public Bird(String breed, int age, double weight, String colour) {
        super(breed, age, weight, colour);
    }

    @Override
    public void makeASound() {
        System.out.println("chirp chirp");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
