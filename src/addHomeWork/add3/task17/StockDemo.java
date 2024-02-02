package addHomeWork.add3.task17;

public class StockDemo {
    public static void main(String[] args) {

        StockService stockService = new StockService();
        Stock google = new Stock( " Google ",10);

        stockService.priceInformation(google);
        System.out.println(" ==================== ");

        stockService.updatePrice(20,google);
        stockService.priceInformation(google);
        System.out.println(" ===================== ");

        stockService.updatePrice(5,google);
        stockService.priceInformation(google);
        System.out.println(" ===================== ");

        stockService.updatePrice(15,google);
        stockService.priceInformation(google);





    }
}
