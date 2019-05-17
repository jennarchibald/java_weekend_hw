package MusicShop.Items;

import MusicShop.Enums.MusicPiece;
import MusicShop.Interfaces.ISell;

public class SheetMusic implements ISell {

    private MusicPiece musicPiece;
    private double buyPrice;
    private double sellPrice;

    public SheetMusic(MusicPiece musicPiece, double buyPrice, double sellPrice) {
        this.musicPiece = musicPiece;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getTitle(){
        return musicPiece.getTitle();
    }

    public String getComposer(){
        return musicPiece.getComposer();
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
