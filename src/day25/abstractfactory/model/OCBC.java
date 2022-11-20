package day25.abstractfactory.model;

public class OCBC implements Bank {

    private static final String NAME = "Bank OCBC";

    @Override
    public String getBankName() {
        return NAME;
    }
}
