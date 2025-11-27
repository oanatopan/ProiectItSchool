
package oopMostenire;
public class Persoana {

    //OOP-programare orientata pe obiect
    // cele 4 principii de baza sunt : mostenire, abstractizare, incapsulare si polimorfism
    //mostenirea reprezinta conceptul prin care o clasa copil moste neste o clasa parinte
    // prin mostenire clasa copil preia toate artributele si metodele clasei parinte
    // in momentul in care o clasa copil mosteneste o clasa parinte constructorul clasei copil trebuie sa apeleze construvorul din clasa parinte
    //acesrt lucru se realizeaza folosind keyword-ul "super"
    // mostenirea se declara la nivel de clasa folosind cuvantul keyword " extends"
    // in java o clasa poate mosteni doar o singura alta clasa (mostenire unica )

    // getter - ne da valoarea proprietatii
    // setter- modifica valoarea proprietatii
    // recomandat ar fi sa pornim intotdeauna cu private pentru a proteja datele, apoi expunem doar ce si cat e nevoie.
    // getter- se face tot timpul pentrub a putea citi valorile
    // setter- trebuie sa ne gandim daca face sens sa fie modificat


    // polimorfismul este conceptul prin care o metoda poate avea interpretari diferite
    // este de 2 feluri - static (overload) si dinamic (override)
    // intro ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    // polimorfismul dinamic se regaseste doar atunci unde exista mostenire

    private String nume;
    private String prenume;
    private int varsta;
    private String adresa ;

    public Persoana(String nume,String prenume, int varsta,  String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }
    public void infoPersoana() {
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
        System.out.println("Adresa  persoanei este " + adresa);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    // polimorfism dinamic
    public void mananca(){
        System.out.println("Persoana mananca atunci cand ii este foame");
    }
}
