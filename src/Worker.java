import MyException.WrongFoodException;
import animals.Animal;
import animals.Giraffe;
import animals.SizeAviary;
import animals.interfaces.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        animal.eat(food);
    }

    public void getVoice(Voice voice) {
        System.out.println("Животное издаёт звук: " + voice.voice());
    }
}
