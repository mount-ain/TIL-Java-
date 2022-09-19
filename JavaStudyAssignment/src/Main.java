public class Main {
    public static void main(String[] args) {
        // 1.
        System.out.println("1" + "가지");
        // 풀이: 문자열 간의 덧셈 연산은 문자열을 붙이는 식으로 진행된다. 따라서 결과값은 1가지 로 출력

        // 2.
        System.out.println("  A\n BC\nDEF");

        // 3.
        int a = 10; double b = 1.5; double c = 1.0; char d = '0';
        // 풀이: 각각의 대입 연산에 알맞는 자료형은 순서대로 int, double, double, char 이다.

        // 4.
        // System.out.println("가지" - "가");
        // 풀이: 문자열 간의 사칙연산은 덧셈만 허용된다. 뺄셈이나 곱셈, 나눗셈은 적용되지 않는다. 예를 들어 가지를 두번 입력하기 위해
        // "가지" * 2 와 같은 코드를 사용하는 것이 허용되지 않는다는 것이다. 따라서 결과값은 error 발생
    }
}