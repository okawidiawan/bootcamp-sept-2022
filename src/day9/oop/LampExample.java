package day9.oop;

public class LampExample {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        
        led.turnOn();
        led.turnOff();   
    }
}