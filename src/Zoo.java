package src;

import java.util.LinkedList;

public class Zoo {
    public LinkedList<IAnimal> allAnimals;

    public Zoo() {
        this.allAnimals = new LinkedList<IAnimal>();
    }

    // Want a type that says "Dillo or Boa" => need Interface IAnimal
    public Zoo(IAnimal ani1, IAnimal ani2) {
        this.allAnimals = new LinkedList<IAnimal>();
        this.allAnimals.add(ani1);
        this.allAnimals.add(ani2); // [ani1, ani2]
    }

    public int howManyNonNormal() {
        // for-loop
        int count = 0; // storage for the result

        for (IAnimal ani : this.allAnimals) {
            if (!ani.isNormalSize()) {
                count = count + 1;
                // count += 1;
                // count++;
            }
        }

        return count;  // return result
    }

    public LinkedList<IAnimal> getAllNonNormal() {
        LinkedList<IAnimal> result = new LinkedList<IAnimal>();
        // return a linked list of animals, check inside function
        for (IAnimal ani : this.allAnimals) {
            if(!ani.isNormalSize()) {
                result.add(ani);
            }
        }
        return result;
    }

    public int averageLenOfNormal() {
        int sum = 0;
        int count = 0;

        // for-loop
        for (IAnimal ani : this.allAnimals) {
            if(ani.isNormalSize()) {
                // 1. Need some way to check if this is a SizedANimal
                // 2. Require IAnimals to still have getLength()
                sum = sum + ani.getLength(); // ani could be a FruitFly
                count = count + 1;
            }
//            else {
//                ani.length = 15;
//            }
        }

        // 2 problems:
        // 1.
        // 2. IAnimals don't (always) have length

        // If i have the empty list, then count = 0 and divide by zero

        return sum / count;
    }


}
