public class Vrachtwagen extends Voertuig {

    int maxLaadVermogen;
    int huidigeLading;
    boolean moreThanOneTrailer;

    public Vrachtwagen(int maxLaadVermogen, boolean moreThanOneTrailer) {
       super();
        this.maxLaadVermogen = maxLaadVermogen;
        this.moreThanOneTrailer = moreThanOneTrailer;
    }

    public Vrachtwagen(String merk, String model, int maxLaadVermogen,boolean moreThanOneTrailer) {
        super(merk, model);
        this.maxLaadVermogen = maxLaadVermogen;
        this.huidigeLading = huidigeLading;
        this.moreThanOneTrailer = moreThanOneTrailer;
    }

    public int getMaxLaadVermogen() {
        return maxLaadVermogen;
    }

    public void setMaxLaadVermogen(int maxLaadVermogen) {
        this.maxLaadVermogen = maxLaadVermogen;
    }

    public int getHuidigeLading() {
        return huidigeLading;
    }

    public void setHuidigeLading(int huidigeLading) {
        this.huidigeLading = huidigeLading;
    }

    public boolean isMoreThanOneTrailer() {
        return moreThanOneTrailer;
    }

    public void setMoreThanOneTrailer(boolean moreThanOneTrailer) {
        this.moreThanOneTrailer = moreThanOneTrailer;
    }

    public void laden(int laadGewicht) {
        if (laadGewicht + huidigeLading < maxLaadVermogen) {
            huidigeLading = laadGewicht + huidigeLading;
        } else
            System.out.println("Geen plaats meer in de vrachtwagen");
    }

    public void lossen() {
        this.huidigeLading = 0;
    }

    @Override
    public String toString() {
        return "[Vrachtwagen: " + getMerk() + " " + getModel() + ", " + "trailer: " + moreThanOneTrailer + ", Laadvermogen: " + maxLaadVermogen + "," + " Lading: " + huidigeLading + "]";
    }
}
