package animals;

import food.Food;

public abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat(Food food);
}
