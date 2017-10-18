package data;

/**
 *
 * @author Alejandro Velasco
 */
public class NemeaLion extends Mythological {

    private String trophies;

    public NemeaLion(String trophies, String country, String mainCharacteristic, String name, double price) {
        super(country, mainCharacteristic, name, price);
        this.trophies = trophies;
    }

    public String getTrophies() {
        return trophies;
    }

    public void setTrophies(String trophies) {
        this.trophies = trophies;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and I have killed " + trophies);
    }
}
