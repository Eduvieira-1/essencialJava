package javacore.concorrencia.dominio;

public class Quote {
    private final String store;
    private final Double price;
    private final Discount.Code discount;


    private Quote(String store, Double price, Discount.Code discount) {
        this.store = store;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Creates new Quote object from the value folllowing the pattern storeName:price:discount
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */

    public static Quote newQuote(String value){
        String[] values = value.split(" : ");
        return new Quote(values[0], Double.parseDouble(values[1].replace(',', '.')), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public String getStore() {
        return store;
    }

    public Double getPrice() {
        return price;
    }

    public Discount.Code getDiscount() {
        return discount;
    }
}
