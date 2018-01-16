package facade.mobileshop.app;

public class Blackberry implements MobileShop {

    @Override
    public void modelName() {
        System.out.println("Blackberry Z10 ");
    }

    @Override
    public void price() {
        System.out.println("500 USD");
    }
}
