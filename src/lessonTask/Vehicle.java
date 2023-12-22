package lessonTask;

public class Vehicle {

    private String model;



    public Vehicle(String model, String name) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }



    public void speedUp() {
        System.out.println("speed up");
    }

    public void speedDown() {
        System.out.println("speed down");
    }



}