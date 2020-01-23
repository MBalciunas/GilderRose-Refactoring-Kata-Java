package com.gildedrose.itemfactory;

import com.gildedrose.qualityrule.DefaultRule;
import com.gildedrose.qualityrule.Rule;

import java.util.Arrays;
import java.util.Optional;

public class ItemFactory {

    public static Rule getQualityFor(com.gildedrose.Item item) {
        Optional<ItemCategory> itemQuality = Arrays.stream(ItemCategory.values())
                .filter(i -> i.isItemCategoryFor(item.name))
                .findFirst();

        return itemQuality.isPresent() ? itemQuality.get().getRule() : new DefaultRule();
    }
}
