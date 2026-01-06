package oopMostenireTema;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface {
    private String specificMancare;
    private String feluriMancare;
    private String meniu;

    public RestaurantVegan(String nume, String adresa, double rating, boolean deschis,
                           String specificMancare, String feluriMancare, String meniu) {
        super(nume, adresa, "Vegan", rating, deschis);
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
    public void servesteMancareVegana() {
        System.out.println("Se pregătesc preparatele vegane: " + specificMancare);
    }

    @Override
    public void meniuVegan() {
        System.out.println("Meniu complet Vegan: " + meniu);
    }
}
