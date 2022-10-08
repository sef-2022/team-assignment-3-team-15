public class Addition {
    protected boolean booked = false;
    protected int price;

    public boolean isBooked() {
        return booked;
    }

    public void updateBooked(boolean input) {
        this.booked = input;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}