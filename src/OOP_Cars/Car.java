package OOP_Cars;

public class Car {
    private String brand;
    private int model;
    private String color;
    private boolean engine;
    private int velocity;


    public void stopEngine() {
        if (!engine) {
            System.out.println("The engine is already stopped");
        } else {
            System.out.println("Engine Stopped");
        }
    }

    public void accelerate(int velocity) {
        this.velocity = velocity;
        System.out.println("The actual velocity is: " + velocity);
    }

    public int getVelocity() {
        System.out.println("The actual velocity is: ");
        return velocity;
    }

    public void brakeCar() {
        if (velocity == 0) {
            System.out.println("The car is stopped");
        } else {
            velocity = 0;
            System.out.println("The car has stopped");
        }
    }


    public void startEngine() {
        if (engine) {
            System.out.println("The engine is already started");
        } else {
            System.out.println("Engine started");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
