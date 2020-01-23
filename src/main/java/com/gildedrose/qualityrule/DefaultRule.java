package com.gildedrose.qualityrule;

import com.gildedrose.Item;

import static com.gildedrose.qualityrule.Constants.DEFAULT_QUALITY_CHANGE;


public class DefaultRule extends DegradableItemRule {

    @Override
    protected int getUpdatedQuality(Item item) {
        int qualityChange = DEFAULT_QUALITY_CHANGE * getDegradeMultiplier(item.sellIn);
        return item.quality - qualityChange;
    }
}
