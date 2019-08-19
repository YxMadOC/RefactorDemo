package gildedRose;

public class AgedBrie implements SellItem {
    @Override
    public void updateQuality(Item item) {
        item.decreaseSellIn();
        item.increaseQualitySafely();
        if (item.getSellIn() < 0) {
            item.increaseQualitySafely();
        }
    }
}
