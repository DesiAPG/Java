package OOP_Cars;

public class MyCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setModel(1990);
        myCar.setColor("White");
        myCar.startEngine();
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getBrand());
        myCar.accelerate(20);
        myCar.stopEngine();

    }
}
