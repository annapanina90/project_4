package Present;

public class Candy extends Present {
    private String brand;
    private String ccal;
   /* public Candy(String weight, Double price, String brand, String ccal) {
       super(weight, price);
       this.brand = brand;
       this.ccal = ccal;
    }*/

    public Candy(Double weight, Double price, String brand, String ccal) {
        super(weight, price);
        this.brand = brand;
        this.ccal = ccal;

    }

    public Candy() {
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCcal() {
        return ccal;
    }

    public void setCcal(String ccal) {
        this.ccal = ccal;
    }

    @Override
    public String toString() {
        return "Конфета + [" + super.toString() + ", марка = " + brand + ", Ккал = " + ccal + "]";
    }
}
