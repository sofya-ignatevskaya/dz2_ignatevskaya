import animals.*;
import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Durk durk = new Durk("Mary", 0);
        Giraffe giraffe = new Giraffe();
        Rabbit rabbit = new Rabbit();

        Tiger tiger = new Tiger("Leontiy", 0);
        Fox fox = new Fox();
        Fish fish = new Fish();

        Wheat wheat = new Wheat();
        Leaves leaves = new Leaves();
        Carrot carrot = new Carrot();

        MeatForTiger meatForTiger = new MeatForTiger();
        MeatForFox meatForFox = new MeatForFox();
        MeatForFish meatForFish = new MeatForFish();

        Worker worker = new Worker();

        System.out.println("Кормим животных различной едой\n");

        Animal[] animals = new Animal[]{durk, giraffe, rabbit, tiger, fox, fish};
        Food[] foods = new Food[]{wheat, leaves, carrot, meatForTiger, meatForFish, meatForFox};
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < foods.length; j++) {
                worker.feed(animals[i], foods[j]);
            }
            System.out.println();
        }

        //ошибка компиляции, тк класс Fish не реализует интерфейс Voice
        //Voice[] voices = new Voice[]{fish};

        System.out.println("Просим животных подать голос\n");

        Voice[] voices = new Voice[]{durk, giraffe, rabbit, tiger, fox};
        for (int i = 0; i < voices.length; i++) {
            worker.getVoice(voices[i]);
        }

        System.out.println("\nПроверяем работу методов\n");

        for (int i = 0; i < voices.length; i++) {
            voices[i].shout();
            voices[i].silent();
        }
        System.out.println();

        Run[] runs = new Run[]{tiger, rabbit, fox, giraffe};
        for (int i = 0; i < runs.length; i++) {
            runs[i].crawl();
            runs[i].run();
            runs[i].go();
            runs[i].jump();
        }
        System.out.println();

        Fly[] flies = new Fly[2];
        flies[0] = durk;
        flies[1] = new Durk();
        for (int i = 0; i < flies.length; i++) {
            flies[i].takeOff();
            flies[i].fly();
            flies[i].landing();
        }
        System.out.println();

        Swim[] pond = new Swim[6];
        pond[0] = fish;
        pond[1] = durk;
        pond[2] = new Fish("Gold fish", 0);
        pond[3] = new Durk();
        pond[4] = new Fish();
        pond[5] = new Durk();

        for (int i = 0; i < pond.length; i++) {
            pond[i].swim();
            pond[i].dive();
            pond[i].emerge();
        }
    }
}
