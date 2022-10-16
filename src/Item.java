public class Item {
    private int price;
    private String name;
    //represents each item we insert in the console

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


}
