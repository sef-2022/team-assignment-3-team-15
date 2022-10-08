import java.util.*; 

public class Event {
    private int eventID = -999;
    private int budget = -999;
    private FoodMenu foodMenu = new FoodMenu(); 
    public Venue venue = new Venue();
    private Date reservedDate;
    private Customer customer;
    private int attendees = 1;
    private Package packageUsed;
    private boolean includesMusicBand = false;
    private boolean includesSoundSystem = false;
    private boolean includesFlowerDecor = false;
    private MusicBand musicBand;
    private SoundSystem soundSystem;
    private FlowerArrange flowerArrange;

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getEventID() {
        return eventID;
    }

    public void printEventID() {
        System.out.printf("Event ID: %d%n", eventID);
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void reserveDate(Date reserveDate) {
        this.reservedDate = this.venue.reserveDate(reserveDate);
    }

    public Date getReservedDate() {
        return reservedDate;
    }

    public void printReserveDate() {
        if (this.reservedDate != null){
            System.out.printf("%s's reserved date is %tB %<te, %<tY%n",venue.getName(),reservedDate);
        }
        else{
            System.out.println("No date reserved");
        }
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void printCustomerName() {
        System.out.printf("Customer: %s", this.customer.getName());
    }

    public void printEventSummary(){
        System.out.println("------------------------");
        System.out.printf("%s's booking for eventID: %d%n%n", this.customer.getName(),eventID);
        System.out.printf("Event package selected: %s%n", packageUsed.getName());
        System.out.printf("Event package price: %d%n", packageUsed.getPrice());
        System.out.printf("Number of attendees: %s%n%n", attendees);
        System.out.printf("Venue selected: %s%n", venue.getName());
        System.out.printf("%s's price: %s%n", venue.getName(), venue.getPrice());
        System.out.printf("%s's address: %s%n%s's link: %s%n", venue.getName() ,venue.getAddress(), venue.getName(),venue.getLink());
        printReserveDate();
        System.out.printf("%nMenu selected: %s%n", foodMenu.getName());
        System.out.printf("Total Price of %s menu for %d attendees: %d%n%n", foodMenu.getName(), attendees, foodMenu.getPricePerHead() * attendees);
        if (getIncludesMusicBand() || getIncludesSoundSystem() || getIncludesFlowerDecor()) {
            System.out.println("Additions added to event:");
        }
        if (getIncludesMusicBand()){
            System.out.printf("Music band selected: %s%n", musicBand.getName());
            System.out.printf("Band Price: %d%n%n", musicBand.getPrice());
        }
        if (getIncludesSoundSystem()){
            System.out.printf("Sound System selected: %s%n", soundSystem.getType());
            System.out.printf("Sound System price: %d%n%n", soundSystem.getPrice());
        }
        if (getIncludesFlowerDecor()){
            System.out.printf("Flower arrangement selected: %s%n", flowerArrange.getArrangementType());
            System.out.printf("Flower arrangement price: %d%n%n", flowerArrange.getPrice());
        }

        System.out.println("------------------------");
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public Package getPackageUsed() {
        return packageUsed;
    }

    public void setPackageUsed(Package packageUsed) {
        this.packageUsed = packageUsed;
    }

    public void setIncludesFlowerDecor(boolean includesFlowerDecor) {
        this.includesFlowerDecor = includesFlowerDecor;
    }

    public void setIncludesMusicBand(boolean includesMusicBand) {
        this.includesMusicBand = includesMusicBand;
    }

    public void setIncludesSoundSystem(boolean includesSoundSystem) {
        this.includesSoundSystem = includesSoundSystem;
    }

    public boolean getIncludesFlowerDecor() {
        return includesFlowerDecor;
    }

    public boolean getIncludesMusicBand() {
        return includesMusicBand;
    }

    public boolean getIncludesSoundSystem() {
        return includesSoundSystem;
    }

    public void setMusicBand(MusicBand musicBand) {
        this.musicBand = musicBand;
    }

    public MusicBand getMusicBand() {
        return musicBand;
    }

    public SoundSystem getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void setFlowerArrange(FlowerArrange flowerArrange) {
        this.flowerArrange = flowerArrange;
    }

    public FlowerArrange getFlowerArrange() {
        return flowerArrange;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
}