class Animal
{

    public void animalSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        super.animalSound();     System.out.println("The dog says: bow wow");
    }
}

class MainClass1
{
    public static void main(String args[])
    {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound();   }
}