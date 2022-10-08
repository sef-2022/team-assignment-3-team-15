import java.util.*; 
import java.time.LocalDate;

public class SoundSystem extends Addition{
    private String type;
    private List<LocalDate> availableDates = new ArrayList<LocalDate>();  
  
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void printSoundSysSummary() {
        System.out.printf("Sound System Type: %s%n", type);
        System.out.printf("Sound System Price: %d%n%n", price);
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
}