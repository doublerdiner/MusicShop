package musicshop;

import musicshop.stock.ISell;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private ArrayList<ISell> allStock;

    public Shop(String name) {
        this.name = name;
        this.allStock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getAllStock() {
        return allStock;
    }

    public void add(ISell item){
        this.allStock.add(item);
    }
    public void remove(ISell item){
        this.allStock.remove(item);
    }
    public double calculateTotalStockMarkup(){
        double total = 0;
        for(ISell item : this.allStock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
