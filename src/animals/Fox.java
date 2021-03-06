package animals;

import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Fox extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String voice() {
        return null;
    }
}
