package lesson15.lessoncode;


import cons3.lotto.entity.Cart;
import cons3.lotto.entity.Player;
import lesson15.lessoncode.entity.Card;
import lesson15.lessoncode.entity.Cards;
import lesson15.lessoncode.service.DeckService;
import lesson15.lessoncode.service.UserInput;

import java.util.Arrays;

public class PokerApp {
    public static void main(String[] args) {
        /*
    - подготовительные действия с колодой карт
    - создать колоду (создать массив)   -> создать экземпляр класса Cards
    - наполнить (создать необходимое количество экземпляров класса Card) -> fillDeck()
    - перемешать  -> shuffleDeck()

    - ввод количества игроков -> userInputPlayers()

    - ввести данные игроков -> createPlayer()

    - раздать карты игрокам -> dealCards()

    - вывести информацию о картах у игроков -> printPlayersInfo()

         */

        Cards cards = new Cards();
        DeckService service = new DeckService();

        //System.out.println(Arrays.toString(cards.getDeck()));

        service.fillDeck(cards.getDeck());

        System.out.println(Arrays.toString(cards.getDeck()));

        Card[] deckShuffle = service.deckShuffle(cards.getDeck());

        System.out.println(Arrays.toString(deckShuffle));

        System.out.println();

        deckShuffle = service.deckShuffle(deckShuffle);

        System.out.println(Arrays.toString(deckShuffle));



    }
}
