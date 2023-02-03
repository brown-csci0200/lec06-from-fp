public class Shark extends Fish {

    String attacks;

    public Shark(int len, double sal, String attacks) {
        super(len, sal); // Call Fish constructor
        this.attacks = attacks;
    }

    /*
     * Shark technically isn't required to have its own isNormalSize() method
     * because it inherits the one from Fish.  However, if we wanted
     * isNormalSize() to behave differently for Sharks, we can add one here!
     * This is called an "override" => this method is called instead of
     * the one in class Fish (ie, it takes precedence)
     */
    @Override // This indicates we are replacing a method already defined in a superclass
    public boolean isNormalSize() {
        return super.isLengthWithin(50, 200);
    }
}
