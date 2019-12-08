public class Application {

    public static void main(String[] args) {

        Voertuig v = new Voertuig();
        v.setMerk("Renault");
        v.setModel("Kerax");

        Auto a = new Auto();
        a.setMerk("Renault");
        a.setModel("r4");

        Moto m = new Moto();
        m.setMerk("Honda");
        m.setModel("AfricanTwin");

        Bus bus = new Bus(50);

        bus.setMerk("Irizar");
        bus.setModel("i8");

        bus.setAantalPassagiers(45);

        Bus bus2 = new Bus(122);
        bus2.setMerk("Volvo");
        bus2.setModel("XZE");

        Vrachtwagen vrachtwagen1 = new Vrachtwagen(50, true);
        vrachtwagen1.setMerk("Mercedes");
        vrachtwagen1.setModel("Actros");
        vrachtwagen1.setHuidigeLading(25);

        bus2.setAantalPassagiers(30);

        System.out.println(v.toString());
        System.out.println(a.toString());
        System.out.println(m.toString());
        System.out.println(bus.toString());
        System.out.println(bus2.toString());

        System.out.println(bus2.opstappen(10));
        System.out.println(bus2.getAantalPassagiers());
        bus2.afstappen(100);

        System.out.println(vrachtwagen1.toString());

        //OEF 2
        Vrachtwagen vrachtwagen2 = new Vrachtwagen("BMW", "X5", 50, true);

        //OEF 3
        Persoon p1 = new Persoon("Frans Dewitte", new Adres());
        p1.getAdres().setStad("Brussel");
        System.out.println(p1);

        Persoon p2 = new Persoon("Mahou Diabete", new Adres());
        p2.getAdres().setStad("Kidal");
        p2.getAdres().setLand("Mali");
        System.out.println(p2);

        //OEF 4

        //ik maak vier studenten en een Docent
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Docent d1 = new Docent();

        //ik geef naam en specialisatie aan de Docent
        d1.setNaam("Frans Langz");
        d1.setSpecialisatie("Muziek");

        //ik geef naam en specialisatie aan de Studenten
        s1.setSpecialisatie("Muziek");
        s1.setNaam("Mahou Diabete");
        s2.setSpecialisatie("Muziek");
        s2.setNaam("Mahou Diabete");
        s3.setSpecialisatie("Muziek");
        s3.setNaam("Mahou Diabete");
        s4.setSpecialisatie("Muziek");
        s4.setNaam("Mahou Diabete");


        //ik voeg de studenten in de array van de Docent
        d1.setStudenten(new Student[] {s1, s2, s3, s4});

        //ik roep de to string methode van de class Docent
        System.out.println(d1.toString());


    }
}






