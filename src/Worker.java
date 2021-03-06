import animals.Animal;
import animals.Giraffe;
import animals.interfaces.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice voice) {
        System.out.println("Животное издаёт звук: " + voice.voice());
    }
}
