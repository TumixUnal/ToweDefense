package data;

/**
 *
 * @author Alejandro Velasco
 */
public class Chimera extends Mythological {

    private String booksExperience;

    public Chimera(String booksExperience, String country, String mainCharacteristic, String name, double price) {
        super(country, mainCharacteristic, name, price);
        this.booksExperience = booksExperience;
    }

    public String getExperience() {
        return booksExperience;
    }

    public void setExperience(String booksExperience) {
        this.booksExperience = booksExperience;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and I have appeared in " + booksExperience);
    }
}
