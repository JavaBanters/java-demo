package inheritance.example1;

public class Animal {

    String breed;

    int age;

    double weight;

    String colour;

    public void makeASound(){
        System.out.println("ma karawdaichu");
    }

    //Dog rocky = new Dog("labrador", 4, 10.0, "black");
    //super(breed, age,weight,colour);
    public Animal(String breed, int age, double weight, String colour) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "this is from the parent Animal class";
    }
}
