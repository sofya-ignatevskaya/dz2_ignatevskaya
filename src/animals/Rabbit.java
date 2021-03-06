package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Rabbit extends Herbivore implements Run, Voice {
    public Rabbit(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public String voice() {
        return "Фр-фр-фр";
    }
}
