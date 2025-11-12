package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {
    public String tipAnimal;
    public boolean mamifer;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest () {
 //       tipAnimal = "caine";
 //       mamifer = true;
 //       varsta = 5;
 //       greutate = 25;
        prezentareAnimal ("caine", true, 5, 25);
        prezentareAnimal("pisica",true,8, 10);
        prezentareAnimal("porumbel", true, 6, 1);
    }

         public void prezentareAnimal(String tipAnimal, boolean mamifer, int varsta, double greutate) {
        int pret = 50;
         System.out.println("animalul este: "+tipAnimal);
         System.out.println("animalul este "+mamifer);
        System.out.println("varsta animalului este "+varsta);
        System.out.println("greutatea animalului este "+greutate);
        System.out.println();

    }

}
