package addHomeWork.add3;
/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */
public class Task2_Circle {
    double radius;
    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }


}
