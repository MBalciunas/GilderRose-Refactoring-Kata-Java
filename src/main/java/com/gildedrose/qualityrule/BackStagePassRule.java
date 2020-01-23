package com.gildedrose.qualityrule;

import com.gildedrose.Item;

public class BackStagePassRule extends DegradableItemRule {

    @Override
    protected int getUpdatedQuality(Item item) {
        if(item.sellIn > 10) return item.quality + 1;
        if(item.sellIn > 5) return item.quality + 2;
        if(item.sellIn > 0) return item.quality + 3;
        return 0;
    }
}
