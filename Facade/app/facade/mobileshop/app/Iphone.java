package facade.mobileshop.app;

public class Iphone implements MobileShop {

    @Override
    public void modelName() {
        System.out.println("Iphone X");
    }

    @Override
    public void price() {
        System.out.println("1000 USD");
    }
}
