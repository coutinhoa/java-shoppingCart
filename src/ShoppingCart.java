import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private int coupon;

    public ShoppingCart() {
        items = new ArrayList<Item>();
        coupon = coupon;
    }

    public void addItemToCart(Item item) {
        items.add(item);
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
        calculateCartAfterCoupon();
    }

    // will deduct from the cart the items that dont fit in the coupon
    private void calculateCartAfterCoupon() {
        ArrayList cart = new ArrayList<Item>();

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getPrice() <= coupon) {
                cart.add(item);
                coupon -= item.getPrice();
            }
        }

        items = cart;
    }

    public String getMostExpensiveItem() {
        if (items.size() > 0) {
            var mostExpensiveItem = items.get(0);
            for (int i = 0; i < items.size(); i++) {
                if (mostExpensiveItem.getPrice() < items.get(i).getPrice()) {
                    mostExpensiveItem = items.get(i);
                }
            }
            return mostExpensiveItem.getName();
        }
        return "";
    }

    public int getTotalPrice() {
        int sum = 0;
        for (int j = 0; j < items.size(); j++) {
            sum += items.get(j).getPrice();
        }
        return sum;
    }

    public int remainder() {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getPrice() <= coupon) {
                coupon -= items.get(i).getPrice();
            }
        }
        return coupon;
    }
}
