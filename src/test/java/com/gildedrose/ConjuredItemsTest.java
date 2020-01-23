package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemsTest {

    @Test
    public void testConjuredItemQuality() {
        Item[] items = new Item[] { new Item("Conjured banana", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(8, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void testOutdatedConjuredItemQuality() {
        Item[] items = new Item[] { new Item("Conjured sword", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(6, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    public void testNoNegativeConjuredItemQuality() {
        Item[] items = new Item[] { new Item("Conjured cupcake", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
}
