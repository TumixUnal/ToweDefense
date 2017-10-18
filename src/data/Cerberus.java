package data;

/**
 *
 * @author Alejandro Velasco
 */
public class Cerberus extends Mythological {

    private String lastJob;

    public Cerberus(String lastJob, String country, String mainCharacteristic, String name, double price) {
        super(country, mainCharacteristic, name, price);
        this.lastJob = lastJob;
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }
    
   

    @Override
    public String toString() {
        return super.toString().concat(" and my last job was " + lastJob);
    }
}
