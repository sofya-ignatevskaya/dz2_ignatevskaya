import animals.Animal;
import animals.Fish;
import food.Food;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Animal> aviaryMap = new HashMap();
        Animal fish = new Fish();
        Animal fish2 = new Fish("Olya", 0);
        aviaryMap.put(fish.getName(), fish);
        aviaryMap.put(fish2.getName(), fish2);

        System.out.println(aviaryMap.toString());
    }
}
