package addHomeWork.add3;
/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */
public class Task3_Product {

    String name ;
    double cost ;
    double discount ;

    public Task3_Product(String name) {
        this.name = name;
    }

    public double actualPrice (double cost , double discount){
        return cost - (cost / 100 * discount);
    }
    UserInput ui = new UserInput();

    public void printInformation (){
        System.out.println( " enter cost " + name);
       cost = ui.userInputDouble();
        System.out.println(" enter % discount ");
       discount = ui.userInputDouble();
        double priceWithDiscount = actualPrice(cost, discount);
        System.out.println( name + " cost " + cost + " discount " + discount + " actual price " + priceWithDiscount);
    }
}
