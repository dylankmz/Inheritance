public class Moto extends Voertuig {

    public Moto(String merk, String model) {
        super(merk, model);
    }

    public Moto() {
    }

    @Override
    public String toString() {
        return "[Auto: " + this.getMerk() + " " + this.getModel() + "]";
    }
}

