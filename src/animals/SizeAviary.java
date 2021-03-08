package animals;

public enum SizeAviary {
    HUGE("огромный"), BIG("большой"), MEDIUM("средний"), LITTLE("маленький");

    private String value;

    SizeAviary(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
