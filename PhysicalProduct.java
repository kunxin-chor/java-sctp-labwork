import java.util.Scanner;

public class PhysicalProduct extends Product {
    // child classes can have their own fields
    // it can be private or protected (even public)
    protected String size;
    protected double weight;
    protected String color;

    // name, sku and price => parent class (aka. super class)
    // size, weight and color => physical product class (current child class)
    public PhysicalProduct(String name, String sku, double price, String size, double weight, String color) {
        //initialize the parent part of the class
        super(name, sku, price);
        // initialize the child part of the class
        this.size = size;
        this.weight = weight;
        this.color = color;
    }



    public PhysicalProduct() {
        // call the super constructor
        super();
        this.size = "N/A";
        this.weight = 0.0;
        this.color = "N/A";
    }

    

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        // super.toString() => call the parent's version of the toString method
        return super.toString() + ", PhysicalProduct [size=" + size + ", weight=" + weight + ", color=" + color + "]";
    }

    @Override
    // we use @Override to indicate to Java that this method overrides (in supercedes) the parent's version
    // using @Override is optional, don't have do it at all
    // if we tell Java that this method is overriding the parent, Java can do some optimization
    public void display() {
        super.display();
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
        System.out.println("Weight: " + getWeight());
    }

    @Override
    public void editDetails(Scanner sc) {
        super.editDetails(sc);
        System.out.print("Enter new size (or press ENTER to skip): ");
        String newSize = sc.nextLine();
        if (! newSize.equals("")) {
            setSize(newSize);
        }

        System.out.print("Enter new color (or press ENTER to skip): ");
        String newColor = sc.nextLine();
        if (! newColor.equals("")) {
            setColor(newColor);
        }

        System.out.println("Enter new weight (or press ENTER to skip): ");
        String tempWeight = sc.nextLine();
        if (! tempWeight.equals("")) {
            double newWeight = Double.parseDouble(tempWeight);
            setWeight(newWeight);
        }
    }

   
}


