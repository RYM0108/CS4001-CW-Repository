public class MP3 extends Gadget {
    private int memory;

    MP3(String model, double price, int weight, String size, int memory) {
        super(model, price, weight, size);
        this.memory = memory;

    }

    public int getMemory() {
        return memory;
    }

    public void downloadMusic(int size) {  
        if(size < 0) {
            System.out.println("Cannot accept Negative Values");
        } else if(this.memory - size < 0) {
            this.memory = this.memory - size;
            System.out.println("Error: No more available memory");
        } else {
            this.memory = memory - size; 
            System.out.println("Download Size (GB): "+ this.memory);
        }
    }

    public void deleteMusic(int memoryUsed) {
        if (memoryUsed < 0) {
            System.out.println("Cannot accept Negative Values");
        } else {
            this.memory = this.memory + memoryUsed;
            System.out.println(this.memory);
        }
    }

    public void display() {
        super.display();
        System.out.println(this.memory); //Outputs the available memory
    }
    
    @Override
    public String toString() {
        return "[" + getModel() + ", "+ getPrice() + ", " + getWeight() + ", " + getSize() + ", " + memory  + "]";
    }
}