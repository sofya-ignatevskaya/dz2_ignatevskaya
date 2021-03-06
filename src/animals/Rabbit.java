package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Rabbit extends Herbivore implements Run, Voice {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return null;
    }
}
