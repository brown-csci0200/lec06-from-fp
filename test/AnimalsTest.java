package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    // example test data
    Dillo babyDillo = new Dillo(5,false);          // Normal size
    Dillo otherDillo = new Dillo(100, true);       // Non-normal size
    Boa someBoa = new Boa("slinky", 30, "apples"); // Normal size
    Boa otherBoa = new Boa("slim", 15, "bugs");    // Non-normal size


    Zoo myZoo = new Zoo(babyDillo, otherDillo);
    Zoo myZoo2 = new Zoo(babyDillo, new Dillo(50, false));

    // A new Zoo containing a Dillo and a Boa
    Zoo myZoo3 = new Zoo(otherDillo, new Boa("slinky", 20, "lettuce"));

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(1+1, 2);
    }
    @Test
    public void testMakeDillo() {
        Assert.assertEquals(5, babyDillo.getLength());
    }

    @Test
    public void testCanShelter() {

        Assert.assertEquals(false, babyDillo.canShelter());

        // We can also make objects inside test methods
        // these objects live ONLY inside the method in which they're declared
        Dillo medDillo = new Dillo(20, false);
        Assert.assertEquals(false, medDillo.canShelter());
    }

    /**
     * An example for updating fields--for more info, see the paper notes
     */
    @Test
    public void testUpdateFieldsExample() {
        Boa boa1 = new Boa("slinky", 30, "apples");
        Boa boa2 = new Boa("slim", 15, "bugs");
        System.out.println(boa1.eats);  // Question 1 "apples"
        System.out.println(boa2.eats);  // Question 2 "bugs"

        boa1.eats = "tofu";
        boa2 = new Boa("slim", 30, "grass");
        System.out.println(boa1.eats);  // Question 3 "tofu"
        System.out.println(boa2.eats);  // Question 4 "grass"

        Boa boa3 = boa1;
        boa3.eats = "donuts";
        System.out.println(boa1.eats);  // Question 5 "donuts"
        System.out.println(boa2.eats);  // Question 6 "grass"
        System.out.println(boa3.eats);  // Question 7 "donuts"
    }

    @Test
    public void testListZoo() {
        Zoo zoo1 = new Zoo(babyDillo, otherBoa);
        Zoo zoo2 = new Zoo();
    }

    @Test
    public void reviveDillo() {
        Dillo frankenstein = new Dillo(15, true);
        // How would you change Dillo to prevent this from happening?
        frankenstein.isDead = false;

    }































}
