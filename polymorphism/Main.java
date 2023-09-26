package polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    // @Override
    // public void animalSound() {
    //     System.out.println("Cat makes a 'meow' sound");
    // }

    public void catSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    // @Override
    // public void animalSound() {
    //     System.out.println("Dog makes a 'bark' sound");
    // }

    public void dogSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myAnimal.animalSound(); // Output: Animal makes a sound
        myCat.animalSound();    // Output: Cat makes a 'meow' sound
        myDog.animalSound();    // Output: Dog makes a 'bark' sound

        myCat.catSound();       // Output: Meow
        myDog.dogSound();       // Output: Bark
    }
}
