package level1.methods;

public class Animal1 {
public void animalSound() {
        System.out.println("The animal makes a sound");
        }
}

class Pig extends Animal1 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog1 extends Animal1 {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();  // Create a Animal object
        Animal1 myPig = new Pig();  // Create a Pig object
        Animal1 myDog = new Dog1();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
