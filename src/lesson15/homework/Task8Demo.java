package lesson15.homework;

public class Task8Demo {
    public static void main(String[] args) {

        Task8Service service = new Task8Service();
        int n = service.arrayLength();
        service.arrayRandom(n);
    }
}
