/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author danie
 */
public class CoffeeShop {

    public static void main(String[] args) {
        // Create IcedAmericano object
        IcedAmericano icedAmericano = new IcedAmericano("A", 100);

        // Create CoffeeMilk object
        CoffeeMilk coffeeMilk = new CoffeeMilk("B", 250);

        // Create Latte object
        Latte latte = new Latte("C", 1000);

        // Print IcedAmericano details
        System.out.println("=== IcedAmericano ===");
        System.out.println("Name: " + icedAmericano.getName());
        System.out.println("Size: " + icedAmericano.getSize() + " ml");
        System.out.println("Description: " + icedAmericano.getDescription());
        System.out.println();

        // Print CoffeeMilk details
        System.out.println("=== CoffeeMilk ===");
        System.out.println("Name: " + coffeeMilk.getName());
        System.out.println("Size: " + coffeeMilk.getSize() + " ml");
        System.out.println("Description: " + coffeeMilk.getDescription());
        System.out.println();

        // Print Latte details
        System.out.println("=== Latte ===");
        System.out.println("Name: " + latte.getName());
        System.out.println("Size: " + latte.getSize() + " ml");
        System.out.println("Description: " + latte.getDescription());
        System.out.println();
    }
}