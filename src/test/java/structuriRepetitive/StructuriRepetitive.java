package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structurile repetitive: for, while, for-each, do-while;

    @Test

    public void metodaTest() {

//         afisareNumere(100);
//         afisareNumerePare(50);
        afisareNumereWhile(100);
    }

//    Afisam primele n numere

    public void afisareNumere(int capat) {

        for (int index = 0; index <= capat; index++) {

            System.out.println(" Vreau sa afisez numarul " + index);
        }

//        Afisam numere pare de la 0 la 50

    }


    //Metoda de mai sus cu "for" facuta cu "while"

    public void afisareNumereWhile(int capat) {

        int index = 0;
        while (index <= capat) {
            System.out.println(" Vreau sa afisez numarul" + index);
            index++;
        }
    }

    public void afisareNumerePare(int capat) {

        for (int index = 0; index <= capat; index++) {
            if (index % 2 == 0) {
                System.out.println("Vreau sa afisez:" + index);
            }
        }

    }
}