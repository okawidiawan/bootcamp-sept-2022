package day4.datatype;

public class NumericFloatingPointAndCharacter {
    public static void main(String[] args) {
        
        double doubleRange = Double.MAX_VALUE;
        System.out.println(doubleRange);
        
        float floatRange = 42.3F;
        double doubleRange2 = 42.3F;
        System.out.println(floatRange);
        System.out.println(doubleRange2);
        
        char letter = '\u0051';
        char c = '4';
        System.out.println(letter);
        System.out.println(c);
        
        char charUsingIntegerLiteral = 83;
        System.out.println(charUsingIntegerLiteral);
        
        char charUsingUnicodeNotation = '\u0083';
        System.out.println(charUsingUnicodeNotation);
        
    }
}
