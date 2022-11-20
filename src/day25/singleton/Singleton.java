package day25.singleton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing Something");
    }

    public static void main(String[] args) {
        Singleton s = new Singleton();
        s.doSomething();
    }

}
