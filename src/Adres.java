public class Adres {
    private String stad = "onbekend";
    private String land = "België";

    public Adres() {
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "Adres:" + " " + stad + ", " + land + "]";
    }
}
