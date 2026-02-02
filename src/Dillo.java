package src;
/**
 * Represents a Dillo
 */
public class Dillo extends SizedAnimal {
    public boolean isExtinct;

    public Dillo(int howLong, boolean isE) {
        super(howLong);
        this.isExtinct = isE;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isExtinct);
    }

    public boolean isNormalSize() {
        return super.isLengthWithin(12, 100); // Also valid to use this.isLengthWithin
    }
}
