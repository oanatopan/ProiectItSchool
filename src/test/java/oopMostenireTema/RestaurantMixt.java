package oopMostenireTema;

public class RestaurantMixt extends Restaurant implements RestaurantMixtInterface {
    private String feluriMancare;
    private String meniu;

    public RestaurantMixt(String nume, String adresa, double rating, boolean deschis,
                          String specificMancare, String feluriMancare, String meniu) {
        super(nume, adresa, "Mixt", rating, deschis);
        this.feluriMancare = feluriMancare;
        this.meniu = meniu;
    }

    @Override
    public void infoRestaurant() {
        super.infoRestaurant();
        System.out.println("Acest restaurant servește atât meniu Vegan cât și Non-Vegan.");
    }

    @Override
    public void servesteMancareVegana() {
        System.out.println("Servim opțiuni vegane din mixul nostru.");
    }

    @Override
    public void meniuVegan() {
        System.out.println("Secțiunea Vegană: " + meniu);
    }

    @Override
    public void servesteMancareNonVegana() {
        System.out.println("Servim opțiuni cu carne din mixul nostru.");
    }

    @Override
    public void meniuNonVegan() {
        System.out.println("Secțiunea Non-Vegana: " + meniu);
    }
}