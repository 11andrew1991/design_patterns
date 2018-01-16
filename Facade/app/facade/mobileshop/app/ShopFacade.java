package facade.mobileshop.app;

public class ShopFacade {

    private MobileShop iphone;

    private MobileShop samsung;

    private MobileShop blackberry;

    public ShopFacade() {
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public void iphoneSale() {
        iphone.modelName();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelName();
        samsung.price();
    }

    public void blackberrySale() {
        blackberry.modelName();
        blackberry.price();
    }
}
