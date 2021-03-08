public enum SizeAviary {
    HUGE("огромный"), BIG("большой"), MEDIUM("средний"), LITTLE("маленький");

    private String value;

    SizeAviary(String value) {
        this.value = value;
    }

    public String getvalue() {
        return this.value;
    }
}
