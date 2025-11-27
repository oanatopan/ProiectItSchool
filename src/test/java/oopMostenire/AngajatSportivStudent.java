package oopMostenire;

public class AngajatSportivStudent extends Persoana implements AngajatInteface,SportivInterface, StudentInterface {
    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;

    private String sport;
    private boolean sportEchipa;
    private int experienta;

    private String facultate;
    private String domeniu;
    private int anul;

    public AngajatSportivStudent(String nume, String prenume, int varsta, String adresa, String firma, String contract, double salariu, int zileLibere, String sport, boolean sportEchipa, int experienta, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.contract = contract;
        this.salariu = salariu;
        this.zileLibere = zileLibere;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }

    private boolean restante;

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void respectaRegulamentulIntern() {

    }

    @Override
    public void mergeLaAntrenamente() {

    }

    @Override
    public void participaLaCompetitii() {

    }

    @Override
    public void respectaRegimAlimentar() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }
}


// facem o clasa generala- restaurant - declaram niste proprietati generale
// incepem sa facem variantele specifice- 2 clase (una restaurant vegan, una non vegan) . ambele mostenesc casa restaurant
//
// facem o interfata = restaurantveganinterface- defineste refulile pentru un restraurant vegan - 2 metode abstracte  = serveste mancare vegana- 2 meniu vegan
// la fel si pentru restaurant non vegan (2 metode abstracte - 1 servesteMancareNonVegana 2 MeniuNonVegan
// Deschidem un nou restaurant mixt ( o clasa Restaurant Mixt) care mosteneste clasa Restaurant care implementeaza ambele interfete