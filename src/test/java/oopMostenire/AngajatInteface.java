package oopMostenire;

public interface AngajatInteface {
    // abstractizarea = conceptul prin care putem definii comportamentul unei clase
    // abstractizarea se poate face prin 2 feluri :
    // interfete
    // clase abstracte

    // interfetele contin doar metode abstracte (metodele nu au - body - )
    // toate metodele abstracte sunt publice
    // intr-o interfata putem defini metode cu void sau return
    // intr-o interfata nu putem avea un constructor- nu putem face un obiect
    // interfata se implanteaza - o interfata trebuie sa implementeze iar o clasa se mosteneste
    // clasa care implanteaza o interfata trebuie sa implementeze toate meyodele din ea
    // o clasa poate implementa mai multe interfete
    // o interfata poate mosteni alta interfata

    void ajungeLaTimpLaBirou ();
     void munceste ();
     void respectaRegulamentulIntern();


}
