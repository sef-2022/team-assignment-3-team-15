import java.util.*; 

public class SeatingArrangements {
    private List<String> seating = new ArrayList<String>();

    public void setSeating(List<String> seating) {
        this.seating = seating;
    }

    public List<String> getSeating() {
        return seating;
    }

    public void printSeating() {
        System.out.println("Seating Arrangement:");
        for (String string : seating) {
            System.out.println(string);
        }
        System.out.println();
    }
}