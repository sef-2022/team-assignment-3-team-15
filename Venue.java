import java.util.*; 

public class Venue {
    private List<Date> availableDates = new ArrayList<Date>();  
    private String address = "";
    private String link = "";

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
            System.out.printf("%tB %<te, %<tY reserved for event%n", input);
            return input;
        }
        else{
            System.out.printf("%tB %<te, %<tY is not available for booking%n", input);
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
}