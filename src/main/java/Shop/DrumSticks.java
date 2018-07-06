package Shop;

public class DrumSticks extends StockItem {

    private String make;
    private String type;

    public DrumSticks(double buyPrice, double sellPrice, String make) {
        super(buyPrice, sellPrice);
        this.make = make;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
