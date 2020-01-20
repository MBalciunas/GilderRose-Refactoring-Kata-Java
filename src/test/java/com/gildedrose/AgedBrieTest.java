package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    public void testAgedBrieQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(16, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    }

    @Test
    public void testOutdatedAgedBrieQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(12, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    public void testMaxAgedBrieQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(50, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }
}