package lesson19.lessonTask;

class Telegram implements Messenger{


    @Override
    public void getMessage() {
        System.out.println("Telegram get a message");
    }

    @Override
    public void sendMessage() {
        System.out.println("Telegram send a message");
    }
}
