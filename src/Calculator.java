import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;
    private int num1, num2;
    private char op;

    Calculator(int num1, int num2, char op){
        results = new ArrayList<>();
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public int calculate(int num1, int num2, char op){
        switch(op){
            case '+': results.add(num1 + num2); break;
            case '-': results.add(num1 - num2); break;
            case '*': results.add(num1 * num2); break;
            case '/':
                if(num2 == 0)
                    return 0;
                results.add(num1 / num2); break;
            default: return 0;
        }
        return results.getLast();
    }

}
