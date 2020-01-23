package com.gildedrose.itemfactory;

import com.gildedrose.qualityrule.*;

import java.util.function.Predicate;

enum ItemCategory {

    AGED_BRIE(Predicate.isEqual("Aged Brie"), new AgedBrieRule()),
    SULFURAS(Predicate.isEqual("Sulfuras, Hand of Ragnaros"), new SulfurasRule()),
    BACKSTAGE_PASS(name -> name.startsWith("Backstage passes"), new BackStagePassRule()),
    CONJURED(name -> name.startsWith("Conjured"), new ConjuredRule());


    private Predicate<String> isItemCategory;
    private Rule rule;

    ItemCategory(Predicate<String> isItemCategory, Rule rule) {
        this.isItemCategory = isItemCategory;
        this.rule = rule;
    }

    public boolean isItemCategoryFor(String name) {
        return this.isItemCategory.test(name);
    }

    public Rule getRule() {
        return this.rule;
    }


}