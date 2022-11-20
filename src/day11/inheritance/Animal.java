package day11.inheritance;

public class Animal {

    private String name;

    public Animal() {
        System.out.println("Animal is Born");
    }
    
    

    public void eat() {
        System.out.println(name + " is Eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
