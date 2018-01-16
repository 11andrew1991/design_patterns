package facade.mobileshop.app;

public class Samsung implements MobileShop {

    @Override
    public void modelName() {
        System.out.println("Samsung galaxy 10 ");
    }

    @Override
    public void price() {
        System.out.println("999 USD");
    }
}
