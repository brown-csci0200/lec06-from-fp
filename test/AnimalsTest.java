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

    Zoo myZoo4 = new Zoo();

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

        boa1.eats = "tofu";                    // Set boa1's eats field to "tofu"
        boa2 = new Boa("slim", 30, "grass");   // Make a new object assigned to boa2

        Boa boa3 = boa1;                      // Make boa3 refer to same object as boa1
        boa3.eats = "donuts";                 // Set the eats field of that object to "donuts"

        // What is boa1.eats???  Choices:  "apples" "tofu" "donuts"

        // It's "donuts"!  Why?  The names boa1 and boa3 refer to the same object in memory
        // For more info, see handout notes for this lecture
        Assert.assertEquals("donuts", boa1.eats);
        Assert.assertEquals("donuts", boa3.eats);
    }

    /**
     * Here's a test using our new animals list
     */
    @Test
    public void testMakeBiggerZoo() {
        Zoo someZoo = new Zoo();
        someZoo.allAnimals.add(this.babyDillo);
        someZoo.allAnimals.add(this.otherDillo);
        someZoo.allAnimals.add(this.someBoa);
        someZoo.allAnimals.add(this.otherBoa);

        Assert.assertEquals(2, someZoo.nonNormalCount());
    }
}
