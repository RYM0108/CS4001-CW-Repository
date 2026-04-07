public class Mobile extends Gadget {
    private int credit;
     
    Mobile(String model, double price, int weight, String size, int credit) {
        super(model, price, weight, size);
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }
    
    public void addCredit(int amount) {
        if(credit > 0) {
            amount = amount + credit;
            this.credit = amount;
        } else {
            System.out.println("Enter positive Amount");
        }
    }
 
    public void makeCall(String phoneNumber, int duration) {
        this.credit = credit - duration; //Remaining Credits
        if(this.credit > 0) {
            System.out.println("Phone Number: "+ phoneNumber);
            System.out.println("Duration: " + duration);
            System.out.println(this.credit);
        } else {
            System.out.println("There is insufficient credit to make the call");
        }

    }
   
    public void display() {
       super.display();
       System.out.println(this.credit); //Outputs the remaining credit 
    }
    
    @Override
    public String toString() {
        return "[" + getModel() + ", " + getPrice() + ", " + getWeight() + ", " + getSize() + ", " + credit + "]";
    }
}