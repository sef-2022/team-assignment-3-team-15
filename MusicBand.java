import java.util.*; 
import java.time.LocalDate;

public class MusicBand extends Addition{
    private String name;
    private List<LocalDate> availableDates = new ArrayList<LocalDate>();  


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate reserveDate(LocalDate input) {
        boolean isAvailable = availableDates.remove(input);
        if (isAvailable){
            return input;
        }
        else{
            return null;
        }
    }

    public List<LocalDate> getAvailableDates() {
        return availableDates;
    }

    public void addDate(LocalDate newDate) {
        this.availableDates.add(newDate);
    }

    public void printDates() {
        System.out.println("Available Dates:");
        for (LocalDate dates : this.getAvailableDates()) {
            System.out.println(dates);
        }
        System.out.println();
    }

    public void printBandSummary() {
        System.out.printf("Band Name: %s%n", name);
        System.out.printf("Band Price: %d%n%n", price);
    }
}