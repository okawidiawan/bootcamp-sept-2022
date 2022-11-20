package day25.abstractfactory.model;

public class BCA implements Bank {

    private static final String NAME = "Bank BCA";

    @Override
    public String getBankName() {
        return NAME;
    }
}
