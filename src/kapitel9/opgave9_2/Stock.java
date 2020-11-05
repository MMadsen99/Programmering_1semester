package kapitel9.opgave9_2;



public class Stock {
    String symbol; // String med navn symbol, indeholder ikke noget
    String name;// String med navn name, indeholder ikke noget
    double previousClosingPrice;
    double currentPrice;

    public static void main(String[] args) {
        Stock stock1 = new Stock();
        System.out.println(stock1.symbol);
        System.out.println(stock1.name);
        System.out.println(stock1.previousClosingPrice);
        System.out.println(stock1.currentPrice);
        System.out.println(stock1.getChangePercent());
        System.out.println("----------------------------------");


        Stock stock2 = new Stock(1000);
        System.out.println(stock2.getChangePercent());
    }

    Stock() {
        symbol = "$";
        name = "Tesla";
        previousClosingPrice = 5000;
        currentPrice = 10000;
    }
    Stock(double getPreviousClosingPrice) {
        previousClosingPrice = getPreviousClosingPrice;
    }


    public double getChangePercent() {

        //TODO der er noget galt med udregningen for at finde hvor stor procent del stock prisen har ændret sig fra dag til dag
        double diffrence = (previousClosingPrice - currentPrice) / (previousClosingPrice + currentPrice) / 2;
        double diffrenceToPercent = diffrence * 100;


        return diffrenceToPercent;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
}


