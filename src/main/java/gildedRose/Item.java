package gildedRose;

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
        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn = sellIn - 1;
        }

        if (!name.equals("Aged Brie")) {
            if (!name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (quality > 0) {
                    if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                        quality = quality - 1;
                    }
                }
            } else {
                if (quality < MAX_QUALITY) {
                    quality = quality + 1;
                    if (sellIn < 10) {
                        increaseQualitySafely();
                    }

                    if (sellIn < 5) {
                        increaseQualitySafely();
                    }
                }
            }
        } else {
            increaseQualitySafely();
        }

        if (sellIn < 0) {
            if (!name.equals("Aged Brie")) {
                if (!name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (quality > 0) {
                        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                increaseQualitySafely();
            }
        }
    }

    private void increaseQualitySafely() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;
        }
    }

}
