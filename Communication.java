public class Communication {
    private String type;
    private String messageSent;
    private boolean messageRecieved;
    private boolean answerable;

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
        System.out.printf("Message sent: '%s'%n%n",getMessageSent());
    }

    public void setAnswerable(boolean answerable) {
        this.answerable = answerable;
    }

    public boolean isAnswerable() {
        return answerable;
    }

    public void printMessageRecieved() {
        System.out.printf("Message recieved: '%s'%n%n",getMessageSent());
    }
}
