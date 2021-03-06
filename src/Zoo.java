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


        worker.getVoice(tiger);


    }
}
