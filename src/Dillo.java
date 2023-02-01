/**
 * Represents a Dillo
 */
public class Dillo extends SizedAnimal /* implements IAnimal */{
    boolean isDead;
    public int length; // Now part of SizedAnimal

    public Dillo(int howLong, boolean isD) {
        super(howLong); // Need to call constructor for superclass
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead);
    }

    public boolean isNormalSize() {
        //return this.length >= 12 && this.length <= 100;
        return super.isLengthWithin(12, 100); // Also valid to use this.isLengthWithin
    }
}
