package MusicShop.Instruments;

import MusicShop.Enums.InstrumentTypes;
import MusicShop.Interfaces.IPlay;
import MusicShop.Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    protected double buyPrice;
    protected double sellPrice;
    protected InstrumentTypes type;

    public Instrument(double buyPrice, double sellPrice, InstrumentTypes type) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public InstrumentTypes getType() {
        return type;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
