/**
 * Represents a Dillo
 */
public class Dillo implements IAnimal {
    int length;
    boolean isDead;

    public Dillo(int howLong, boolean isD) {
        this.length = howLong;
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead);
    }
}
