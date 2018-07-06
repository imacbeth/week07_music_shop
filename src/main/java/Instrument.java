public abstract class Instrument implements IPlay {

    private InstrumentType instrumentType;

    public Instrument(InstrumentType instrumentType){
        this.instrumentType = instrumentType;
    }

    public abstract String play();

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
