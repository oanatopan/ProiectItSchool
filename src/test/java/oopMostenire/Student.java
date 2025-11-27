package oopMostenire;

public class Student extends Persoana implements StudentInterface{

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }
        private String facultate;
        private String domeniu;
        private int anul;
        private boolean restante;

        public void infoStudent(){
        System.out.println("Facultatea la care studeaza este" + facultate);
        System.out.println("Domeniul in care lucreaza este" +domeniu);
        System.out.println("In ce an este studentul" +anul);
        System.out.println("Are restante" + restante );
    }
        public void mananca() {
            System.out.println("Studentul mananca printre cursuri");
        }

        public void cautaStudent () {
            System.out.println("Afisez toti studentii");
        }
        public void cautaStudent (String facultate, int anul) {
            System.out.println("Afisez studentii de la facultate" +facultate +anul);
        }
        public void cautaStudent(boolean restante){
            System.out.println(" Afisez studentii cu restanta " + restante);

        }
    public String getFacultate() {
        return facultate;
    }
    public String getDomeniu() {
        return domeniu;
    }
    public int getAnul() {
        return anul;
    }

    public boolean isRestante() {
        return restante;
    }

    @Override
    public void mergeLaCursuri() {
System.out.println("Studentul este obligat sa mearga la cursuri");
    }

    @Override
    public void trebuieSaStudieze() {
System.out.println("Studentul trebuie sa studieze");
    }

    @Override
    public void saNuAibaRestante() {
System.out.println("Studentul nu trebuie sa aiba restante");
    }
    // getter - ne da valoarea proprietatii
    // setter- modifica valoarea proprietatii
    // recomandat ar fi sa pornim intotdeauna cu private pentru a proteja datele, apoi expunem doar ce si cat e nevoie.
    // getter- se face tot timpul pentrub a putea citi valorile
    // setter- trebuie sa ne gandim daca face sens sa fie modificat
}
