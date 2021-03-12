package animals;

import MyException.WrongFoodException;
import food.Food;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int satiety;
    private SizeAviary sizeAviary;;


    public Animal() {
        setNameAndSatiety(this.getClass().getSimpleName(), 0);
    }

    public Animal(String name, SizeAviary sizeAviary) {
        this.name = name;
        this.sizeAviary = sizeAviary;
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

    public SizeAviary getSizeAviary() {
        return sizeAviary;
    }

    public String getSuperClassName(){
        return "Animal";
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    abstract public void eat(Food food) throws WrongFoodException;

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
