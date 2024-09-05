package operator;

public class Operator3 {
    public static void main(String[] args) {
        //연산자 우선순위는 곱셈이 높다.
        int sum1=1+2*3;
        int sum2=(1+2)*3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}

/*
괄호 ()
단항 연산자 ++, --, !, ~, new, (type)
산술 연산자 *, /, %우선, 그 다음에 +, -
shift 연산자 <<, >>, >>>
비교 연산자 <, <=, >, >=, instanceof
등식 연산자 ==, !=
비트 연산자 &, ^, |
논리 연산자 &&, ||
삼항 연산자 ?, :
대입 연산자 =, +=, -=, *=, /=, %=
*/
