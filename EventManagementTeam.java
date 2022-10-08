public class EventManagementTeam {
    protected String name;
    protected int ID;
    protected boolean team;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getID() {
        return ID;
    }

    public void setTeam(boolean team) {
        this.team = team;
    }
    
    public boolean isTeam() {
        return team;
    }

    public void sendBill(int price, FinanceManager financeManager) {
        financeManager.totalBill += price;
    }
}