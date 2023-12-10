package lesson15.lessoncode.service;

import cons3.lotto.entity.Player;

public class PlayerService {
    UserInput ui = new UserInput();
    public int userInputPlayers () {
        UserInput ui = new UserInput();
        int playersNumber = ui.userInputInt();

        return playersNumber;
    }

    public void inputPlayersDetails(int playersNumber) {
        for (int i = 0; i < playersNumber; i++) {
            String playerNickName = ui.userInputText();
        }
    }
}
