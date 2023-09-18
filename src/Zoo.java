package src;

public class Zoo {
    public IAnimal animal1;
    public IAnimal animal2;

    // Want a type that says "Dillo or Boa" => need Interface IAnimal
    public Zoo(IAnimal ani1, IAnimal ani2) {
        this.animal1 = ani1;
        this.animal2 = ani2;
    }


}
