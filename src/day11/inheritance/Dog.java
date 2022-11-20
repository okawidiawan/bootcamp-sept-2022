package day11.inheritance;

public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("Dog is Born");
    }

    public void display() {
        System.out.println("My Name Is : " + getName());
    }

    @Override
    public void eat() {
        // super untuk memanggil method eat() milik superclassnya atau parentnya, hanya gunakan jika ada method overriding
        super.eat();
        System.out.println(getName() + " Sedang Makan");
    }
}
