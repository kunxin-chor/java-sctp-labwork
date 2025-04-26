// it's sold (and so shall be taxed)
public class Membership implements ITaxable {
    private String type;
    private double cost;
  
    public Membership(String type, double cost) {
      this.type = type;
      this.cost = cost;
    }
  
    public String getType() {
      return type;
    }
  
    public void setType(String type) {
      this.type = type;
    }
  
    public double getCost() {
      return cost;
    }
  
    public void setCost(double cost) {
      this.cost = cost;
    }
  
    public double calculateSalesTax() {
       return this.cost * 0.3;
    }

    public String toString() {
        return "Membership: "  + type + ", cost =" + calculateSalesTax();
    }
  
}