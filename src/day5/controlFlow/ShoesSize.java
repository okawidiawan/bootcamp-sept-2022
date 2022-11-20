package day5.controlFlow;

public class ShoesSize {
    
    public String grade(int size){
        String grade = "";
        switch(size){
            case 29:
            grade = "Small";
            break;
            case 42:
            grade = "Medium";
            break;
            case 44:
            grade = "Large";
            break;
            case 48:
            grade = "Extra Large";
            break;
            default:
            grade = "Unknown";
            break;
            
        }
        return grade;
    }
    
}
