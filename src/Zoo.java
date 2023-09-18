package src;

import java.util.LinkedList;

public class Zoo {
    public LinkedList<IAnimal> allAnimals;

    public Zoo() {
        this.allAnimals = new LinkedList<IAnimal>(); // This creates our list
                                                     // Also possible to do new LinkedList<>()
    }

    // Want a type that says "Dillo or Boa" => need Interface IAnimal
    public Zoo(IAnimal ani1, IAnimal ani2) {
        this.allAnimals = new LinkedList<IAnimal>(); // Creates our list

        // Add two animals
        this.allAnimals.add(ani1);
        this.allAnimals.add(ani2);

        // NOTE:  .add(..) returns "void" => it modifies allAnimals to add the animal to it
        // This is very different from what you see with functional programming,
        // where we add to lists by creating a new list
    }


    // Write a method to determine how many non-normal-size animals
    // are in our zoo
    public int nonNormalCount() {
        int count = 0;  // Sets up the name "count" in our environment, then set it to 0

        // "Loop over" all elements in allAnimals
        for (IAnimal ani : this.allAnimals) { // ani is a name in the environment
                                              // that refers to an element of allAnimals
            if (!(ani.isNormalSize())) {
                count = count + 1;  // Update the count if animal doesn't have normal size
            }
        }

        return count; // Return the result
    }

    // Write a method to make a list of non-normal-sized animals
    public LinkedList<IAnimal> nonNormalAnimals() {
        LinkedList<IAnimal> anis = new LinkedList<IAnimal>();

        for (IAnimal ani : this.allAnimals) {
            if (!(ani.isNormalSize())) {
                anis.add(ani);
            }
        }

        return anis;
    }

    // Compute average lengths of normal-sized animals
    public double normalAverageLength() {
        double sum = 0.0;
        int count = 0;  // Sets up the name "count" in our environment, then set it to 0

        for (IAnimal ani : this.allAnimals) { // ani is a name in the environment pointing to each element
            if (ani.isNormalSize()) {
                // Now we have two things to update:  the sum and the count

                // To access an animal's length, we use our new getLength() method
                // For more details, see the posted notes
                sum = sum + ani.getLength();
                count = count + 1;
            }
        }

        // Return the average
        return sum / count;
    }











}
