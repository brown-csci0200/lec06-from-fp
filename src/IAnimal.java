package src;

public interface IAnimal {

    // Like a contract that specifies methods that
    // all animals should have

    /**
     *
     * @return true if this animal has a normal size
     */
    public boolean isNormalSize();

      // One option to fix our averaging function is to force IAnimals to all have a getLength()
      // This is a design decision, and not the only valid choice
//    public int getLength();
}
