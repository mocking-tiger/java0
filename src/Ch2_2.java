import java.util.*;

public class Ch2_2 {
    public static void main (String[] args){
        System.out.println("Hello, Java.");

        // 1바이트: boolean, byte
        // 2바이트: char, short
        // 4바이트: int, float
        // 8바이트: long, double

        final int NUM = 10;
        int num = 0;

        num = 4;
        // NUM = 1;
        // 상수는 재할당 불가능

        final int WIDTH = 20;
        final int HEIGHT = 10;

        int triangleArea = (WIDTH * HEIGHT) / 2;
        // 상수는 리터럴에 의미있는 이름'을 붙여서 코드의 이해와 수정을 쉽게 만든다

        long bigNumber = 10000000000L;
        float pi = 3.14f;
        // long, float 타입에는 접미사를 붙이는게 필수

        var x = 2;
        int y = 3;
        System.out.println(x+y);
        // JDK10부터 var를 이용한 지역변수 선언 가능
        // 단, 바로 값을 초기화 해야하며 null은 타입추론이 불가하므로 에러.

        char ch = 'J';
        String name = "Java";
        // 문자 리터럴과 문자열 리터럴은 다른 개념이다.

        // String str = "";
        // if(str){
        //     System.out.println("str은 truthy입니다.");
        // }
        // Java에서는 JS처럼 변수의 truthy/falsy를 활용해서 조건식에 사용할 수 없음
        // 반드시 boolean 값이 와야 한다.

        System.out.println(7 + "");
        System.out.println("7" + 7);
        // 이건 JS랑 똑같음

        String str = """
                JDK15부터 다중행 문자열 리터럴을
                지원한다.
          이렇게 하면             여러 줄로 이루어진 문자열
          을 편리하게 작성할 수
                            있다.
          """;
        System.out.println(str);

        char a = 'a';
        int b = 95;
        System.out.printf("a:%c, b:%d", a, b);
        // 지시자를 이용한 출력
        // %b: boolean, %d: 10진수, %o: 8진수, %x: 16진수
        // %f: 부동소수점, %e: 지수 표현식, %c: 문자, %s: 문자열

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요.");
        String input = scanner.nextLine();
        int parsedInput = Integer.parseInt(input);

        System.out.println("입력내용: " + input);
        System.out.println("변환된 값: " + parsedInput);
    }
}
