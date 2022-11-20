package day13.interfaceExample;

public interface Polygon extends Line, Points{
    void getArea(int length, int breadth);
    default void getSides(){
        System.out.println("I can get sides of polygon.");
    }
}
