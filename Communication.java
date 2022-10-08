public class Communication {
    private String type;
    private String messageSent;
    private boolean messageRecieved;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setMessageSent(String messageSent) {
        this.messageSent = messageSent;
    }

    public String getMessageSent() {
        return messageSent;
    }

    public void setMessageRecieved(boolean messageRecieved) {
        this.messageRecieved = messageRecieved;
    }

    public boolean isMessageRecieved() {
        return messageRecieved;
    }

    public void printMessageSent() {
        System.out.printf("Message sent to Event Manager: '%s'%n%n",getMessageSent());
    }
}
