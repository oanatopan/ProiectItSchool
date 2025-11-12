package obiectConstructor;

import org.testng.annotations.Test;
import java.util.Arrays;

public class MasinaTest {

    @Test
    public void masinaTest() {
        Masina Dacia = new Masina("Dacia", "Sandero", 2025, "Rosie",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), false);
        Dacia.prezentareMasina();
        Dacia.calculImpozit();
        System.out.println(" ");

        Masina Mercedes = new Masina("Mercedes", "c200", 2025, "Gri",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), true);
        Mercedes.prezentareMasina();
        Mercedes.calculImpozit();
        System.out.println(" ");


        Masina Volvo = new Masina("Volvo", "XC90", 2025, "Negru",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), true, 20000);
        Volvo.prezentareMasina();
        Volvo.calculImpozit();
    }
}