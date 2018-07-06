public class Guitar extends Instrument {

    public int numberOfStrings;
    public String make;

    public Guitar(InstrumentType instrumentType, int numberOfStrings, String make){
        super(instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.make = make;
    }

    @Override
    public String play() {
        return "playing guitar solo";
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
}
