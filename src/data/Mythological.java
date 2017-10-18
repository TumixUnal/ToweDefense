package data;

/**
 *
 * @author Alejandro Velasco
 */
public abstract class Mythological extends Animal {

    private String country;
    private String mainCharacteristic;

    public Mythological(String country, String mainCharacteristic, String name, double price) {
        super(name, price);
        this.country = country;
        this.mainCharacteristic = mainCharacteristic;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMainCharacteristic() {
        return mainCharacteristic;
    }

    public void setMainCharacteristic(String mainCharacteristic) {
        this.mainCharacteristic = mainCharacteristic;
    }
    
    @Override
    public String toString() {
        return super.toString().concat(", I am from " + country + ", " + mainCharacteristic);
    }
}
