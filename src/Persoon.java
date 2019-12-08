public class Persoon {

    private static long aantalPersonen;
    private long id;
    private String naam;
    private Adres adres;

    public Persoon(String naam, Adres adres) {
        this.naam = naam;
        this.adres = adres;
        aantalPersonen++;
        id = aantalPersonen;
    }

    public Persoon() {
        this.naam = "onbekend";
        this.adres = new Adres();
        aantalPersonen++;
        id = aantalPersonen;
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public static long getAantalPersonen() {
        return aantalPersonen;
    }

    @Override
    public String toString() {
        return "[Persoon " + id + ": " + naam + ", " + "[" + adres + "]";
    }
}
