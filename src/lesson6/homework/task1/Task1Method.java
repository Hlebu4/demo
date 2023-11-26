package lesson6.homework.task1;

public class Task1Method {

    Boolean canBuy;
    public boolean canBuyMethod() {

        UserInput scan = new UserInput();
        System.out.println("Edeka is open ? open or closed");
        String isEdekaOpen = scan.userInputText();
        System.out.println("Rewe is open ? open or close");
        String isReweOpen = scan.userInputText();

        if (isReweOpen.contains("open") || isEdekaOpen.contains("open")) {
            canBuy = true;
            return canBuy;
        } else {
            canBuy = false;
            return canBuy;
        }

    }
}