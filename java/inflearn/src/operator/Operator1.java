package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum=a+b;
        System.out.println("a + b = " + sum);

        int diff=a-b;
        System.out.println("a - b = " + diff);

        int multi=a*b;
        System.out.println("a * b = " + multi);

        int div=a/b;
        System.out.println("a / b = " + div); // 소수점이 제거된다.

        int mod=a%b;
        System.out.println("a % b = " + mod);
    }
}
