package inheritance;

public class NewAnimal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends NewAnimal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class NewDog extends NewAnimal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        NewAnimal myAnimal = new NewAnimal();  // Create a Animal object
        NewAnimal myPig = new Pig();  // Create a Pig object
        NewAnimal myDog = new NewDog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
