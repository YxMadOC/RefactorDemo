package gildedRose;

public class BackstagePass implements SellItem {
    @Override
    public void updateQuality(Item item) {
        item.decreaseSellIn();
        item.increaseQualitySafely();
        if (item.getSellIn() < 10) {
            item.increaseQualitySafely();
        }

        if (item.getSellIn() < 5) {
            item.increaseQualitySafely();
        }
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
