package MusicShop;

import MusicShop.Instruments.Guitar;
import MusicShop.Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public int stockCount(){
        return stock.size();
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }

}
