package inheritance.example1;

public class Cat extends Animal {


    public Cat(String breed, int age, double weight, String colour) {
        super(breed, age, weight, colour);
    }

//    public Cat(String breed, int age, double weight) {
//        this.breed = breed;
//        this.age = age;
//        this.weight = weight;
//        this.colour = "blue";
//    }


    @Override
    public void makeASound() {
        System.out.println("meow meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
