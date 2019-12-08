public class Student extends Persoon {

    private String specialisatie;

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }


    @Override
    public String toString() {
        return "[Student " + getId() + " : " + getNaam() + " , " + specialisatie + "]";
    }
}
