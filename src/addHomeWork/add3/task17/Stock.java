package addHomeWork.add3.task17;

public class Stock {

    private String nameCompany;
    private Integer initialPriceStock;
    private Integer currentPriceStock;
    private Integer minPriceStock ;
    private Integer maxPriceStock ;


    public Stock(String nameCompany, Integer initialPriceStock) {
        this.nameCompany = nameCompany;
        this.initialPriceStock = initialPriceStock;
        this.currentPriceStock = initialPriceStock;
        this.minPriceStock = initialPriceStock;
        this.maxPriceStock = initialPriceStock;

    }

    public String getNameCompany() {
        return nameCompany;
    }

    public Integer getInitialPriceStock() {
        return initialPriceStock;
    }

    public Integer getCurrentPriceStock() {
        return currentPriceStock;
    }

    public void setCurrentPriceStock(Integer currentPriceStock) {
        this.currentPriceStock = currentPriceStock;
    }

    public void setCurrentPriceStock() {
        this.currentPriceStock = currentPriceStock;
    }

    public Integer getMinPriceStock() {
        return minPriceStock;
    }

    public void setMinPriceStock(Integer minPriceStock) {
        this.minPriceStock = minPriceStock;
    }

    public Integer getMaxPriceStock() {
        return maxPriceStock;
    }

    public void setMaxPriceStock(Integer maxPriceStock) {
        this.maxPriceStock = maxPriceStock;
    }

}
