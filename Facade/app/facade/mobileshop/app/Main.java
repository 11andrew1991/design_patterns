package facade.mobileshop.app;

public class Main {

    private static ShopFacade shopFacade = new ShopFacade();

    public static void main(String[] args) {
        System.out.println("========= Mobile Shop ============");

        shopFacade.blackberrySale();
        System.out.println();

        shopFacade.iphoneSale();
        System.out.println();

        shopFacade.samsungSale();
    }
}
