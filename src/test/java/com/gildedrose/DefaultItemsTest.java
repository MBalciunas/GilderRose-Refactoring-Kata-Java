package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultItemsTest {

    @Test
    public void testDefaultItemQuality() {
        Item[] items = new Item[] { new Item("simple item", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(9, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void testOutdatedDefaultItemQuality() {
        Item[] items = new Item[] { new Item("default item", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(8, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    public void testNoNegativeDefaultItemQuality() {
        Item[] items = new Item[] { new Item("not a special item", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
}