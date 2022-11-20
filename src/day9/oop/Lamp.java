package day9.oop;

public class Lamp {
    
    boolean isOn;
    
    void turnOn(){
        isOn = true;
        System.out.println("Light On? " + isOn);
    }
    
    void turnOff(){
        isOn = false;
        System.out.println("Light On? " + isOn);
    }
    
}