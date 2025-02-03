package src;
/**
 * Represents a Dillo
 */
public class Dillo extends SizedAnimal {
    private boolean isDead;

    // public  - "Anyone can access this field"
    // private - "Only this class can access this field"
    // protected - "Only this class AND its subclasses can access this field

    public Dillo(int howLong, boolean isD) {
        super(howLong);
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        this.setLength(30);
        return (this.getLength() > 60) && (this.isDead);
    }

    public boolean isNormalSize() {
        return super.isLengthWithin(12, 100); // Also valid to use this.isLengthWithin
    }
}
