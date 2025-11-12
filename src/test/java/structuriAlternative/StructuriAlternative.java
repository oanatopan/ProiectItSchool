package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // in programare exista 2 tipuri de structuri- alternative si repetitive;
    //structurile alternative: if... then... else/switch... case;

    @Test
    public void metodaTest() {
        //verificarePersoanaMajora (16);
        //verificarePersoanaMajora (21);

        //verificareNumarPar (25);
        //verificareNumarPar (20);
        // verificareNumar(30);
        zileleSaptamanii(5);
    }

    public void verificarePersoanaMajora(int varsta) {
        if (varsta >= 18) {
            System.out.println("Persoana cu varsta " + varsta + " este majora.");
        } else {
            System.out.println("Persoana cu varsta " + varsta + " este minora.");
        }

    }

    public void verificareNumarPar(int numar) {
        System.out.println(numar + "este numar impar. ");

    }


    public void verificareNumar(int numar) {
        if (numar > 0 && numar % 5 == 0) {
            System.out.println(numar + "este pozitiv, si/ sau divizibil cu 5.");
        } else {
            System.out.println(numar + "nu este pozitiv, si/ sau divizibil cu 5.");

        }
    }

    public void zileleSaptamanii(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni");
            case 2:
                System.out.println("Astazi este marti");
            case 3:
                System.out.println("Astazi este miercuri");
            case 4:
                System.out.println("Astazi este joi");
            case 5:
                System.out.println("Astazi este vineri");
            case 6:
                System.out.println("Astazi este sambata");
            case 7:
                System.out.println("Astazi este duminica");


        }
    }
}