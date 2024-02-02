package addHomeWork.add3.task17;

public class StockService {

    public void updatePrice(int newPrice , Stock stock){
       stock.setCurrentPriceStock(newPrice);
       if (newPrice < stock.getMinPriceStock()){
           stock.setMinPriceStock(newPrice);
       } else if (newPrice > stock.getMaxPriceStock()) {
           stock.setMaxPriceStock(newPrice);
       }
    }

    public void priceInformation(Stock stock){
        System.out.println( " name company " + stock.getNameCompany() );
        System.out.println( " initial Price " + stock.getInitialPriceStock());
        System.out.println( " current Price " + stock.getCurrentPriceStock());
        System.out.println( " min Price " + stock.getMinPriceStock());
        System.out.println( " max Price " + stock.getMaxPriceStock());
    }

}
