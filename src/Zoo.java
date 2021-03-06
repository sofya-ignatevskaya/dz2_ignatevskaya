import animals.*;
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
        worker.feed(durk, meatForFish);
        worker.feed(durk, wheat);
        worker.feed(durk, carrot);
        System.out.println();

        worker.feed(giraffe, meatForFox);
        worker.feed(giraffe, leaves);
        worker.feed(giraffe, carrot);
        System.out.println();

        worker.feed(rabbit, meatForTiger);
        worker.feed(rabbit, carrot);
        worker.feed(rabbit, wheat);
        System.out.println();

        worker.feed(tiger, leaves);
        worker.feed(tiger, meatForTiger);
        worker.feed(tiger, meatForFox);
        System.out.println();

        worker.feed(fox, wheat);
        worker.feed(fox, meatForFox);
        worker.feed(fox, meatForFish);
        System.out.println();

        worker.feed(fish, carrot);
        worker.feed(fish, meatForFish);
        worker.feed(fish, meatForTiger);
        System.out.println();

        worker.getVoice(tiger);
        worker.getVoice(rabbit);
        worker.getVoice(giraffe);
        worker.getVoice(durk);
        worker.getVoice(fox);

        /*ошибка компиляции, тк класс Fish не реализует интерфейс Voice, у него нет метода voice()*/
        //worker.getVoice(fish);
    }
}
