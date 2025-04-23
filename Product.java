// Parent class usually have the characters that shared among all the children

import java.util.Scanner;

public class Product {
    protected String name;
    protected String sku;
    protected double price;

    // A constructor is a special method
    // Its name is the same as the class name
    // It returns implictly an object of that class
    // Whenever we use `new Product()` -- the constructor is called
    // Default constructor -- it's the constructor called by default when use say new Product()
    // it's also used to set default values for the fields
    public Product(){
        // the `this` in the constructor refers to the new object
        // (aka instance of the class) that is being created
        this.name = "Untitled Product";
        this.sku = "0000";
        this.price = 0;
        // return this; // --> automatically done by the constructor
    }

    // Overloaded constructor
    public Product(String name, String sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            // An exception is an error in the form of an object
            // when a method throws an exception, its telling
            // the previous method that it got a problem
            throw new IllegalArgumentException("Invalid price");
            
        }
   
    }

    // toString() is a special method
    // it will be called when we try to an object to a string
    public String toString() {
        return "name = " + name + ", sku = " + sku + ", price = " + price;
    }

    public void display() {
        System.out.println("Product Name: " + getName());
        System.out.println("Product SKU: " + getSku());
        System.out.println("Product Price: " + getPrice());
    }

    // All products (i.e, this class and all its children)
    // are able to edit their details
    public void editDetails(Scanner sc) {
        System.out.print("Please enter the new name or press ENTER leave it unmodified: ");
        String newName = sc.nextLine();
        if (! newName.equals("")) {
            setName(newName); // update the name if the newName is not empty
        }

        System.out.print("Please enter the new SKU or press ENTER to leave it unmodified: ");
        String newSku = sc.nextLine();
        if (! newSku.equals("")) {
            setSku(newSku);
        }

        System.out.print("Please enter the new price or press ENTER to leave it as unmodified");
        String tempPrice = sc.nextLine();
        if (! tempPrice.equals("")) {
            double newPrice = Double.parseDouble(tempPrice);
            setPrice(newPrice);
        }

    }
}