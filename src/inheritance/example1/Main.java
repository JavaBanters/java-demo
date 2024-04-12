package inheritance.example1;

public class Main {

    public static void main(String[] args) {
        Dog tommy = new Dog("pitbull", 2, 4.5, "white"); // parametized constructor
        Dog rocky = new Dog("labrador", 4, 10.0, "black"); //default
       // Dog sweety = new Dog("spint", 3, 3.5);

        //tommy.age = 2; // initialization
        //tommy.weight = 4.5;
        //tommy.colour = "white";
        //tommy.breed = "pitbull";

//        System.out.println(tommy.age);
//        System.out.println(tommy.weight);
//        System.out.println(tommy.colour);
//        System.out.println(tommy.breed);
//
//        System.out.println(rocky.age);
//        System.out.println(rocky.weight);
//        System.out.println(rocky.colour);
//        System.out.println(rocky.breed);

//        System.out.println(sweety.age);
//        System.out.println(sweety.weight);
//        System.out.println(sweety.colour);
//        System.out.println(sweety.breed);

        //System.out.println(rocky);

        Cat tuktuk = new Cat("Abyssinian", 1 , 3.2, "white");
        //System.out.println(tuktuk);

        Cow bully = new Cow("Holstein Friesian", 10, 150.5,"brown");
        //System.out.println(bully);

        Bird bulbul = new Bird("Crow", 2, 13.6,"black");
        //System.out.println(bulbul);

        rocky.makeASound();

        bulbul.makeASound();

        tuktuk.makeASound();

        Animal dobermanDog = new DobermanDog(2, 13.6,"black", "Laika");
        System.out.println(dobermanDog);


    }

}
