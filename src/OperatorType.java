public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    // 자동 생성
    OperatorType(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol(){
        return symbol;
    }
}
