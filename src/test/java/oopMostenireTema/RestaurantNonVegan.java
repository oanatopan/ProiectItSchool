package oopMostenireTema;

public class RestaurantNonVegan extends Restaurant implements RestaurantNonVeganInterface {
    private String specificMancare;
    private String feluriMancare;
    private String meniu;

    public RestaurantNonVegan(String nume, String adresa, double rating, boolean deschis,
                              String specificMancare, String feluriMancare, String meniu) {
        super(nume, adresa, "Non-Vegan", rating, deschis);
        this.specificMancare = specificMancare;
        this.feluriMancare = feluriMancare;
        this.meniu = meniu;
    }

    @Override
    public void infoRestaurant() {
        super.infoRestaurant();
        System.out.println("Specific: " + specificMancare);
        System.out.println("Feluri disponibile: " + feluriMancare);
    }

    @Override
    public void servesteMancareNonVegana() {
        System.out.println("Se pregătesc preparatele non-vegane: " + specificMancare);
    }

    @Override
    public void meniuNonVegan() {
        System.out.println("Meniu complet Non-Vegan: " + meniu);
    }
}