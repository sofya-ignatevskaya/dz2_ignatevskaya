package animals;

import food.Food;

public abstract class Animal {
    private String name;
    private int satiety;

    public Animal(){
        this.name = "Animal";
        this.satiety = 100;
    }
    public Animal(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    abstract void eat(Food food);
}
