import java.util.*; 

public class MusicBand extends Addition{
    private String name;
    private List<Date> availableDates = new ArrayList<Date>();  


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void printBandSummary() {
        System.out.printf("Band Name: %s%n", name);
        System.out.printf("Band Price: %d%n%n", price);
    }
}