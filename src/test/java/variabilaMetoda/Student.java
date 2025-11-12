package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //O clasa este un sablon care defineste comportamentul unei entitati din viata reala
    //Intr-un fisier java recunoastem o clasa dupa cuvatul cheie "class"
    //o clasa este obligatoriu sa aiba un nume
    //o clasa contine variabile si metode
    //o variabila este proprietatea unei clase
    // o variabila poate fi de doua feluri- locala si globala
    //globala este o variabila pe care o declaram la inceputul clasei si este vizibila in tot fisierul
    // este o variabila pe care o declaram in interiorul unei metode si este vizibila doar acolo
    //o variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //o variabila nu trebuie sa contina intotdeauna o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //o metoda este o actiune a unei clase

    //o clasa poate avea mai multe metode care se diferenteaza prin numele lor
    //metodele pot fi de doua feluri : void si return
    // o medoda cu void are rolul de a executa actiunea si sa o afiseze
    // o metoda cu void trebuie sa contina access control (public) , cuvantul cheie "void", nummele metodei () si {}
    @Test
    public void prezentareStudent() {
        nume="Topan";
        prenume="Oana";
        varsta=33;
        inaltime=1.6;
        greutate=48f;
        adresa="Republici 41";
        sex='f';
        areRestante=false;
        //ca sa selectezi tot textul apesi ctrl =a
        //ca sa aliniezi tot textul apesi ctrl +l
        // recine la ce era inainte ctril +z

        // System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");
        //   System.out.print(prenume+" ");
        //  System.out.print(varsta+" ");
        //   System.out.print(inaltime+" ");
        //  System.out.print(greutate+" ");
        //  System.out.print(adresa+" ");
        //  System.out.print(sex+" ");
        //  System.out.print(areRestante+" ");

        //concatenarea este lipirea unuia sau mai multor stringuri si lipirea se face cu + " "


        System.out.println("numele studentului este "+nume);
        System.out.println("prenumele studentului este "+prenume);
        System.out.println("inalitimea studentului este "+inaltime);
        System.out.println("greutatea studentului este "+greutate);
        System.out.println("adresa studentului este "+adresa);
        System.out.println("sexul studentului este "+sex);
        System.out.println("are studentul restante? este "+areRestante);

        //print inseamna ca afiseaza valoarea si ramane pe randul curent
        //println inseamna ca afiseaza valoarea si merge la randul urmator
    }


}