import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of articles you want to add to shopping cart");
        ShoppingCart cart = new ShoppingCart();

        int numberArticles = scanner.nextInt();
        //System.out.println("Type the price of the articles");
        for (int i = 0; i < numberArticles; i++) {
            //System.out.println(i);
            int price = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            Item item = new Item(price, name);
            cart.addItemToCart(item);
        }
        //System.out.println("coupon value");
        int coupon = scanner.nextInt();
        cart.setCoupon(coupon);
        System.out.println(cart.getMostExpensiveItem());
        System.out.println(cart.getTotalPrice() + " " + cart.remainder());
    }
}