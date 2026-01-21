package accessControlV1;

public class Fruct {
    // sunt 4 acces control- public, private, protected si default
    //2 categorii unde le poti folosi-
    //1. cand vine voeba de mostenire ( in acelasi pachet/ in pachete diferite
    //2. cand vine vorba de obiect in acelasi pachet/ in pachete diferite
    // default nu inseamna public

    public void metodaPublica() {}
        private void metodaPrivata () {}
            protected void metodaProtected () {}
                void metodaDefault () {}
}
