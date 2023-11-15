package Lesson3.homework14114;

public class Pogoda {

    public double sun;
    public double mon;
    public double tues;
    public double wed;
    public double thur;
    public double frid;
    public double sat;

    public void average() {
        double sum = sun + mon + tues + wed + thur+ frid+ sat ;
        double midl = (double) sum / 7;
        System.out.println("Average - " + midl);

    }
}
