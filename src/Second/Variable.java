package Second;

public class Variable {
    public static void main(String[] args) {
        //자료형

        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = '\uD55C'; //use unicode
        int a = 65;
        int b = -65;
        float pi = 3.14F;
        double pi2 = 3.14;
        boolean bool = true;
        var hello = "hello";
        final int MAX = 100;
        byte test = 10;
        int itest = test; //묵시적 형 변환

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(a);
        System.out.println((char)a); //명시적 형 변환
        System.out.println(b);
        System.out.println((char)b);
        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(bool);
        System.out.println(hello);
        System.out.println(MAX);
        System.out.println(test);
        System.out.println(itest);
    }
}
