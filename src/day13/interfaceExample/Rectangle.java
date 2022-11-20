package day13.interfaceExample;

public class Rectangle implements Polygon, Points {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of rectangle is " + (length * breadth));
    }

    @Override
    public void getPoints() {
        System.out.println("Rectangle has 4 points");
    }

    @Override
    public int getLength() {
        System.out.println("Rectangle Length");
        return 0;
    }
}