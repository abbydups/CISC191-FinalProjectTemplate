package edu.sdccd.cisc191.template;

/**
 * Plant Class is an abstract class representing a generic plant
 * It is used as a based class to create more specific type of plants
 */



public class Plant {
    /**
     * Plant name
     */
    private final String name;
    /**
     * Plant quantity
     */
    private final int quantity;

    /**
     * Constructor for a plant
     * @param name the name of the plant
     * @param quantity the quantity of the plant
     */
    public Plant(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * Get plant name
     * @return the name of the plant
     */
    public String getName() {
        return name;
    }

    /**
     * Get plant quantity
     * @return the quantity of plant
     */
    public int getQuantity() {
        return quantity;
    }







}
