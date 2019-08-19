package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    private static final String NORMAL_ITEM_NAME = "Normal Item";
    private static final String AGED_BRIE_NAME = "Aged Brie";
    private static final String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";

    @Test
    public void shouldReturn19_givenANormalItemSellInIs10AndQualityIs20() {
        Item item = new Item(NORMAL_ITEM_NAME, 10, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(19, item.quality);
    }


}