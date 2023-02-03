public class Fish extends SizedAnimal {

    public double salinity;

    public Fish(int len, double saltLevel) {
        super(len); // Calls constructor for SizedAnimal
        this.salinity = saltLevel;
    }

    public boolean isNormalSize() {
        return super.isLengthWithin(10, 100);
    }


}
