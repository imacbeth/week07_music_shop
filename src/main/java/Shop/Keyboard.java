package Shop;

public class Keyboard extends Instrument{

    public int numberOfKeys;
    public String make;


    public Keyboard(double buyPrice, double sellPrice, InstrumentType instrumentType, int numberOfKeys, String make){
        super(buyPrice, sellPrice, instrumentType);
        this.numberOfKeys = numberOfKeys;
        this.make = make;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys
    ) {
        this.numberOfKeys = numberOfKeys;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    @Override
    public String play() {
        return "plink plonk";
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
