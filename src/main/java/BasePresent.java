import Present.Present;
import Present.Candy;
import Present.Chocolate;

public class BasePresent {
    public static void main (String[] args) {
        Candy candy1 = new Candy(5.25,3.58,"Белочка","12 ccal");
        Candy candy2 = new Candy();
        candy2.setBrand("Трюфель");
        candy2.setWeight(10.37);
        candy2.setPrice(3.44);
        candy2.setCcal("18 ccal");
        Chocolate choco1 = new Chocolate(125.00,137.00,"Аленка","327 ccal");
        Chocolate choco2 = new Chocolate();
        choco2.setBrand("Милка");
        choco2.setWeight(100.00);
        choco2.setPrice(68.00);
        choco2.setCcal("425 ccal");
        Present[] box = {candy1, candy2, choco1, choco2};
        System.out.println("Состав подарка: ");
        for (Present somePresent:box) {
            System.out.println(somePresent.toString());
           }
           double cost = candy1.getPrice()+candy2.getPrice()+choco1.getPrice()+choco2.getPrice() ;
           double mass = candy1.getWeight()+candy2.getWeight()+choco1.getWeight()+choco2.getWeight();
           System.out.println("Стоимость подарка = " +"руб. " + cost + " Вес подарка = " + mass + " грамм");


}
