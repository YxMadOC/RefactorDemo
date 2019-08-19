package gildedRose;

public class NormalSellItem implements SellItem {
    @Override
    public void updateQuality(Item item) {
        item.decreaseSellIn();
        item.decreaseQualitySafely();
        if (item.getSellIn() < 0) {
            item.decreaseQualitySafely();
        }
    }
}
