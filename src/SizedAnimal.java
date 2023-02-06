/**
 * Class that allows us to share code for animals with a size
 *
 * "abstract" means that we can't use new create SizedAnimal objects
 * directly.  This is important because it's not meaningful to create a
 * SizedAnimal object on its own, since it doesn't refer to one specific
 * type of animal that can live in our Zoo
 */
public abstract class SizedAnimal implements IAnimal {
    protected int length; // If you mark a field as private,
    // it can't be read/modified outside that class
    //
    // private methods can't be called outside that class
    // When you implment classes where you want to control
    // how information is used, you start marking stuff private
    // Usually, unless you need to make it public, make it private
    // - To give a subclass access, use "protected" instead


    public SizedAnimal(int len) {
        this.length = len;
    }

    public boolean isLengthWithin(int low, int high) {
        return this.length >= low && this.length <= high;
    }

    /**
     * Now if we want other classes (like Zoo) to be able to access an Animal's length
     * we can write a method that returns this value.
     *
     * The key point here is that, as authors of Sized Animal, WE get to decide which
     * fields are accessible to other classes by marking them public/private/protected.
     *
     * Beyond this, we can write code that provides more access, which lets us control
     * HOW the data is used.  This is important for making our code more robust--ie,
     * better suited for a large project used by many people
     *
     * @return The animal's length
     */
    public int getLength() {
        return this.length;
    }

}
