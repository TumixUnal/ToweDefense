package data;

/**
 *
 * @author Alejandro Velasco
 */
public abstract class Animal {

    private String name;
    private double price;

    public Animal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   public abstract void printInfo();

    @Override
    public String toString() {
        return "Hi, my name is " + name + ", my price is $" + price;
    }
}
