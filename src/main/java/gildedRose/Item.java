package gildedRose;

import rentalstore.AgedBrie;
import rentalstore.BackstagePass;
import rentalstore.Sulfuras;

public class Item {


    public static final int MAX_QUALITY = 50;
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {

        switch (name) {
            case "Sulfuras, Hand of Ragnaros":
                new Sulfuras().updateQuality(this);
            case "Aged Brie":
                new AgedBrie().updateQuality(this);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstagePass().updateQuality(this);
                break;
            default:
                decreaseSellIn();
                if (quality > 0) {
                    quality = quality - 1;
                    if (sellIn < 0) {
                        quality = quality - 1;
                    }
                }
                break;
        }
    }

    public void decreaseSellIn() {
        sellIn -= 1;
    }

    public void increaseQualitySafely() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
