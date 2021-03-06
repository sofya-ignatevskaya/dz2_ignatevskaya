package animals;

import food.Food;

public abstract class Animal {
    private String name;
    private int satiety;

    public Animal() {
        setNameAndSatiety(this.getClass().getName(), 0);
    }

    public Animal(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public void setNameAndSatiety(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    abstract public void eat(Food food);
}
