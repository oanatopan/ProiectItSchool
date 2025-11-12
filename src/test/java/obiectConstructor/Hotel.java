package obiectConstructor;

import java.lang.foreign.SequenceLayout;
import java.util.List;

public class Hotel {
    private String nume;
    private String adresa;
    private String oras;
    private String tara;
    private int numarStele;
    private List<String> facilitati;

    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
        this.nume= nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = numarStele;
        this.facilitati = facilitati;
    }

    public void prezentareHotel() {
        System.out.println("Detalii Hotel:");
        System.out.println("Nume:" +nume);
        System.out.println("Adresa:" +adresa + ", " + oras +", "+tara);
        System.out.println("Clasificare: " +numarStele +"  stele");
        System.out.println("Facilitati:");

        //Afiseaza facilitatiile separate prin virgula

        System.out.println(String.join(",",facilitati));
    }

    public void calculeazaPretCamera() {
        int pret = 0;

        switch (numarStele) {
            case 1:
                pret= 100;
                break;
            case 2:
                pret= 200;
                break;
            case 3:
                pret= 300;
                break;
            default:
                System.out.println("Pret Camera: Clasificare necunoscuta, nu se poate calcula pretul.");
                return;
        };
        System.out.println("Pret Camera: " + pret + " RON/noapte ( pentru un hotel de " + numarStele + " stele).");

    }
}
