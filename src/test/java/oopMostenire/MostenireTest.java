package oopMostenire;

import org.testng.annotations.Test;

public class  MostenireTest {
    @Test
    public void metodaTest () {
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "nedeterminat",  10 );
        angajat.infoAngajat();
        System.out.println(angajat.getVarsta());
        angajat.setVarsta(26);
        System.out.println(angajat.getVarsta());
        angajat.mananca();
        angajat.afiseazaDetalii();

        angajat.ajungeLaTimpLaBirou();
        angajat.respectaRegulamentulIntern();
        angajat.munceste();

        angajat.mananca();
        angajat.afiseazaDetalii("Altex");
        angajat.afiseazaDetalii("Altex", true);

        System.out.println();
        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian", 34, "Viitorului 10", "fotbal", true, 6);
        sportiv.infoSportiv();
        sportiv.cautaSportivi("Fotbal",3);

        sportiv.mergeLaAntrenamente();
        sportiv.participaLaCompetitii();
        sportiv.respectaRegimAlimentar();

        sportiv.mananca();
        Student student = new Student("Robert","Petre", 35,"Electronicii 2", "Ion Mincu Timisoara", "IT", 2025, false);
        student.infoStudent();

        angajat.getSalariu();
        System.out.println(angajat.getSalariu());
    }
}
