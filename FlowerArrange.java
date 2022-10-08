public class FlowerArrange extends Addition{
    private String arrangementType;
  
    public void setArrangementType(String arrangementType) {
        this.arrangementType = arrangementType;
    }

    public String getArrangementType() {
        return arrangementType;
    }
    
    public void printFlowerArrange() {
        System.out.printf("Flower arrangement type: %s%n", arrangementType);
        System.out.printf("Flower arrangement price: %d%n%n", price);
    }
}