package animals;

import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private SizeAviary sizeAviary;

    public Aviary(SizeAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    private Map<String, T> aviaryMap = new HashMap();

    public void add(String name, T animal) {
        if (animal.getSizeAviary() == this.sizeAviary) {
            aviaryMap.put(name, animal);
            System.out.println(animal.getName() + " добавлен в вольер");
        } else {
            System.out.println("Вольер не подходит по размеру. " + animal.getName()
                    + " не добавлен в вольер");
        }
    }

    public void remove(String name) {
        aviaryMap.remove(name);
    }

    public void get(String name) {
        aviaryMap.get(name);
    }


}
