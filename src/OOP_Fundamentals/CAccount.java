package OOP_Fundamentals;

public class CAccount {
    private String name;
    private String account;
    private double typeOfInterest;
    private double balance;

    public void setName(String name1) {
        if (name1.length() == 0) {
            System.out.println("String is empty");
            return;
        } else {
            name = name1;
        }
    }

    public String getName() {
        return name;
    }

    public void setAccount(String acc) {
        if (acc.length() == 0) {
            System.out.println("String is empty");
            return;
        } else {
            account = acc;
        }
    }

    public String getAccount() {
        return account;
    }

    public void setBalance(double quantity) {
        if (quantity < 0) {
            System.out.println("Error: The quantity must be more than 0");
        } else {
            balance += quantity;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double quantity) {
        if (balance - quantity < 0) {
            System.out.println("Error: Insuficient money");
        } else {
            balance -= quantity;
        }
    }

    public void setTypeOfInterest(double type) {
        if (type < 0) {
            System.out.println("Error: type not valid");
        }
    }

    public double getTypeOfInterest() {
        return typeOfInterest;
    }
}

