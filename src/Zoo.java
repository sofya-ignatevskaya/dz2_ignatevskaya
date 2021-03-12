import MyException.WrongFoodException;
import animals.*;
import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import food.*;

import java.io.FileInputStream;

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
                try {
                    worker.feed(animals[i], foods[j]);
                } catch (WrongFoodException e) {
                    e.printStackTrace();
                }
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

        System.out.println("\nПроверяем как работает вольер\n");
        Rabbit r = new Rabbit("Alex", SizeAviary.MEDIUM);
        Tiger t = new Tiger("Leo", SizeAviary.HUGE);
        Durk d = new Durk("Zina", SizeAviary.LITTLE);
        Giraffe g = new Giraffe("Olaf", SizeAviary.MEDIUM);
        Fox fx = new Fox("Linda", SizeAviary.BIG);
        Fish fh = new Fish("Jon", SizeAviary.BIG);
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(SizeAviary.MEDIUM);
        herbivoreAviary.add(r.getName(), r);
        //ошибка компиляции, тигр не травоядное животное
        //herbivoreAviary.add(tiger.getName(), tiger);

        //размер вольера не совпадает, об этом будет сказано в сообщении в консоли
        herbivoreAviary.add(d.getName(), d);
        herbivoreAviary.add(g.getName(), g);
        System.out.println(herbivoreAviary.toString());
        herbivoreAviary.get("Olaf");
        herbivoreAviary.remove("Olaf");
        System.out.println(herbivoreAviary.toString() + "\n");

        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(SizeAviary.BIG);
        carnivorousAviary.add(t.getName(), t);
        carnivorousAviary.add(fh.getName(), fh);
        carnivorousAviary.add(fx.getName(), fx);
        //ошибка компиляции, кролик не хищное животное
        //carnivorousAviary.add(r.getName(),r);
        System.out.println(carnivorousAviary.toString() + "\n");


        Aviary<Food> aviary = new Aviary(SizeAviary.BIG);
        aviary.add("1", carrot);
        aviary.add("2", wheat);
    }
}
