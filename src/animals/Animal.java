package animals;

import food.Food;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int satiety;
    private String aviarysize;

    public Animal() {
        setNameAndSatiety(this.getClass().getSimpleName(), 0);
    }

    public Animal(String name, String aviarysize) {
        this.name = name;
        this.aviarysize = aviarysize;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
