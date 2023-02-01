/**
 * Represents a Boa
 *
 */
public class Boa extends SizedAnimal /* implements IAnimal */ {
    public String name;
    //public int length; // Now part of SizedAnimal!
    public String eats;

    public Boa(String name, int len, String eats) {
        super(len); // Call the constructor for the class we're extending
                    // also called the "superclass"
        this.name = name;
        //this.length = length;
        this.eats = eats;
    }

    @Override // This method implements some contract (or ..)
    public boolean isNormalSize() {
        //return this.length >= 30 && this.length <= 60;
        return super.isLengthWithin(30, 60); // Also valid to use this.isLengthWithin
    }
}
