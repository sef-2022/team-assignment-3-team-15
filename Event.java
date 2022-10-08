import java.util.*; 

public class Event {
    private int eventID = -999;
    private int budget = -999;
    private List<String> foodMenu = new ArrayList<String>(); 

    public List<String> getFoodMenu() {
        return foodMenu;
    }

    public void addFood(String newFood) {
        this.foodMenu.add(newFood);
    }

    public void removeFood(String delFood) {
        boolean isRemoved = this.foodMenu.remove(delFood);
        if (isRemoved) {
            System.out.printf("Removed %s from food menu%n", delFood);
        }
        else {
            System.out.printf("Did not find %s in food menu%n", delFood);
        }
    }

    public void printMenu() {
        System.out.println("Food Menu:");
        for (String string : this.getFoodMenu()) {
            System.out.println(string);
        }
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getEventID() {
        return eventID;
    }

    public void printEventID() {
        System.out.printf("Event ID: %d%n", eventID);
    }
}