public class Package {
    private String name = "";
    private int price = -999;
    private int maxPeopleServed = -999;

    public void setMaxPeopleServed(int maxPeopleServed) {
        this.maxPeopleServed = maxPeopleServed;
    }

    public int getMaxPeopleServed() {
        return maxPeopleServed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void printPackage() {
        System.out.printf("Package Name: %s%nPackage Price: %d%nMaximum number of people served: %d%n%n", name, price, maxPeopleServed);
    }
}