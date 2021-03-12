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

            if (((Animal) object).getSizeAviary() == this.sizeAviary) {
                if (type == null){
                    type = ((Animal) object).getSuperClassName();
                }else if (type.equals(((Animal) object).getSuperClassName())){
                    aviaryMap.put(key, object);
                    System.out.println(((Animal) object).getName() + " добавлен в вольер");
                }else{
                    System.out.println("Животное не добавлено из-за несоответствия типа");
                }
            } else if (((Animal) object).getSizeAviary() != this.sizeAviary) {
                System.out.println("Вольер не подходит по размеру. " + ((Animal) object).getName()
                        + " не добавлен в вольер");
            }
        } else {
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

    public void getType() {
        System.out.println("Тип вольера: " + type);;
    }

    /*public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Aviary<Animal> carnivorousAviary = new Aviary<>(SizeAviary.BIG);
        /*carnivorousAviary.add(r.getName(), r);
        System.out.println(carnivorousAviary.getType());
    }*/

}

