package lesson19.lessonTask;

public class Viber implements Messenger{

    @Override
    public void getMessage() {
        System.out.println(" Viber get a message ");
    }

    @Override
    public void sendMessage() {
        System.out.println(" Viber send a message ");
    }
}
