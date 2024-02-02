package consultations.cons07.consTask;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        AppService app = new AppService();
        UserInput ui = new UserInput();

        System.out.println(Arrays.toString(app.divideText(ui.userInputText())));

    }
}
