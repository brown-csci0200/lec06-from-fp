/**
 * Represents a Boa
 */
public class Boa implements IAnimal {
    public String name;
    public int length;
    public String eats;

    public Boa(String name, int length, String eats) {
        this.name = name;
        this.length = length;
        this.eats = eats;
    }
}
