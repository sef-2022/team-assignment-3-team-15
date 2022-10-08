import java.util.*; 

public class FoodMenu {
    private List<String> menu = new ArrayList<String>();
    private String name;
    private int pricePerHead;

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPricePerHead() {
        return pricePerHead;
    }

    public void setPricePerHead(int pricePerHead) {
        this.pricePerHead = pricePerHead;
    }

    public void printMenu() {
        System.out.printf("Menu for %s:%n",name);
        for (String string : menu) {
            System.out.println(string);
        }
        System.out.println();
    }

    public void printMenuSummary() {
        System.out.printf("%s Menu price per head: %s%n", name ,pricePerHead);
        printMenu();
    }
}