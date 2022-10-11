package Cert9;

public enum Condition {
    HOT("Very Hot"),
    WARM("How Fabry likes it"),
    COLD("cold like your heart");

    private String condition;
    private Condition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }
}
