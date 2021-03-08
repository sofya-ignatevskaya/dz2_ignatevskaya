package animals;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*Map<String, Animal> aviaryMap = new HashMap();
        Animal fish = new Fish();
        Animal fish2 = new Fish("Olya", 0);
        aviaryMap.put(fish.getName(), fish);
        aviaryMap.put(fish2.getName(), fish2);
        aviaryMap.put(new Rabbit("Gosha", 1).getName(),
                new Rabbit("Gosha", 1) );
        aviaryMap.remove(fish2.getName());
        System.out.println( aviaryMap.get("Fish"));
        System.out.println(aviaryMap.toString());*/

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger("Leo", SizeAviary.BIG);
        Aviary<Carnivorous> aviary= new Aviary<>(SizeAviary.LITTLE);
        aviary.add(tiger.getName(), tiger);

    }
}
