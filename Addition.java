public class Addition {
    protected boolean ordered = false;
    protected int price;

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean input) {
        this.ordered = input;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}