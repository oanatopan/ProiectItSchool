package oopMostenireTema;

public class Restaurant {
    private String nume;
    private String adresa;
    private String tip;
    private double rating;
    private boolean deschis;

    public Restaurant(String nume, String adresa, String tip, double rating, boolean deschis) {
        this.nume = nume;
        this.adresa = adresa;
        this.tip = tip;
        this.rating = rating;
        this.deschis = deschis;
    }

    public void infoRestaurant() {
        System.out.println("Nume: " + nume);
        System.out.println("Adresa: " + adresa);
        System.out.println("Tip: " + tip);
        System.out.println("Rating: " + rating);
        System.out.println("Deschis: " + (deschis ? "Da" : "Nu"));
    }

    // Gettere și Settere
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public String getAdresa() { return adresa; }
    public void setAdresa(String adresa) { this.adresa = adresa; }
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public boolean isDeschis() { return deschis; }
    public void setDeschis(boolean deschis) { this.deschis = deschis; }
}