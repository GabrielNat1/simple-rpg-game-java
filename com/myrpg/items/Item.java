package com.myrpg.items;

import com.myrpg.character.Hero;

public abstract class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void use(Hero hero);
}
