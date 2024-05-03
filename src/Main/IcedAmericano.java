/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author danie
 */
public class IcedAmericano {

    private String name;
    private int size; // in ml (milliliters)
    private String description;

    public IcedAmericano(String name, int size) {
        this.name = name;
        this.size = size;
        this.description = "A refreshing blend of espresso and cold water, perfect for hot days.";
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