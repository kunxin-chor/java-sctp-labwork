public class Product {
    private String name;
    private String sku;
    private double price;

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
        this.price = price;
    }

    // toString() is a special method
    // it will be called when we try to an object to a string
    public String toString() {
        return "name = " + name + ", sku = " + sku + ", price = " + price;
    }
}