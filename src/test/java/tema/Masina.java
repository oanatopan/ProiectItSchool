package tema;

import org.testng.annotations.Test;

@Test

public class Masina {

    public String marca;
    public String model;
    public int anProductie;
    public double cm3;
    public float greutate;
    public String taraOrigine;
    public boolean esteOffroad;


    @Test
    public void prezentareMasina() {
        marca = "Kia";
        model = "Creed";
        anProductie = 2008;
        cm3 = 2000;
        greutate = 20000;
        taraOrigine = "Coreea";
        esteOffroad = true;

        System.out.println("marca masinii este "+ marca);
        System.out.println("modelul masinii este "+ model);
        System.out.println("anProductie masinii este "+ 2008);
        System.out.println("cm3 masinii este "+ 2000);
        System.out.println("greutatea masinii este "+ 20000);
        System.out.println("taraOrigine masinii este "+ taraOrigine );
        System.out.println("este masina Offroad? este "+ esteOffroad);
    }


}

