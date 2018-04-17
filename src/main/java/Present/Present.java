package Present;

public abstract class Present {
    private Double weight;
    private Double price;
   // public Present(String weight, Double price){};



    public Present() {

    }
    public Present(Double weight, Double price) {
        this.weight=weight;
        this.price=price;

    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "вес = " + weight + " грамм " + ", цена = " + price + " руб.";
    }
}
