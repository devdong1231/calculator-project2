import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;
    private int num1, num2;
    private char op;

    Calculator(){
        results = new ArrayList<>();
        this.num1 = 0;
        this.num2 = 0;
        this.op = '0';
    }

    Calculator(int num1, int num2, char op){
        results = new ArrayList<>();
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public int calculate(){
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

    public void setOp(char op){
        this.op = op;
    }

    public char getOp(){
        return op;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum1(){
        return num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum2(){
        return num2;
    }

    public int getLastResult(){
        return results.getLast();
    }


}
