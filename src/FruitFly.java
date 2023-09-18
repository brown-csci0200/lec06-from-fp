package src;

/**
 * Represents a fruit fly, another animal for our Zoo
 */
public class FruitFly implements IAnimal {

    // No fields--it just exists

    // Fruit flies are so small we don't care about their size
    // so there's no need to extend SizedAnimal.
    // However, we can still use these animals in our Zoo because
    // they implement IAnimal!

    public FruitFly() {

    }

    public boolean isNormalSize() {
        return true; // All fruit flies are of normal size
    }

    /**
     * Fruit Flies don't have a length, but the IAnimal
     * interface requires them to have a getLength() method!
     *
     * Therefore, we can write one, but just return 0,
     * since this isn't meaningful.
     *
     * @return the length (which is zero!)
     */
    public int getLength() {
        return 0;
    }
}
