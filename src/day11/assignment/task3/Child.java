package day11.assignment.task3;

public class Child extends Parent {

    private String name = "Tom";
    private Integer money = 200;

    @Override
    public void car() {
        System.out.println("Child's Car");
    }

    public void parentInfo() {
        System.out.println("Parent Name : " + getName());
        System.out.println("Parent Money : $ " + getMoney());
    }

    public void childInfo() {
        System.out.println("Name : " + name);
        System.out.println("Money : $ " + money);
    }
}
