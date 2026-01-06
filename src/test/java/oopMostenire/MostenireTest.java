package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test

    public void metodaTest() {
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "nedeterminat", 10);
        angajat.infoAngajat();
        System.out.println();
        angajat.getSalariu();
        System.out.println(angajat.getSalariu());

        System.out.println(angajat.getNume());

        angajat.setNume("Andrei");
        System.out.println(angajat.getNume());

        angajat.setVarsta(36);
        System.out.println(angajat.getVarsta());

        angajat.mananca();
        angajat.afiseazaDetalii("Alte", true);
        angajat.afiseazaDetalii("Altex");
        angajat.afiseazaDetaliile();
        angajat.ajungeLaTimpLaBirou();
        angajat.respectaRegulamentulIntern();
        angajat.munceste();

        System.out.println();
        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian", 34, "Viitorului 10", "fotbal", true, 6);
        sportiv.infoSportiv();

        sportiv.cautaSportivi("Fotbal", 3);

        sportiv.mananca();
        sportiv.mergeLaAntrenamente();
        sportiv.participaLaCompetitii();
        sportiv.respectaRegimul();

        System.out.println();
        Student student = new Student("Robert", "Petrovici", 35, "Electronicii 2", "Ion Mincu Timisoara", "IT", 2025, false);
        student.infoStudent();
        student.mananca();
        student.mergeLaCursuri();
        student.trebuieSaStudieze();
        student.saNuAibaRestante();

    }
}