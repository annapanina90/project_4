package Present;

public class Chocolate extends Present{
    private String brand;
    private String ccal;
    /*public Chocolate(String weight, Double price, String brand, String ccal) {
        super(weight, price);
        this.brand = brand;
        this.ccal = ccal;
    }*/

    public Chocolate(Double weight, Double price, String brand, String ccal) {
        super(weight, price);
        this.brand = brand;
        this.ccal = ccal;
    }

    public Chocolate() {

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
        return "Шоколадка [" + super.toString() + ", марка = " + brand + ", Ккал = " + ccal + "]";
    }
}
