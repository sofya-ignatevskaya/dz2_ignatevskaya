package animals;

import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Durk extends Herbivore implements Run, Swim, Fly, Voice {
    public Durk(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    @Override
    public String voice() {
        return "Кря-Кря";
    }
}
