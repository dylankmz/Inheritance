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

    public String[] getStudentNamesOnly() {
        String[] names = new String[studenten.length];

        for (int i = 0; i < studenten.length; i++) {
            names[i] = studenten[i].getNaam();
        }
        return names;
    }

    @Override
    public String toString() {


        return "[Docent " + getId() + " : " + getNaam() + " , specialisatie: " + specialisatie + " , (studenten: " + Arrays.toString(getStudentNamesOnly());
    }
}
