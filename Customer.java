import java.util.*; 

public class Customer {
    private String name;
    private String email;
    private String phone;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Event bookEvent(Venue venue, Customer customer, Date date, int attendees, Package packageEvent,FoodMenu menu , boolean addMusicBand, boolean addSoundSys, boolean addFlowerArrange) {
        boolean isError = false;
        Event event = new Event();
        event.setEventID(0);
        event.setVenue(venue);
        event.setCustomer(customer);
        event.setPackageUsed(packageEvent);
        event.setAttendees(attendees);
        event.reserveDate(date);
        event.setFoodMenu(menu);
        event.setIncludesMusicBand(addMusicBand);
        event.setIncludesSoundSystem(addSoundSys);
        event.setIncludesFlowerDecor(addFlowerArrange);
        if (event.getReservedDate() == null){
            System.out.println("Select an available date from an available venue");
            isError = true;
        }
        if (packageEvent.getMaxPeopleServed() < attendees){
            System.out.println("Input attendees less than the maximum number of people served");
            isError = true;
        }
        if (isError){
            return null;
        }
        else {
            return event;
        }
    }
}