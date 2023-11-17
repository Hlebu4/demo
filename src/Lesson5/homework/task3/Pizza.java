package Lesson5.homework.task3;

public class Pizza {

    private int x;
    private double y;
    private double s;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double area (){
        y = x / 2;
        s = Math.PI * y * y;
        return s;
    }
}
