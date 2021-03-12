package animals;

import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T> {
    private SizeAviary sizeAviary;
    private String type;
    private Map<String, T> aviaryMap = new HashMap();


    public Aviary(SizeAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    public void add(String key, T object) {

        if (object instanceof Animal) {
            if (type == null) {
                type = ((Animal) object).getSuperClassName(); // добавляем тип вольера
            }
            if (type.equals(((Animal) object).getSuperClassName())) {
                if (((Animal) object).getSizeAviary() == this.sizeAviary) {
                    aviaryMap.put(key, object);
                    System.out.println(((Animal) object).getName() + " добавлен в вольер");

                } else if (((Animal) object).getSizeAviary() != this.sizeAviary) {
                    System.out.println("Вольер не подходит по размеру. " + ((Animal) object).getName()
                            + " не добавлен в вольер");
                }
            } else {
                System.out.println("У " + ((Animal) object).getName() + " тип: " + ((Animal) object).getSuperClassName() + " Животное не добавлено");
            }
        } else {
            System.out.println(object.getClass().getSimpleName() + " добавлен в вольер");
        }
    }


    public void remove(String key) {
        if(aviaryMap.size() == 1)
        {
            type = null;
        }
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

    public String getType() {
        return type;
    }

}

