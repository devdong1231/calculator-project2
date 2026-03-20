import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        while (true) {
            // 양의 정수 입력
            System.out.print("첫 번째 정수를 입력해주세요: ");
            calculator.setNum1(sc.nextInt());
            System.out.print("두 번째 정수를 입력해주세요: ");
            calculator.setNum2(sc.nextInt());

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
