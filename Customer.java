import java.util.*; 
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

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

    public void requestInspection(Venue venue, Date requestDate) {
        if (venue.getAvailableDates().contains(requestDate)) {
            System.out.printf("%s is avaialble for inspection on %tB %<te, %<tY%n", venue.getName(), requestDate); 
            Communication inspectionCommunication = new Communication();
            inspectionCommunication.setType("Request Inspection");
            DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");  
            String strDate = dateFormat.format(requestDate);  
            inspectionCommunication.setMessageSent("Inspection date of " + venue.getName() + " on " + strDate);
            inspectionCommunication.printMessageSent();
            //send message to manager
        }
        else {
            System.out.printf("%s is not avaialble for inspection on %tB %<te, %<tY, pick a different date", venue.getName(), requestDate); 
        }
    }

    public void requestMenuAdd(Event event, String food) {
        System.out.printf("Try to add %s to event%n", food); 
        Communication menuAddCommunication = new Communication();
        menuAddCommunication.setType("Request Add for Menu");
        menuAddCommunication.setMessageSent("Add "+ food +" to menu of eventID = " + event.getEventID());
        menuAddCommunication.printMessageSent();
        //send message to manager
    }
    
    public void requestMenuRemove(Event event, String food) {
        System.out.printf("Try to remove %s from event%n", food); 
        Communication menuRemoveCommunication = new Communication();
        menuRemoveCommunication.setType("Request Remove for Menu");
        menuRemoveCommunication.setMessageSent("Remove "+ food +" from menu of eventID = " + event.getEventID());
        menuRemoveCommunication.printMessageSent();
        //send message to manager
    }

    public void askQuery(String string){
        System.out.println("Try to send a query"); 
        Communication queryCommunication = new Communication();
        queryCommunication.setType("Query");
        queryCommunication.setMessageSent(string);
        queryCommunication.printMessageSent();
        //send message to manager
    }

    public void sendComplaint(String string){
        System.out.println("Try to send a complaint"); 
        Communication compaintCommunication = new Communication();
        compaintCommunication.setType("Complaint");
        compaintCommunication.setMessageSent(string);
        compaintCommunication.printMessageSent();
        //send message to manager
    }
}