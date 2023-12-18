package lesson16.phone2version.phone;

public class Phone {
    private int imei;

    private SimCard simCard;

    private String model;

    private Cover cover;

    public Phone(int imei,  String model) {
        this.imei = imei;
        this.model = model;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public int getImei() {
        return imei;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + simCard +
                ", model='" + model + '\'' +
                ", cover=" + cover +
                '}';
    }
}
