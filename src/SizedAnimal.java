package src;
/**
 * Class that allows us to share code for animals with a size
 *
 * "abstract" means that we can't use new create SizedAnimal objects
 * directly.  This is important because it's not meaningful to create a
 * SizedAnimal object on its own, since it doesn't refer to one specific
 * type of animal that can live in our Zoo
 */
public abstract class SizedAnimal implements IAnimal {
    private int length;

    public SizedAnimal(int len) {
        this.length = len;
    }

    // ONLY MAKE GETTERS AND SETTERS WHEN YOU REALLY NEED THEM
    // When we want other classes to be able to read the length,
    // we create a "getter" method for it
    public int getLength() {
        return this.length;
    }

    // When we want other classes to be able to modify the length
    // we create a "setter" method for it
    public void setLength(int newLength) {
        this.length = newLength;
    }

    public boolean isLengthWithin(int low, int high) {
        return this.length >= low && this.length <= high;
    }


}
