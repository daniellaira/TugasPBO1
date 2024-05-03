/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author danie
 */
public class Latte {

    private String name;
    private int size; // in ml (milliliters)
    private String description;

    public Latte(String name, int size) {
        this.name = name;
        this.size = size;
        this.description = "A smooth and balanced mix of espresso, steamed milk, and a layer of foamed milk.";
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
