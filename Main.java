import java.util.*; 
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // booking event
        System.out.println("Printing all 3 packages:");
        System.out.println("--------------------------");
        //Create the 3 packages
        Package familyPack = new Package();
        Package partyPack = new Package();
        Package grandPack = new Package();

        //create 3 package names
        familyPack.setName("Family Package");
        partyPack.setName("Party Package");
        grandPack.setName("Grand Package");

        //create 3 package prices
        familyPack.setPrice(30);
        partyPack.setPrice(100);
        grandPack.setPrice(300);

        //create 3 package served
        familyPack.setMaxPeopleServed(15);
        partyPack.setMaxPeopleServed(50);
        grandPack.setMaxPeopleServed(150);

        //print package for customer
        familyPack.printPackage();
        partyPack.printPackage();
        grandPack.printPackage();

        System.out.println("---------------------------------------------------------------------");
        // set up venue A
        System.out.println("Printing all venues:");
        System.out.println("--------------------------");
        Venue venueA = new Venue();
        venueA.setName("Venue A");

        //set Dates for venue A
        LocalDate first = LocalDate.of(2022,9,8);
        LocalDate second = LocalDate.of(2022,9,9);
        LocalDate third = LocalDate.of(2022,9,10);
        venueA.addDate(first);
        venueA.addDate(second);
        venueA.addDate(third);

        //set link,price and address for venue A
        venueA.setAddress("43 Magic Road, Downtown");
        venueA.setPrice(340);
        venueA.setLink("www.venueA.com");

        // set up venue B
        Venue venueB = new Venue();
        venueB.setName("Venue B");

        //set Dates for venue B
        LocalDate fourth = LocalDate.of(2022,9,11);
        LocalDate fifth = LocalDate.of(2022,9,12);
        venueB.addDate(third);
        venueB.addDate(fourth);
        venueB.addDate(fifth);

        //set link,price and address for venue B
        venueB.setAddress("21 Special Road, Uptown");
        venueB.setPrice(450);
        venueB.setLink("www.venueB.com");

        //print venues for customer
        venueA.printVenueSummary();
        venueB.printVenueSummary();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Printing all menus:");
        System.out.println("--------------------------");

        //set menu for american food
        FoodMenu american = new FoodMenu();
        american.setPricePerHead(20);
        american.getMenu().add("Cheeseburger");
        american.getMenu().add("Hot dog");
        american.getMenu().add("Pizza");
        american.setName("American");
        
        //set menu for chinese food
        FoodMenu chinese = new FoodMenu();
        chinese.setPricePerHead(15);
        chinese.getMenu().add("Dumpling");
        chinese.getMenu().add("Char Siu");
        chinese.getMenu().add("Siu Mai");
        chinese.setName("Chinese");

        //print menus for customer
        american.printMenuSummary();
        chinese.printMenuSummary();

        System.out.println("---------------------------------------------------------------------");

        // require sign in
        Customer customer = new Customer();
        customer.setName("Jeff");
        customer.setEmail("Jeff@gmail.com");
        customer.setPhone("0451234567");

        //create event with 23 attendees
        int attendees = 23;

        //sitting arrangement
        List<String> sittingList = Arrays.asList("Jeff", "John","Jake");
        SeatingArrangements seating = new SeatingArrangements();
        seating.setSeating(sittingList);

        // Jeff selects venue B on 11 Oct with 23 attendees under the party package. he picks american as the menu and includes all optional additions
        Event event1 = customer.bookEvent(venueB, customer, fourth, attendees,seating,partyPack,american,true,true,true);

        // if want musical band, show options
        if (event1.getIncludesMusicBand()){
            System.out.printf("Printing all musical bands that are available on %tB %<te, %<tY:%n", event1.getReservedDate());    
            System.out.println("-------------------------------------------------------------------");

            //create band 1
            MusicBand musicBand1 = new MusicBand();
            musicBand1.setName("RHCP");
            musicBand1.addDate(first);
            musicBand1.addDate(third);
            musicBand1.addDate(fourth);
            musicBand1.setPrice(300);
            //show band as option if the date of event coincides with the available date of the band
            if (musicBand1.getAvailableDates().contains(event1.getReservedDate())){
                musicBand1.printBandSummary();
            }
            //create band 2
            MusicBand musicBand2 = new MusicBand();
            musicBand2.setName("Metallica");
            musicBand2.addDate(second);
            musicBand2.addDate(fourth);
            musicBand2.setPrice(500);
            //show band as option if the date of event coincides with the available date of the band
            if (musicBand2.getAvailableDates().contains(event1.getReservedDate())){
                musicBand2.printBandSummary();
            }

            //select band1 
            event1.setMusicBand(musicBand1);
            System.out.println("---------------------------------------------------------------------");
        }

        //do if event wants sound system
        if (event1.getIncludesSoundSystem()){
            System.out.printf("Printing all sound systems that are available on %tB %<te, %<tY:%n", event1.getReservedDate()); 
            System.out.println("-------------------------------------------------------------------");   
            //create sound system 1
            SoundSystem soundSystem1 = new SoundSystem();
            soundSystem1.setType("Logitech Surround Sound Z607");
            soundSystem1.addDate(first);
            soundSystem1.addDate(second);
            soundSystem1.addDate(fourth);
            soundSystem1.setPrice(200);
            //show band as option if the date of event coincides with the available date of the band
            if (soundSystem1.getAvailableDates().contains(event1.getReservedDate())){
                soundSystem1.printSoundSysSummary();
            }
            //create sound system 2
            SoundSystem soundSystem2 = new SoundSystem();
            soundSystem2.setType("Yamaha 1840");
            soundSystem2.addDate(first);
            soundSystem2.addDate(fourth);
            soundSystem2.setPrice(400);
            //show sound system as option if the date of event coincides with the available date of the sound system
            if (soundSystem2.getAvailableDates().contains(event1.getReservedDate())){
                soundSystem2.printSoundSysSummary();
            }

            //select soundSystem2 
            event1.setSoundSystem(soundSystem2);
            System.out.println("---------------------------------------------------------------------");
        }

        if (event1.getIncludesFlowerDecor()){
            System.out.println("Printing all flower arrangements:");
            System.out.println("---------------------------------");    

            //create flowerArrange 1
            FlowerArrange flowerArrange1 = new FlowerArrange();
            flowerArrange1.setArrangementType("Black and white");
            flowerArrange1.setPrice(40);
            flowerArrange1.printFlowerArrange();

            //create flowerArrange 2
            FlowerArrange flowerArrange2 = new FlowerArrange();
            flowerArrange2.setArrangementType("Pastel");
            flowerArrange2.setPrice(50);
            flowerArrange2.printFlowerArrange();

            //create flowerArrange 3
            FlowerArrange flowerArrange3 = new FlowerArrange();
            flowerArrange3.setArrangementType("Summer Vibes");
            flowerArrange3.setPrice(30);
            flowerArrange3.printFlowerArrange();

            //select flowerArrange3
            event1.setFlowerArrange(flowerArrange3);
            System.out.println("---------------------------------------------------------------------");
        }

        if (event1 != null){
            System.out.printf("Booking of event for %s:%n", customer.getName());
            event1.printEventSummary();
            System.out.printf("Total price of event: $%d%n",event1.calculatTotalPrice());
            Bill bill = new Bill();
            if (!bill.isPaid()){
                System.out.println("Select payment option:");
                System.out.printf("Cash in person%nCredit Card%nDedit Card%n%n");
                //select credit card
                bill.setPaymentOption("Credit Card");
                //payment goes through
                bill.setPaid(true);
            }
            if (bill.isPaid()){
                System.out.printf("Payment by %s was successful%n%n", bill.getPaymentOption());
            }
        }
        if (event1.isCancelEvent()){
            System.out.println("event was cancelled");
        }

        //create event manager
        EventManager eventManager = new EventManager();
        eventManager.setName("Ernest");
        eventManager.setID(10);
        eventManager.setTeam(true);

        //event manager books event
        if (!event1.isBooked()){
            System.out.println("Event Manager books venue for reserved date\n");
            eventManager.bookVenue(event1);
        }

        //event manager arranges seats
        List<String> newSittingList = Arrays.asList("Jeff", "Jake","Paul","John");
        eventManager.arrangeSeats(event1, newSittingList);
        System.out.print("New ");
        event1.getSeatingArrangement().printSeating();

        List<Communication> communications = new ArrayList<Communication>();

        //all communication sent by customers
        System.out.println("Communication sent by customers to event manager:");
        System.out.println("-------------------------------");
        Communication requestInspection = customer.requestInspection(venueB, third);
        communications.add(requestInspection);
        System.out.println("---------------------------------------------------------------------");

        Communication requestMenuAdd = customer.requestMenuAdd(event1, "Vegan Burger");
        communications.add(requestMenuAdd);
        System.out.println("---------------------------------------------------------------------");

        Communication requestMenuRemove = customer.requestMenuRemove(event1, "Cheeseburger");
        communications.add(requestMenuRemove);
        System.out.println("---------------------------------------------------------------------");

        Communication askQuery = customer.askQuery("I would like a discount because the band I want will not play all songs");
        communications.add(askQuery);
        System.out.println("---------------------------------------------------------------------");

        Communication sendComplaint = customer.sendComplaint("The caterer did not provide enough food");
        communications.add(sendComplaint);
        System.out.println("---------------------------------------------------------------------");

        //event manager reads all communication
        System.out.println("Event manager reads and answers communication from customer:");
        System.out.println("----------------------------------");
        List<Communication> answers = new ArrayList<Communication>();

        for (Communication communication : communications) {
            communication.setMessageRecieved(true);
            if (communication.isAnswerable()){
                System.out.printf("Message from customer that needs answer: %s%n",communication.getMessageSent());
                if (communication.getType().equals("Inspection of venue")){
                    Communication answerInspect = eventManager.answerCustomer("Approved date of inspection");
                    answers.add(answerInspect);
                    System.out.println("---------------------------------------------------------------------");
                }
                else if (communication.getType().equals("Add Vegan Burger to menu")){
                    Communication answerAddMenu = eventManager.answerCustomer("Added Vegan Burger to menu");
                    answers.add(answerAddMenu);
                    System.out.println("---------------------------------------------------------------------");
                }
                else if (communication.getType().equals("Remove Cheeseburger from menu")){
                    Communication answerRemoveMenu = eventManager.answerCustomer("Removed Cheeseburger from menu");
                    answers.add(answerRemoveMenu);
                    System.out.println("---------------------------------------------------------------------");
                }
                else if (communication.getType().equals("Query")){
                    Communication answerQuery = eventManager.answerCustomer("We cannot give out discounts as it would be unfair for other customers");
                    answers.add(answerQuery);
                    System.out.println("---------------------------------------------------------------------");
                }

            }
            if (!communication.isAnswerable()){
                System.out.printf("Complaints from customer: %s%n%n",communication.getMessageSent());
                System.out.println("---------------------------------------------------------------------");
            }
        }

        //customer reads answers
        System.out.println("Customer reads answers from event manager:");
        System.out.println("----------------------------------");
        for (Communication answer : answers) {
            answer.setMessageRecieved(true);
            answer.printMessageRecieved();
        }

        System.out.println("---------------------------------------------------------------------");
        //caterer add food to event with event id = 0
        System.out.println("Caterer removes vegan burger and adds cheeseburger to event:");
        System.out.println("-------------------------------------------------------");
        Caterer caterer = new Caterer();
        caterer.setID(21);
        caterer.setName("Charlie");
        caterer.addFoodToMenu("Vegan Burger", event1);

        //caterer remove food from event with event id = 0
        caterer.removeFoodFromMenu("Cheeseburger", event1);
        System.out.print("Updated ");
        event1.getFoodMenu().printMenu();


        System.out.println("Caterer orders and delivers food for event:");
        System.out.println("-------------------------------------------------------");
        //caterer orders food
        if (!event1.isFoodOrdered()){
            caterer.orderFood(event1);
            System.out.println("Caterer ordered food");
        }

        //caterer delivers food to event
        if (!event1.isFoodDelivered()){
            caterer.deliverFood(event1);
            System.out.println("Food was delivered by caterer");
        }

        //caterer changes price per head to 18
        caterer.updatePricePerHead(event1, 18);
        System.out.println("New price per head: $" + event1.getFoodMenu().getPricePerHead());
        System.out.println("New Total Price: $" + event1.calculatTotalPrice());

        System.out.println("---------------------------------------------------------------------");

        LogisticsManager logisticsManager = new LogisticsManager();
        logisticsManager.setID(35);
        logisticsManager.setName("Larry");

        System.out.println("Logistic manager orders and delivers all additions:");
        System.out.println("---------------------------------------------------");
        //logistic manager orders all included additions
        if (event1.getMusicBand().isOrdered() == false && event1.getIncludesMusicBand() == true){
            logisticsManager.orderAddition(event1.getMusicBand());
        }
        if (event1.getSoundSystem().isOrdered() == false && event1.getIncludesSoundSystem() == true){
            logisticsManager.orderAddition(event1.getSoundSystem());
        }
        if (event1.getFlowerArrange().isOrdered() == false && event1.getIncludesFlowerDecor() == true){
            logisticsManager.orderAddition(event1.getFlowerArrange());
        }

        //logistic manager delivers all included additions
        if (event1.isDeliverMusicBand() == false && event1.getIncludesMusicBand() == true){
            logisticsManager.deliverAddition(event1, event1.getMusicBand());
        }
        if (event1.isDeliverSoundSystem() == false && event1.getIncludesSoundSystem() == true){
            logisticsManager.deliverAddition(event1, event1.getSoundSystem());
        }
        if (event1.isDeliverFlowerDecor() == false && event1.getIncludesFlowerDecor() == true){
            logisticsManager.deliverAddition(event1, event1.getFlowerArrange());
        }

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Finance manager updates package price and budget:");
        System.out.println("---------------------------------------------------");

        FinanceManager financeManager = new FinanceManager();
        financeManager.setID(47);
        financeManager.setName("Fiona");
        financeManager.setBudget(event1, 2000);
        System.out.println("Updated budget to " + String.valueOf(event1.getBudget()));
        financeManager.setPackagePrice(grandPack, 400);
        System.out.println("Updated " + grandPack.getName() + "'s price to " + String.valueOf(grandPack.getPrice()));
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("All managers send their bill to the finance manager:");
        System.out.println("---------------------------------------------------");

        eventManager.sendBill(600, financeManager);
        caterer.sendBill(500, financeManager);
        logisticsManager.sendBill(900, financeManager);
        System.out.println("Total bill from all managers: " + financeManager.getBill());
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Customer cancel an event:");
        System.out.println("----------------------------");
        customer.cancelEvent(event1);
        if (event1.isCancelEvent()){
            System.out.printf("Event with ID = %d was cancelled%n",event1.getEventID());
        }
        System.out.println("---------------------------------------------------------------------");
    }
}