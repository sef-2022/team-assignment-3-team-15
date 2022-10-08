import java.util.*; 

public class EventManager extends EventManagementTeam {
    public void bookVenue(Event event) {
        event.setBooked(true);
    }

    public void arrangeSeats(Event event, List<String> seatList){
        SeatingArrangements seatingArrangements = new SeatingArrangements();
        seatingArrangements.setSeating(seatList);
        event.setSeatingArrangement(seatingArrangements);
    }

    public Communication answerCustomer(String string){
        System.out.println("Try to send answer to customer"); 
        Communication answer = new Communication();
        answer.setType("Answer");
        answer.setMessageSent(string);
        answer.printMessageSent();
        
        //send message to customer
        return answer;
    }
}