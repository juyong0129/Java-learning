package Third;

public class operator {
    public static void main(String[] args) {
        //연산자

        //대입 연산자(=)
        int a = 1;
        int b = 2;

        //부호 연산자(+/-)
        System.out.println(+a);
        System.out.println(-a);

        //산술 연산자(+,-,*,/,%)
        int sum = a + b;
        int min = b - a;
        int mul = a * b;
        int div = b / a;
        int mod = b % a;
        System.out.println(sum);
        System.out.println(min);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        //증가/감소 연산자(++n/n++/--n/n--)
        a++;
        System.out.println(a);
        b--;
        System.out.println(b);

        //관계 연산자
        int age = 13;
        boolean value = (age > 20);
        System.out.println(value);

        //논리 연산자(&&/||/!)
        a = 10;
        b = 123;
        boolean flag = (a > 0) && (b > 0);
        System.out.println(flag);
        flag = (a > 0) && (b < 0);
        System.out.println(flag);
        flag = (a > 0) || (b < 0);
        System.out.println(flag);

        //복합 대입 연산자(+=. -=, *=, /=, %=, <<=, >>=, >>>=, &=, |=, ^=)

        //조건 연산자(조건식 ? 결과1 : 결과2)
        char ch = (age > 20) ? 'T' : 'F'; // F
        System.out.println(ch);

        //비트 연산자(&, |, ^, ~, <<, >>, >>>)
        // & : 두 비트가 모두 1일때만 결과가 1 (AND)
        a = 8; //              1 0 0 0
        b = 12; //             1 1 0 0
        int result = a & b; // 1 0 0 0 -> 8
        System.out.println(result);
        // | : 두 비트 중 하나만 1이여도 결과가 1 (OR)
        a = 8; //          1 0 0 0
        b = 12; //         1 1 0 0
        result = a | b; // 1 1 0 0 -> 12
        System.out.println(result);
        // ^ : 두 비트가 같은 값이면 0, 다른 값이면 1 (XOR)
        a = 8; //          1 0 0 0
        b = 12; //         1 1 0 0
        result = a ^ b; // 0 1 0 0 -> 4
        System.out.println(result);
        // ~ : 0 -> 1, 1 -> 0 (NOT)
        a = 8; // 1 0 0 0
        System.out.println(~a); // 1 0 0 1 -> -9 (보수 규칙)
        // << : 왼쪽으로 2비트 이동 (2^n 배)
        a = 8; // 1 0 0 0
        result = a << 2;
        System.out.println(result); // 1 0 0 0 << 2 이므로 1 0 0 0 (0 0) 따라서 32
        // >> : 오른쪽으로 2비트 이동 (2^n 배)
        a = 8; // 1 0 0 0
        result = a >> 2;
        System.out.println(result); // 1 0 0 0 >> 2 이므로 1 0 따라서 2
        // <<< : 왼쪽으로 2비트 이동(무조건 0 추가(보수규칙 x)) (2^n 배)
        a = 8; // 1 0 0 0
        result = a << 2;
        System.out.println(result); // 1 0 0 0 << 2 이므로 1 0 0 0 (0 0) 따라서 32
    }
}
