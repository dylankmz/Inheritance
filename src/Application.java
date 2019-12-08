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

    }
}






