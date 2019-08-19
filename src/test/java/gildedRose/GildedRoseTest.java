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

    @Test
    public void shouldReturn18_givenANormalItemSellInIs0AndQualityIs20() {
        Item item = new Item(NORMAL_ITEM_NAME, 0, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(18, item.quality);
    }

    @Test
    public void shouldReturn0_givenANormalItemSellInIs10AndQualityIs0() {
        Item item = new Item(NORMAL_ITEM_NAME, 10, 0);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
    }

    @Test
    public void shouldReturn41_givenAgedBrieSellInIs10AndQualityIs40() {
        Item item = new Item(AGED_BRIE_NAME, 10, 40);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(41, item.quality);
    }

    @Test
    public void shouldReturn50_givenAgedBrieSellInIs10AndQualityIs50() {
        Item item = new Item(AGED_BRIE_NAME, 10, 50);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
    }

    @Test
    public void shouldReturn50_givenAgedBrieSellInIs0AndQualityIs48() {
        Item item = new Item(AGED_BRIE_NAME, 0, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
    }



}