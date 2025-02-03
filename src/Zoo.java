package src;

import java.util.LinkedList;

public class Zoo {
    // Previously: Could only contain 2 animals
    // Now: Contains as many animals as I can think of
    public LinkedList<IAnimal> allAnimals;

    public Zoo(IAnimal ani1, IAnimal ani2) {
        this.allAnimals = new LinkedList<IAnimal>();
        this.allAnimals.add(ani1);
        this.allAnimals.add(ani2);
    }

    public Zoo() {
        this.allAnimals = new LinkedList<IAnimal>();
    }

    public int howManyNonNormal() {
        // How many total non-normal-sized animals are in the Zoo?

        int count = 0;
        for (IAnimal ani : this.allAnimals) {
            if (!ani.isNormalSize()) {
                count = count + 1;
                // count += 1;
                // count++;
            }
        }
        return count;
    }

    public LinkedList<IAnimal> getAllNonNormal() {
        // Return a list of all non-normal-sized animals
        LinkedList<IAnimal> result = new LinkedList<IAnimal>();
        for (IAnimal ani : this.allAnimals) {
            if(!ani.isNormalSize()) {
                result.add(ani);
            }
        }
        return result;
    }

    public double averageLength() {
        int sum = 0;
        int count = 0;
        for (IAnimal ani : this.allAnimals) {
            // 1. Not every IAnimal has a length (FruitFly)
            // 2. BUT even if they did, it's dangerous to give me access to the length (Solved)

            // One possible solution: Require all IAnimals to provide length
            //                        (works if you uncomment the code in IAnimal)
            // But not the only solution, can you think of others?
            sum += ani.getLength();
            count += 1;
        }
        return sum / count;
    }

}
