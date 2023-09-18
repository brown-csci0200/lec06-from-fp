package src;

/**
 * Represents a Boa
 *
 */
public class Boa extends SizedAnimal {
    public String name;
    public String eats;

    public Boa(String name, int len, String eats) {
        super(len);
        this.name = name;
        this.eats = eats;
    }

    @Override // This method implements some contract (or ..)
    public boolean isNormalSize() {
        return super.isLengthWithin(30, 60); // Also valid to use this.isLengthWithin
    }
}
