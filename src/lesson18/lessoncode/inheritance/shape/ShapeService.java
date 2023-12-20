package lesson18.lessoncode.inheritance.shape;
/*
3. Создать сервисный класс в котором написать метод для создания массива фигур с рандомным размером
 */

import java.util.Random;

public class ShapeService {

    Random random = new Random();

    public Shape [] shapesArray(){
        Circle circle = new Circle("circle", random.nextInt(10));
        Rectangle rectangle = new Rectangle("rectangle", random.nextInt(10), random.nextInt(10));
        Triangle triangle = new Triangle("triangle", random.nextInt(10));
        Square square = new Square("square",random.nextInt(10));
        Shape [] shapes = {circle,rectangle,triangle,square};
        return shapes;
    }

    /*
    4. В нем же написать метод для наполнения этого массива рандомными фигурами с произвольными (рандомными) параметрами
     */

    public Shape [] randomShapes(){
        Shape [] shapesRandom = shapesArray();
        for (int i = 0; i < shapesArray().length; i++) {
            shapesRandom [i] = shapesArray()[random.nextInt(0, shapesArray().length -1 )];
        }
         return shapesRandom;
    }

    /*
    5. Посчитать и вывести информацию о каждой фигуре и ее площади и периметры.
     И посчитать площади и периметр для всех фигур.
Все рандомные значения долдны быть "случайными" в рамках заданных диапазонов.
Например, размер массива от 10 до 20 элементов и т.д.
     */

    public void task5 (){
        Shape [] task5 = new Shape[random.nextInt(10,20)];
        for (int i = 0; i < task5.length; i++) {
            task5[i] = shapesArray()[random.nextInt(0, shapesArray().length -1)];
            System.out.println( task5[i]);
            System.out.println(" Array = " + task5[i].calculatorArea() + "   Perimeter = " + task5[i].calculatorPerimeter());
        }
    }

}
