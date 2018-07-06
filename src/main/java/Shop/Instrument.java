package Shop;

import Behaviours.IPlay;

public abstract class Instrument extends StockItem implements IPlay {

    private InstrumentType instrumentType;

    public Instrument(double buyPrice, double sellPrice, InstrumentType instrumentType){
        super(buyPrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public abstract String play();

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
