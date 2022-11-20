package day13.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class AbstractClassExample {
    
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        
        Animal duck = new Duck();
        duck.makeSound();
        
        Animal cat = new Cat();
        cat.makeSound();
        
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(duck);
        animals.add(cat);
        for(Animal animal : animals){
            animal.makeSound();
        }
        
        MotorBike sb = new SportBike();
        sb.brake();
        MotorBike mb = new MountainBike();
        mb.brake();
    }
    
}