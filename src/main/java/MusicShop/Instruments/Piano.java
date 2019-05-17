package MusicShop.Instruments;

import MusicShop.Enums.InstrumentTypes;

public class Piano extends Instrument{

    private int octaveRange;

    public Piano(double buyPrice, double sellPrice, int octaveRange) {
        super(buyPrice, sellPrice, InstrumentTypes.KEYBOARD);
        this.octaveRange = octaveRange;
    }

    public int getOctaveRange() {
        return octaveRange;
    }

    @Override
    public String play() {
        return "Plink plonk";
    }
}
