package src;

public interface IAnimal {

    // Like a contract that specifies methods that
    // all animals should have

    /**
     *
     * @return true if this animal has a normal size
     */
    public boolean isNormalSize();

    /**
     *
     * @return an animal's length
     *
     * NEW:  Adding getLength here means that all animals need to implement
     * this method, allowing us to do operations using an animal's legnth for
     * all types of animals
     */
    public int getLength();
}
