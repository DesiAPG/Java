package OOP_Fundamentals;

public class Test {
    public static void main(String[] args) {
        CAccount account1 = new CAccount("duvan", "credit", 2000, 1);
        account1.setName("Duvan");
        account1.setAccount("Credit");
        account1.setTypeOfInterest(2.5);

        account1.setBalance(12000);
        account1.withdraw(3000);


        System.out.println(account1.getAccount());
        System.out.println(account1.getBalance());
        System.out.println(account1.getName());
        System.out.println(account1.getTypeOfInterest());
    }
}
