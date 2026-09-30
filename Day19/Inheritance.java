class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
