public class Main {
    public static void main(String[] args) {
        // 1주차
        // 1.
        //System.out.println("1" + "가지");
        // 풀이: 문자열 간의 덧셈 연산은 문자열을 붙이는 식으로 진행됩니다. 따라서 결과값은 1가지 로 출력

        // 2.
        //System.out.println("  A\n BC\nDEF");

        // 3.
        // int a = 10; double b = 1.5; double c = 1.0; char d = '0';
        // 풀이: 각각의 대입 연산에 알맞는 자료형은 순서대로 int, double, double, char 입니다.

        // 4.
        // System.out.println("가지" - "가");
        // 풀이: 문자열 간의 사칙연산은 덧셈만 허용됩니다. 뺄셈이나 곱셈, 나눗셈은 적용되지 않습니다. 예를 들어 가지를 두번 입력하기 위해
        // "가지" * 2 와 같은 코드를 사용하는 것이 허용되지 않는다는 것입니다. 따라서 결과값은 error 발생

        // 2주차
        // 1.
        // int a = 0;
        // int b = 1 int c = 3;
        // double f = 1.0; double g = 1.1;
        // 풀이: 2번째 줄 Int b = 1 int c = 3; 에서 세미콜론이 빠졌습니다. 세미콜론은 문장의 끝에 넣어주는 것이며, 한 가지 행동을
        // 마칠 때마다 넣어준다고 생각하시면 편합니다. 2번째 줄에서 b라는 변수에 값 1을 넣는 행동을 마쳤으므로 세미콜론을 넣고, 그 다음에
        // c에 값 3을 넣어줍니다.

        // 2.
        // ( ) a = 2000000;
        // 풀이: 할당되는 값이 2,000,000 (2백만) 이므로 우선 데이터 타입은 정수형으로 고정됩니다. 또한, 정수형
        // byte, short, int, long 중에서 에러가 발생하지 않게 하기 위해 사용할 수 있는 데이터 타입은 int와 long입니다.

        // 3주차
        // 1.
        // float a = 10F;
        // System.out.println(a);
        // 풀이: 10F는 10이라는 정수를 기본형 int가 아닌 float형으로 변환함을 의미합니다. 정수 10을 실수형으로 저장하기 때문에
        // 단순 10이 아닌 float타입 10.0으로 저장이 되고, 따라서 a를 출력하면 10.0이 나옵니다. 2번 보기 10F의 경우,
        // 10을 float타입 10.0으로 변환하기 위해 사용하는 코드이지, 10F 자체로 출력되지는 않습니다.

        // 2.
        // ( ) a = 100F;
        // 풀이: 2.	위 문제와 마찬가지로, 100F는 단순 정수 100이 아닌 float 타입 100.0으로 바뀌어 변수 a 에 할당이 됩니다.
        // 따라서, a의 데이터 타입에는 float이 지정될 수 있습니다. 또한, 실수형 데이터 타입 중 double은 float보다 값을 더 많이
        // 저장할 수 있는 타입이기 때문에 double 데이터 타입도 지정이 가능합니다.

        // 3.
        // float a = 100F;
        // long b = 100L;
        // double c = a + b;
        // System.out.println(c);
        // 풀이: 3.	A와 b는 각각 float, double 타입입니다. 실수형 데이터를 정수형 데이터로 변환할 경우, 소수점 이하 데이터가 버려지면서
        // 데이터의 값이 변질되기 때문에, 컴퓨터는 정수형 데이터를 실수형 데이터로 형변환을 실행합니다.
        // 즉, 정수형 데이터 타입인 b의 값이 실수형 데이터 타입 a에 맞춰져서 결과값은 float 타입으로 산출됩니다.
        // 최종적으로는 double 타입 c에 값이 할당되므로, double 타입의 200.0이 출력됩니다.

        // 4.
        // float a = 100F;
        // long b = 100L;
        // double c = a + b;
        // System.out.println(c);
        // 풀이: A에 할당되는 값은 10F 즉 float 타입의 10.0 이며 a에 지정할 수 있는 데이터 타입은 float 과 double로 좁혀집니다.
        // 그러나, a의 데이터 타입을 double로 지정할 경우, 아래 코드 float b = a; 에서 에러가 발생합니다.
        // 왜냐하면, a는 최종적으로 double 타입이나, b라는 변수는 float 타입이고, 할당되는 값인 a의 타입이 값이 들어갈 공간인 b의 타입보다
        // 범위가 크기 때문입니다. 따라서, 최종적으로 a에 지정할 수 있는 데이터 타입은 float입니다.

        // 4주차
        // 1.
        // System.out.println((1+3) % 2);
        // 풀이: Java의 연산은 수 연산법칙과 비슷합니다. 괄호 안의 연산 (1+3)을 우선으로 진행하고, %2(2로 나눴을 때 나머지 값) 연산을
        // 진행합니다. 따라서, 결과값은 0이 됩니다.

        // 2.
        // System.out.println(1 == '1');
        // System.out.println(10.0 == 10F);
        // 풀이: 문자 1과 숫자 1은 서로 다른 값을 가리킵니다. 따라서 첫 번째 줄의 결과값은 false 입니다. 또한, 10F는 10을 실수의 형태로
        // 변환함을 의미하고 이는 10.0에 해당합니다. 따라서 두 번째 줄의 결과값은 true입니다.

        // 5주차
        // 1.
        // if (1 != 1) {
        //	System.out.println("AB");
        // }
        // System.out.println("CD");
        // 풀이: 1 != 1 을 풀이하면 ‘1은 1과 같지 않다.’ 를 의미합니다. 서로 같은 숫자 1이므로, false가 산출됩니다. if문의 조건에
        // false가 들어가있으므로, if문 안의 코드는 실행되지 않습니다. 따라서, if문 바깥의 코드만 실행되므로 결과값은 CD가 됩니다.

        // 2.
        // int a = 2;
        // switch(a) {
        //	case 1: System.out.println("1은 a보다 크거나 같음");
        //	case 2: System.out.println("2는 a보다 크거나 같음");
        //	case 3: System.out.println("3은 a보다 크거나 같음");
        // }
        // 풀이: case문에 break가 적용되지 않았기 때문에, case 2의 코드부터 아래 코드가 모두 실행됩니다. 따라서 결과값은
        // 2는 a보다 크거나 같음
        // 3은 a보다 크거나 같음 와 같이 출력됩니다.

        // 3.
        // 1. 민수네 집 근처에는 4일장(매 4의 배수인 날마다 장날)이 있습니다. 민수는 오늘 날짜(today)를 입력하면, 오늘이 장날인지
        // 아닌지를 출력해주는 코드를 작성하려고 합니다. today 변수에 일자를 입력했을 때 해당 날짜가 장날이면 ‘장날!’ 그렇지 않으면
        // ‘장날 아님!’이 출력되도록 코드를 완성하세요.
        // 풀이:
        // int today = 0;
        // if ((today%4) == 0) {
        // System.out.println("장날!");
        // } else {
        // System.out.println("장날 아님!");
        // }

        // 4.
        // 민수는 현재 가지고 있는 용돈을 바탕으로 민수가 만들 수 있는 저녁메뉴를 출력해주는 코드를 작성하려고 합니다. budget 변수에 민수가
        // 가진 용돈을 입력했을 때, 아래 메뉴 정보에 따라 민수가 가진 용돈으로 만들 수 있는 메뉴가 모두 출력되도록 코드를 완성하세요.
        // 풀이:
        // int budget = 0;
        // int a = 3000, b = 5000, c = 8000;
        // if (budget < a) System.out.println("만들 수 있는 메뉴가 없음");
        // else if (budget >= a && budget < b) System.out.println("김치찌개");
        // else if (budget >= b && budget < c) System.out.println("김치찌개, 닭볶음탕");
        // else System.out.println("김치찌개, 닭볶음탕, 갈비찜");

        // 6주차
        // 1.
        // String a = "Hello";
        // String b = new String("Hello");
        // System.out.println(a == b);
        // System.out.println(a.equals(b));
        // 풀이: A의 Hello 와 b의 Hello 는 생성 방식이 달라 서로 다른 곳에 저장이 됩니다. 비교연산자 == 의 경우, 저장된 공간이
        // 일치하는 지를 묻기 때문에, 첫 번째로 출력되는 결과값은 false 입니다. Equals()의 경우, 변수에 할당된 값 그 자체를 비교하기
        // 때문에 두 번째로 출력되는 결과값은 true 입니다.

        // 2.
        // int count = 0;
        // for (int a=0;a<=3;) {
        //	if (a%2 == 0) count++;
        // }
        // System.out.println(count);
        // 풀이: Count는 a가 짝수일 때 마다 1씩 증가합니다. 다만, java의 for문은 증감식이 실행되기 전에 for문 내부의 코드를 한 번
        // 실행합니다. 따라서, a가 처음 0일 때도 내부 코드가 실행되어 최종 count는 2로 출력됩니다.

        // 3.
        // numbers라는 이름의 배열에 여러 개의 숫자를 넣으면, 해당 배열에 홀수가 몇 개 들어가있는지 카운트하여 이를 결과값으로 출력한다.
        // 풀이:
        // int count = 0;
        // int[] numbers = new int[3];
        // numbers[0] = 2; numbers[1] = 5; numbers[2] = 7;
        // for (int i=0;i<numbers.length;i++) {
        // if ((numbers[i]%2) != 0) count++;
        // }
        // System.out.println(count);

        // 4.
        // 풀이:
        // String star = "*";
        //
        // for (int i=0;i<3;i++) {
        //    for (int j=0;j<=i;j++) System.out.printf(star);
        //    System.out.println();
        // }
    }
}