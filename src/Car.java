/**
 * CLASS: a blueprint or template.
 * Defines what attributes (fields) and behaviors (methods) its objects will have.
 * This class itself is NOT a car, it's the plan for building cars
 */

public class Car {

    //FIELDS: Attributes every car object will possess
    //These are declarations, not actual values yet.

    String make;
    String model;
    int year;

    /**
     * CONSTRUCTOR: The mechanism that turns this blueprint into a real object.
     * When called with 'new Car', Java allocates memory and populates
     * the object's fields with provided values.
     */
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * Method: A behavior that every Car object can perform.
     * Each object calls on its own data - same method, different results.
     */
    String describe(){
        return year + " " + make + " " + model;
    }

}
