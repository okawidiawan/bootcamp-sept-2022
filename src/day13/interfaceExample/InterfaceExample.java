package day13.interfaceExample;

public class InterfaceExample {
    
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        rl.getArea(11, 6);
        
        Square s = new Square();
        s.getArea(7, 8);
        
        Rectangle p = new Rectangle();
        p.getPoints();
        p.getArea(7, 8);
        p.getSides();
    }
    Object o = new Rectangle();
    Object sq =  new Square();
}