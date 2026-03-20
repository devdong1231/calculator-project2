import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    ArithmeticCalculator(){
        super(0, 0, '0');
    }

    ArithmeticCalculator(int num1 ,int num2, char op){
        super(num1, num2 ,op);
    }

    @Override
    public int calculate() {
        if (op == OperatorType.PLUS.getSymbol())
            results.add(num1 + num2);
        else if (op == OperatorType.MINUS.getSymbol())
            results.add(num1 - num2);
        else if (op == OperatorType.MULTIPLY.getSymbol())
            results.add(num1 * num2);
        else if (op == OperatorType.DIVIDE.getSymbol()){
            if(num2 == 0){
                return 0;
            }
            results.add(num1 / num2);
        }
        return results.getLast();
    }


}
