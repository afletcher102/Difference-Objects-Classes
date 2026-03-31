/**
 * Demonstration: Objects vs Classes
 * CLASS > Blueprint. Defined once. Describes structure and behavior.
 * OBJECT > A real instance built from the blueprint. Lives in memory. Holds actual data.
 */

public class Main {

    public static void main(String[] args) {

        //Creating Objects (instances) from the Car Class (blueprint)

        //'Car' on the left = the class
        //'carOne'          = the variable name for this object
        //'new Car'         = instantiation - allocates memory, creates the object

        Car carOne = new Car("Nissan", "Rogue", 2020);
        Car carTwo = new Car("Honda", "Civic", 2023);

        //Key difference #1: A class is singular; objects are many.
        //Define One class (Car), but created Two distinct objects from it.

        //Each object occupies its own memory and holds its own data.
        System.out.println("Car 1: " + carOne.describe()); //2020 Nissan Rogue
        System.out.println("Car 2: " + carTwo.describe()); //2023 Honda Civic

        //Key difference #2: Objects own their data independently.
        //Changing one object does not affect the other.
        carOne.year = 2021;
        System.out.println("\nAfter updating carOne.year:");
        System.out.println("Car 1: " + carOne.describe()); //year is not 2021
        System.out.println("Car 2: " + carTwo.describe()); //year unchanged

        //Key difference #3: The class never changes; objects are dynamic.
        //Car blueprint stayed exactly the same throughout.
        //Only the objects (instances) hold and mutate state.
        System.out.println("\nBoth objects share the same Car class blueprint,");
        System.out.println("but each is an independent entity in memory.");
    }
}
