package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Giraffe extends Herbivore implements Run, Voice {
    public Giraffe(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public String voice() {
        return "Ааааааа";
    }
}
