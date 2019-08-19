package gildedRose;

public class Item {


    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    private SellItem sellItem;
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.sellItem = SellItemFactory.getSellItem(name);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        sellItem.updateQuality(this);
    }

    public void decreaseSellIn() {
        sellIn -= 1;
    }

    public void increaseQualitySafely() {
        if (quality < MAX_QUALITY) {
            quality += 1;
        }
    }

    public void decreaseQualitySafely() {
        if (quality > MIN_QUALITY) {
            quality = quality - 1;
        }
    }

    public void decreaseQuality() {
        quality -= 1;
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
