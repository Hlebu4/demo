package consultations.cons3.lotto;

import consultations.cons3.lotto.service.LottoGame;

import java.util.Arrays;

public class LottoApp {
    public static void main(String[] args) {

        LottoGame game = new LottoGame(15, 90);

        game.startGame();
    }
}
