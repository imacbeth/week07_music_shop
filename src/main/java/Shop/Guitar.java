package Shop;

public class Guitar extends Instrument {

    public int numberOfStrings;
    public String make;


    public Guitar(double buyPrice, double sellPrice, InstrumentType instrumentType, int numberOfStrings, String make){
        super(buyPrice, sellPrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.make = make;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    @Override
    public String play() {
        return "playing guitar solo";
    }

    @Override
    public double getBuyPrice() {
        return super.getBuyPrice();
    }

    @Override
    public double getSellPrice() {
        return super.getSellPrice();
    }

    @Override
    public double calculateMarkUp() {
        return super.calculateMarkUp();
    }
}




