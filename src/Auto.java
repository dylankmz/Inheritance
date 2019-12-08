public class Auto extends Voertuig {

    public Auto(String merk, String model) {
        super(merk, model);
    }

    public Auto() {
    }

    @Override
    public String toString() {
        return "[Auto: " + this.getMerk() + " " + this.getModel() + "]";
    }
}