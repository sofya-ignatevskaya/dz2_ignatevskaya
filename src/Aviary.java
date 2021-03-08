import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal> {

    private Map<String, T> aviaryMap = new HashMap();

    public void add(String name, T animal){
        aviaryMap.put(name, animal);
    }

    public void remove(String name){
    aviaryMap.remove(name);
    }

    public void get(String name){
    aviaryMap.get(name);
    }


}
