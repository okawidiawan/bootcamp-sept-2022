package day25.abstractfactory.model;

public class BNI implements Bank {

    private static final String NAME = "Bank BNI";

    @Override
    public String getBankName() {
        return NAME;
    }
}
