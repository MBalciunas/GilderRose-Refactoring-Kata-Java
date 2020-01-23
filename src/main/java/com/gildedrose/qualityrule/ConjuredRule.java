package com.gildedrose.qualityrule;

import com.gildedrose.Item;

import static com.gildedrose.qualityrule.Constants.DEFAULT_QUALITY_CHANGE;

public class ConjuredRule extends DegradableItemRule {

    private static final int CONJURED_DEGRADE_RATE = 2;

    @Override
    protected int getUpdatedQuality(Item item) {
        int qualityChange = DEFAULT_QUALITY_CHANGE * CONJURED_DEGRADE_RATE * getDegradeMultiplier(item.sellIn);
        return item.quality - qualityChange;
    }
}
