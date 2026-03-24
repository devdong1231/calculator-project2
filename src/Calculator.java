import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {
    protected List<Double> results; // 결과
    protected T num1, num2; // 첫 번째 수, 두 번째 수
    protected char op; // 연산자

    Calculator(){
        results = new ArrayList<>();
    }

    Calculator(T num1, T num2, char op){
        results = new ArrayList<>();
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public double calculate(){
        switch(op){
            case '+': results.add(num1.doubleValue() + num2.doubleValue()); break;
            case '-': results.add(num1.doubleValue() - num2.doubleValue()); break;
            case '*': results.add(num1.doubleValue() * num2.doubleValue()); break;
            case '/':
                if(num2.doubleValue() == 0)
                    return 0;
                results.add(num1.doubleValue() / num2.doubleValue()); break;
            default: return 0;
        }
        return results.getLast();
    }

    public void setOp(char op){
        this.op = op;
    }

    public char getOp(){
        return op;
    }

    public void setNum1(T num1){
        this.num1 = num1;
    }

    public T getNum1(){
        return num1;
    }

    public void setNum2(T num2){
        this.num2 = num2;
    }

    public T getNum2(){
        return num2;
    }

    public double getLastResult(){
        return results.getLast();
    }

    public void removeResult(){
        results.removeFirst();
    }


}
