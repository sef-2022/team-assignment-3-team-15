import java.util.*; 

public class SoundSystem extends Addition{
    private String type;
    private List<Date> availableDates = new ArrayList<Date>();  
  
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
}