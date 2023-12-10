package lesson15.lessoncode.entity;

public class Player {

    private String name;
    private Card[] playerCards = new Card[5];


    public Player(String name) {
        this.name = name;
    }
    private Player[] playersName = new Player[5];

    public String getName() {
        return name;
    }


    public Card[] getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(Card[] playerCards) {
        this.playerCards = playerCards;
    }
}
