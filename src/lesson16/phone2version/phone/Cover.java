package lesson16.phone2version.phone;

public class Cover {
    private String color;
    private String material;

    public Cover(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
