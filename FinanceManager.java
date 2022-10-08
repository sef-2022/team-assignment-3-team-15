public class FinanceManager extends EventManagementTeam {
    public int totalBill;

    public void setBudget(Event event,int budget) {
        event.setBudget(budget);;
    }

    public void setPackagePrice(Package package1,int price) {
        package1.setPrice(price);
    }

    public int getBill() {
        return totalBill;
    }
}