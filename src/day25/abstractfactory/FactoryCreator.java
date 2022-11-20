package day25.abstractfactory;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "bank" -> {
                return new BankFactory();
            }
            case "loan" -> {
                return new LoanFactory();

            }
        }
        return null;
    }
}
