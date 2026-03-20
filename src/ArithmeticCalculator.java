import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> extends Calculator<T>{

    ArithmeticCalculator(){
        super();
    }

    ArithmeticCalculator(T num1 ,T num2, char op){
        super(num1, num2 ,op);
    }

    @Override
    public double calculate() {
        double result = 0;
        double num1, num2;
        num1 = this.num1.doubleValue();
        num2 = this.num2.doubleValue();

        if (op == OperatorType.PLUS.getSymbol())
            result = num1 + num2;
        else if (op == OperatorType.MINUS.getSymbol())
            result = num1 - num2;
        else if (op == OperatorType.MULTIPLY.getSymbol())
            result = num1 * num2;
        else if (op == OperatorType.DIVIDE.getSymbol()){
            if(num2 == 0){
                return 0;
            }
            result = num1 / num2;
        }
        results.add(result);
        return result;
    }


}
