package addHomeWork.add3;
/*
Дописать код программы, что бы она запускалась
и выводила на консоль производителя и модель компьютера.
Менять можно только класс oop.incapsulation.Computer.

class oop.incapsulation.Computer {

    String manufacturer;
    String model;

    oop.incapsulation.Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

}

class oop.incapsulation.ComputerDemo {

    public static void main(String[] args) {
        oop.incapsulation.Computer dell = new oop.incapsulation.Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("oop.incapsulation.Computer manufacturer = " + manufacturer);
        System.out.println("oop.incapsulation.Computer model = " + model);
    }

}
 */
public class Task5_Computer {
    private String manufacturer;
    private String model;

    Task5_Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}


