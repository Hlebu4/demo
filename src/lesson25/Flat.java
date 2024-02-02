package lesson25;

import lesson15.lessoncode.service.utils.PrintServices;

public class Flat implements Comparable<Flat> {

    private double area ;
    private int numberOfBedroom ;

    public Flat(int area, int numberOfBedroom) {
        this.area = area;
        this.numberOfBedroom = numberOfBedroom;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", numberOfBedroom=" + numberOfBedroom +
                '}';
    }

    public double getArea() {
        return area;
    }

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }

    @Override
    public int compareTo(Flat newFlat) {
        if(getNumberOfBedroom() != newFlat.getNumberOfBedroom()){
            return getNumberOfBedroom() - newFlat.getNumberOfBedroom();
        }
        return Double.compare(getArea(),newFlat.getArea());
    }

}
