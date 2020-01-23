package com.gildedrose.qualityrule;

import com.gildedrose.Item;

public class SulfurasRule implements Rule {

    private static final int SULFURAS_QUALITY = 80;

    @Override
    public void updateItem(Item item) {
        item.quality = SULFURAS_QUALITY;
    }
}
