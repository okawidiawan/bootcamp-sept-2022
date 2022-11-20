package day11.inheritance;

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal gukguk = new Animal();
        gukguk.setName("Guk Guk The Animal");
        gukguk.eat();
        
        Dog charles = new Dog();
        charles.setName("Guk Guk The Dog");
        charles.eat();
        
        Animal gukgukNotAnimal = new Dog();
        gukgukNotAnimal.setName("Guk Guk define as Animal");
        gukgukNotAnimal.eat();
    }
}