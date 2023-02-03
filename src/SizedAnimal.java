/**
 * Class that allows us to share code for animals with a size
 *
 * "abstract" means that we can't use new create SizedAnimal objects
 * directly.  This is important because it's not meaningful to create a
 * SizedAnimal object on its own, since it doesn't refer to one specific
 * type of animal that can live in our Zoo
 */
public abstract class SizedAnimal implements IAnimal {
    public int length;

    public SizedAnimal(int len) {
        this.length = len;
    }

    public boolean isLengthWithin(int low, int high) {
        return this.length >= low && this.length <= high;
    }
}
