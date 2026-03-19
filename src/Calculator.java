import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            // 양의 정수 입력
            System.out.print("첫 번째 정수를 입력해주세요.");
            int num1 = sc.nextInt();
            System.out.print("두 번째 정수를 입력해주세요.");
            int num2 = sc.nextInt();

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            // 최종 결과 계산
            int result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) // 0으로 나누기 오류 처리
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
            }
            System.out.println("결과 :" + result);

            // exit을 입력받으면 종료, 아니라면 다시 num1 입력
            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit"))
                break;
        }
        sc.close();
    }
}
