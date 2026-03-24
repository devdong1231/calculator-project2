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
        double result = 0; // 계산 결과
        double num1, num2; // 첫 번째 입력, 두 번째 입력
        num1 = this.num1.doubleValue();
        num2 = this.num2.doubleValue();

        if (op == OperatorType.PLUS.getSymbol()) // "+"
            result = num1 + num2;
        else if (op == OperatorType.MINUS.getSymbol()) // "-"
            result = num1 - num2;
        else if (op == OperatorType.MULTIPLY.getSymbol()) // "*"
            result = num1 * num2;
        else if (op == OperatorType.DIVIDE.getSymbol()){ // "/"
            if(num2 == 0){ // 0으로 나누려고 시도할 때 0 반환
                return 0;
            }
            result = num1 / num2;
        }
        results.add(result);
        return result;
    }

    // 입력값보다 더 큰 결과가 있으면 출력하는 메서드
    public void getBiggerResults(double input){
        // stream, 람다를 활용해 input보다 큰 수를 biggerResults에 넣기
        List<Double> biggerResults = results.stream().filter(num -> num > input).toList();

        if(biggerResults.isEmpty())
            System.out.println("결과가 존재하지 않습니다.");
        else
            System.out.println(biggerResults);
    }


}
