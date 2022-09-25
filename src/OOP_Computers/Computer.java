package OOP_Computers;

public class Computer {
    String brand;
    String processor;
    int weight;
    boolean on;
    boolean screenOn;

    public void TurnOnComputer() {
        if (on) {
            System.out.println("The computer is already on");
        } else {
            on = true;
            screenOn = true;
            System.out.println("The computer has been turned on");
        }
    }


    public void ComputerState() {
        System.out.println("The state of the computer:");
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Weight: " + weight + "Kg");

        if (on) {
            System.out.println("The computer is on");
        } else {
            System.out.println("The computer is off");
        }

        if (screenOn) {
            System.out.println("The screen is On");
        } else {
            System.out.println("The screen is Off");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }


}
