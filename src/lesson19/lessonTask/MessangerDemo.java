package lesson19.lessonTask;

public class MessangerDemo {
    public static void main(String[] args) {



    Messenger[] messengers = {new Telegram(),new WhatsApp(), new Viber()};

    Phone phone = new Phone(messengers);

        for (int i = 0; i < phone.getMessengers().length; i++) {
            messengers[i].getMessage();
            messengers[i].sendMessage();
        }



    }
}
