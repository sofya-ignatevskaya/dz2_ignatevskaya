import animals.Tiger;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Oleg", 100);
        Worker worker = new Worker();
        worker.getVoice(tiger);

    }
}
