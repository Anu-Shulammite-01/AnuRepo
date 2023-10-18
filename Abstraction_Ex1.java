abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

class Abstraction_Ex1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1=new Chicken();
        c1.walk();
    }}