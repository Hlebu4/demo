package lesson18.lessoncode.inheritance.shape;

import java.util.Arrays;

public class ShapesDemoHomework {
    public static void main(String[] args) {

        ShapeService serviceShape = new ShapeService();
        System.out.println(Arrays.toString(serviceShape.shapesArray()));

        System.out.println("==================================");

        System.out.println(Arrays.toString(serviceShape.randomShapes()));

        serviceShape.task5();
    }
}
