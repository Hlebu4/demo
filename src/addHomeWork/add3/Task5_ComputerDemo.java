package addHomeWork.add3;

public class Task5_ComputerDemo {
    public static void main(String[] args) {
        Task5_Computer dell = new Task5_Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}
