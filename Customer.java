public class Customer {
    private String name = "";
    private String email = "";

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

    public void bookEvent() {
        Event event = new Event();
        event.setEventID(0);
        event.printEventID();
    }
}