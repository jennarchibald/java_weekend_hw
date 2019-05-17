package MusicShop.Instruments;

import MusicShop.InstrumentTypes;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(double buyPrice, double sellPrice, int numberOfStrings) {
        super(buyPrice, sellPrice, InstrumentTypes.STRING);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Brrrrrrmmmmm!";
    }
}
