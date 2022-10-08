public class Caterer extends EventManagementTeam {
    public void addFoodToMenu(String food, Event event) {
        event.getFoodMenu().getMenu().add(food);
    }

    public void removeFoodFromMenu(String food, Event event) {
        event.getFoodMenu().getMenu().remove(food);
    }

    public void deliverFood(Event event){
        event.setFoodDelivered(true);
    }

    public void orderFood(Event event){
        event.setFoodOrdered(true);
    }

    public void updatePricePerHead(Event event, int newPrice){
        event.getFoodMenu().setPricePerHead(newPrice);
    }
}