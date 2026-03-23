import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();

        while (true) {
            // ---------- 메뉴 구현 ----------
            System.out.println("1. 계산하기\n2. 조회하기\n계산기를 종료하시려면 \"exit\"를 입력해주세요");
            System.out.print("원하시는 메뉴를 선택해주세요 : ");
            String choice = sc.next();
            // ------------------------------


            // 1. ---------- 계산하기 ----------
            if (choice.equals("1")) {
                // input1 입력
                while (true) {
                    System.out.print("첫 번째 정수를 입력해주세요: ");
                    String input1 = sc.next();
                    try { // 숫자가 아닐 경우 예외 처리
                        // 실수/정수 판별하기
                        if (input1.contains(".")) {
                            calculator.setNum1(Double.parseDouble(input1));
                        } else {
                            calculator.setNum1(Integer.parseInt(input1));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력해주세요.");
                        continue;
                    }
                    break;
                }


                // input2 입력
                while (true) {
                    System.out.print("두 번째 정수를 입력해주세요: ");
                    String input2 = sc.next();
                    try { // 숫자가 아닐 경우 예외 처리
                        // 실수/정수 판별하기
                        if (input2.contains("."))
                            calculator.setNum2(Double.parseDouble(input2));
                        else
                            calculator.setNum2(Integer.parseInt(input2));
                    } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력해주세요.");
                        continue;
                    }
                    break;
                }


                // 사칙연산 기호 입력
                while (true) {
                    System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
                    char op = sc.next().charAt(0);
                    try { // 사칙 연산 기호가 아닐 경우 예외 발생
                        if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                            throw new InputMismatchException("사칙연산 기호를 입력해주세요");
                        }
                        calculator.setOp(op);
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                }

                // 최종 결과 계산
                calculator.calculate();
                System.out.println(calculator.getNum1() + " " + calculator.getOp() + " " + calculator.getNum2() + " = " + calculator.getLastResult());
            }
            // -------------------------------

            // 2. ---------- 조회하기 ----------
            else if (choice.equals("2")) {
                while (true) {
                    try {
                        System.out.print("입력하신 값보다 큰 결과를 출력합니다. 값을 입력해주세요 :");
                        calculator.getBiggerResults(sc.nextDouble());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("숫자를 입력해주세요.");
                    }
                }

            }
            // --------------------------------

            else if(choice.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 4. ---------- 메뉴 입력 예외 처리 ----------
            else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
            // --------------------------------

        }
        sc.close();
    }
}
