public class Item implements Comparable<Item> {
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

    @Override
    public int compareTo(Item otherItem) {
        if (otherItem.getPrice() != getPrice()) {
            return Integer.compare(otherItem.getPrice(), getPrice());
        } else {
            return CharSequence.compare(getName(), otherItem.getName());
        }
    }
}
