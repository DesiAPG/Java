package OOP_Fundamentals;

public class CSavingAccount extends CAccount {
    private double HandlingFee;

    public CSavingAccount() {
    }

    public CSavingAccount(String nam, String acc, double bal, double type, double handF) {
        super(nam, acc, bal, type);

    }

    public void setHandlingFee(double amount) {
        if (amount < 0) {
            System.out.println("The amount must be more than 0");
            return;
        }
        HandlingFee = amount;
    }

    public double getHandlingFee() {
        return HandlingFee;
    }

    @Override
    public void setBalance(double quantity) {
        double balance = getBalance();
        double typeOfInterest = getTypeOfInterest();
        if (typeOfInterest < 0) {
            if (balance - quantity < 1500) {
                System.out.println("Error: You have not founds");
                return;
            }
        }
        super.setBalance(quantity);
    }
}
