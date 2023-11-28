package lesson7.homework.dop.taskProg;
/*
Задача 2
- **Цель**: Определить четверть координатной плоскости для точки с координатами (x, y).
- **Условия**: x и y - случайные целые числа в интервале от -10 до 10.
 */
public class Task2 {

    int result;
    public int quarterCoordinates (int x, int y){
        if (x < -10 || x > 10 || y > 10 || y < -10){
            return 0;
        }
        if ( x > 0 ){
            if ( y >  0){
                result = 1;
                return result;
            } else if ( y < 0 ) {
                result = 4;
                return result;
            }
        }
        if ( y > 0 ){
            result = 2;
                return result;
        }
        result = 3;
        return result;
    }
}
