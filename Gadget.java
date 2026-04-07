public class Gadget {
  private String model;
  private double price;
  private int weight;
  private String size;
   
  Gadget(String model, double price, int weight, String size) {
    this.model = model;
    this.price = price;
    this.weight = weight;
    this.size = size;
  }
  
  public String getModel() {
      return model;
  }
  
  public double getPrice() {
      return price;
  }
  
  public int getWeight() {
      return weight;
  }
  
  public String getSize() {
      return size;
  }
  
  public void display() {
      System.out.println(model);
      System.out.println(price);
      System.out.println(weight);
      System.out.println(size);
  }
}


