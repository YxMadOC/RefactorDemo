package gildedRose;

import rentalstore.AgedBrie;
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
                decreaseSellIn();
                increaseQualitySafely();
                if (sellIn < 10) {
                    increaseQualitySafely();
                }
                if (sellIn < 5) {
                    increaseQualitySafely();
                }
                if (sellIn < 0) {
                    quality = 0;
                }
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
}
