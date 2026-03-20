import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();

        while (true) {
            // input1 입력
            System.out.print("첫 번째 정수를 입력해주세요: ");
            String input1 = sc.next();
            // 실수/정수 판별하기
            if (input1.contains("."))
                calculator.setNum1(Double.parseDouble(input1));
            else
                calculator.setNum1(Integer.parseInt(input1));

            // input2 입력
            System.out.print("두 번째 정수를 입력해주세요: ");
            String input2 = sc.next();
            // 실수/정수 판별하기
            if (input2.contains("."))
                calculator.setNum2(Double.parseDouble(input2));
            else
                calculator.setNum2(Integer.parseInt(input2));

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            calculator.setOp(sc.next().charAt(0));

            // 최종 결과 계산
            calculator.calculate();
            System.out.println(calculator.getNum1() + " " + calculator.getOp() + " " + calculator.getNum2() + " = " + calculator.getLastResult());

            // exit을 입력받으면 종료, 아니라면 다시 num1 입력
            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
            String exit = sc.next();
            calculator.removeResult();
            if (exit.equals("exit"))
                break;
        }
        sc.close();
    }
}
