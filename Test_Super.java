// Super Keyword is a reference variable used to refer the parent class objects.
class Animal {
    public void sound() {
        System.out.println("The animal makes the sound");
    }
}

class Dog extends Animal {
    public void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

class Test_Super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
