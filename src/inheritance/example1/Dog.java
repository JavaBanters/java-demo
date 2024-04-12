package inheritance.example1;

public class Dog extends Animal{

    //Dog rocky = new Dog("labrador", 4, 10.0, "black");
    public Dog(String breed, int age, double weight, String colour) { //parameterized constructor
       super(breed, age,weight,colour);
    }

    @Override
    public void makeASound(){
        System.out.println("Bow Bow");
    }

//    public Dog(String breed, int age, double weight) {
//        this.breed = breed;
//        this.age = age;
//        this.weight = weight;
//        this.colour = "pink";
//    }

    @Override
    public String toString() {
        return "Dog's breed: " + this.breed + ", Dog's weight: " + this.weight + ", Dog's age: " + this.age + ", Dog's colour: " + this.colour;
    }


}
