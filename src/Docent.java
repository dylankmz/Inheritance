import java.util.Arrays;

public class Docent extends Persoon {

    private String specialisatie;

    private Student[] studenten;

    public Student[] getStudenten() {
        return studenten;
    }

    public void setStudenten(Student[] studenten) {
        this.studenten = studenten;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    @Override
    public String toString() {
        return "Docent{" + "specialisatie='" + specialisatie + '\'' + ", studenten=" + Arrays.toString(studenten) + '}';
    }
}
