package oopMostenireTema;

import org.testng.annotations.Test;

public class MostenireTemaTest {

    @Test
    public void testRestaurante() {
        RestaurantVegan vegan = new RestaurantVegan("GreenLeaf", "Florilor 10", 4.8, true, "Bio", "Salate", "Meniu Vegan");
        RestaurantNonVegan nonVegan = new RestaurantNonVegan("Carne & Jar", "Republicii 88", 4.6, true, "Grill", "Fripturi", "Meniu Grill");
        RestaurantMixt mixt = new RestaurantMixt("Fusion", "Libertatii 5", 4.9, true, "International", "Mix Vegan/Meat", "Meniu Fusion");

        System.out.println("\n--- TEST VEGAN ---");
        vegan.infoRestaurant();
        vegan.servesteMancareVegana();

        System.out.println("\n--- TEST NON-VEGAN ---");
        nonVegan.infoRestaurant();
        nonVegan.servesteMancareNonVegana();

        System.out.println("\n--- TEST MIXT ---");
        mixt.infoRestaurant();
        mixt.servesteMancareVegana();
        mixt.servesteMancareNonVegana();
    }
}