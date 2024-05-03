/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author danie
 */
public class CoffeeMilk {

    private String name;
    private int size; // in ml (milliliters)
    private String description;

    public CoffeeMilk(String name, int size) {
        this.name = name;
        this.size = size;
        this.description = "A creamy and flavorful combination of espresso, milk, and a touch of sweetness.";
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
}