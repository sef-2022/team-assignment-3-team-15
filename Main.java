import java.util.Date;

import javax.print.event.PrintEvent;

public class Main {
    public static void main(String[] args) {
        /*
        Customer customer = new Customer();
        customer.setName("Jeff");
        System.out.printf("Name: %s%n",customer.getName());

        customer.setEmail("Jeff@gmail.com");
        System.out.printf("Email: %s%n",customer.getEmail());

        Event event = new Event();
        event.addFood("Cheese");
        event.addFood("Rice");
        event.printMenu();

        event.removeFood("Cheese");
        event.removeFood("Curry");

        */
        // start here
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Printing all 3 packages:");
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
        Venue venueA = new Venue();

        //set Dates for venue A
        Date first = new Date(122,9,8);
        Date second = new Date(122,9,9);
        Date third = new Date(122,9,10);
        venueA.addDate(first);
        venueA.addDate(second);
        venueA.addDate(third);

        //set link and address for venue A
        venueA.setAddress("43 Magic Road, Downtown");
        venueA.setLink("www.venueA.com");

        // set up venue B
        Venue venueB = new Venue();

        //set Dates for venue B
        Date fourth = new Date(122,9,11);
        Date fifth = new Date(122,9,12);
        venueB.addDate(third);
        venueB.addDate(fourth);
        venueB.addDate(fifth);

        //set link and address for venue B
        venueB.setAddress("21 Special Road, Uptown");
        venueB.setLink("www.venueB.com");


        //print venues for customer
        System.out.printf("Venue A's address: %s%nVenue A's link: %s%n",venueA.getAddress(), venueA.getLink());
        System.out.print("Venue A's ");
        venueA.printDates();

        System.out.printf("Venue B's address: %s%nVenue B's link: %s%n",venueB.getAddress(), venueB.getLink());
        System.out.print("Venue B's ");
        venueB.printDates();

        //reserve Oct 11 for venue B
        venueB.reserveDate(fourth);

        //try booking Oct 9 for venue B
        venueB.reserveDate(second);

        System.out.println("---------------------------------------------------------------------");
        // require sign in
        Customer customer = new Customer();
        customer.setName("Jeff");
        customer.setEmail("Jeff@gmail.com");

        //create event
        //customer.bookEvent();
        System.out.printf("Booking event for %s%n", customer.getName());
    }
}
