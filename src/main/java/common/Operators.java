package common;

public enum Operators {
    ADDITION("+"),
    MINUS("-"),
    MULTIPLICATION("*");

    private final String operator;

    Operators(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
