package lesson3.homework.task6;
/*
int x = 3
Чему будет равно значение х после выполнения операции x += x++ ?
Проверьте свое предположение на практике.
 */
public class Lesson3Task6 {

    int x = 3;
    public void result (){
        x += x++;
        System.out.println(x);
    }

    public int resultInt(){
        x += x++;
        return x;
    }



}
