package animals;

import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T> {
    private SizeAviary sizeAviary;
    private Map<String, T> aviaryMap = new HashMap();

    public Aviary(SizeAviary sizeAviary)
    {
        this.sizeAviary = sizeAviary;
    }

    public void add(String key, T object) {
        if(object instanceof Animal) {
            if (((Animal) object).getSizeAviary() == this.sizeAviary) {
                aviaryMap.put(key, object);
                System.out.println(((Animal) object).getName() + " добавлен в вольер");
            } else {
                System.out.println("Вольер не подходит по размеру. " + ((Animal) object).getName()
                        + " не добавлен в вольер");
            }
        }else{
            System.out.println(object.getClass().getSimpleName() + " добавлен в вольер");
        }

    }

    public void remove(String key) {
        aviaryMap.remove(key);
    }

    public void get(String key) {
        System.out.println(aviaryMap.get(key));
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "aviaryMap=" + aviaryMap +
                '}';
    }
}
