package OOP_Computers;

public class MyComputer {
    public static void main(String[] args) {
        Computer myPC = new Computer();
        myPC.setBrand("Asus");
        myPC.setProcessor("Intel i5");
        myPC.setWeight(3);
        myPC.TurnOnComputer();
        myPC.ComputerState();
    }
}
