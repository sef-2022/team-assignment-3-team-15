import java.util.*; 

public class FoodMenu {
    List<String> menu = new ArrayList<String>();

    public void addFoodMenu(String food) {
        menu.add(food);
    }

    public void removeFoodMenu(String food) {
        menu.remove(food);
    }

    public List<String> getMenu() {
        return menu;
    }
}