package lesson19.lessonTask;

public class Phone{

    private Messenger [] messengers;

    public Phone(Messenger[] messengers) {
        this.messengers = messengers;
    }

    public Messenger[] getMessengers() {
        return messengers;
    }
}
