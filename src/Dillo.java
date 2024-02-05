package src;
/**
 * Represents a Dillo
 */
public class Dillo extends SizedAnimal {
    public boolean isDead;
    // "public"    - anyone else can access
    // "private"   - only this current class can access
    // "protected" - only this current class AND subclasses can access

    public Dillo(int howLong, boolean isD) {
        super(howLong);
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.getLength() > 60) && (this.isDead);
    }

    public boolean isNormalSize() {
        return super.isLengthWithin(12, 100); // Also valid to use this.isLengthWithin
    }
}
