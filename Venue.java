import java.util.*; 

public class Venue {
    private List<Date> availableDates = new ArrayList<Date>();  
    private String name = "";
    private String address = "";
    private String link = "";
    private int price = -999;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public Date reserveDate(Date input) {
        boolean isAvailable = availableDates.remove(input);
        if (isAvailable){
            return input;
        }
        else{
            return null;
        }
    }

    public List<Date> getAvailableDates() {
        return availableDates;
    }

    public void addDate(Date newDate) {
        this.availableDates.add(newDate);
    }

    public void printDates() {
        System.out.println("Available Dates:");
        for (Date dates : this.getAvailableDates()) {
            System.out.println(dates);
        }
        System.out.println();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printVenueSummary() {
        System.out.printf("%s's address: %s%n", name, address);
        System.out.printf("%s's price: %d%n", name, price);
        System.out.printf("%s's link: %s%n", name, link);
        System.out.printf("%s's ", name);
        printDates();
    }
}