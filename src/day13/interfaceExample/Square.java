package day13.interfaceExample;

public class Square implements Polygon {
    
    @Override
    public void getArea(int length, int breadth){
        System.out.println("The area of rectangle is " + (length * breadth));
    }
    
    @Override
    public int getLength(){
        return 0;
    }

    @Override
    public void getPoints() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}