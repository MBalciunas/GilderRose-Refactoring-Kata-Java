package com.gildedrose.qualityrule;

import com.gildedrose.Item;

import static com.gildedrose.qualityrule.Constants.*;

public abstract class DegradableItemRule implements Rule {

    @Override
    public void updateItem(Item item) {
        item.quality = adjustQualityWithinBoundaries(getUpdatedQuality(item));
        item.sellIn -= DEFAULT_SELLIN_CHANGE;
    }

    private int adjustQualityWithinBoundaries(int quality) {
        if(quality > MAX_QUALITY) {
            return MAX_QUALITY;
        }
        if(quality < MIN_QUALITY) {
            return MIN_QUALITY;
        }
        return quality;
    }

    protected int getDegradeMultiplier(int sellIn) {
        return sellIn > 0 ? 1 : OUTDATED_ITEM_DEGRADE_RATE;
    }

    abstract protected int getUpdatedQuality(Item item);
}
