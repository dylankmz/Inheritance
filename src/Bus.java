public class Bus extends Voertuig {

    private int maxAantalPassagiers;
    private int aantalPassagiers;

    public Bus(String merk, String model, int maxAantalPassagiers, int aantalPassagiers) {
        super(merk, model);
        this.maxAantalPassagiers = maxAantalPassagiers;
        this.aantalPassagiers = aantalPassagiers;
    }

    public Bus(int maxAantalPassagiers, int aantalPassagiers) {
        this.maxAantalPassagiers = maxAantalPassagiers;
        this.aantalPassagiers = aantalPassagiers;
    }

    public Bus(int maxAantalPassagiers) {
        this.maxAantalPassagiers = maxAantalPassagiers;

    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > maxAantalPassagiers) {

            System.out.println("max passagiers van bus : " + maxAantalPassagiers);
        } else {
            this.aantalPassagiers = aantalPassagiers;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;

    }

    public void setmaxAantalPassagiers(int maxAantalPassagiers) {
        this.maxAantalPassagiers = maxAantalPassagiers;
    }

    public int getMaxAantalPassagiers() {
        return maxAantalPassagiers;
    }

    public boolean opstappen(int aantalPersonen) {
        if (aantalPassagiers + aantalPersonen > maxAantalPassagiers) {
            System.out.println("Niet mogelijk bus is vol");
            return false;
        } else {

            this.aantalPassagiers = aantalPassagiers + aantalPersonen;
            return true;
        }
    }


    public boolean afstappen(int aantalPersonen) {
        if (aantalPersonen < aantalPassagiers) {
            aantalPassagiers = aantalPassagiers - aantalPersonen;
            System.out.println("Passagier zijn afgestapt");
            return true;
        } else {
            System.out.println("Wrong input: aantal personen mag niet kleiner zijn dan aantal passagiers in de bus");
            return false;
        }
    }


    @Override
    public String toString() {
        return "[Bus: " + this.getMerk() + " " + this.getModel() + ", passagiers " + "max" + this.getMaxAantalPassagiers() + ": " + getAantalPassagiers() + "]";
    }
}
