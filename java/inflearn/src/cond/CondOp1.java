package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age=18;
        
        // 삼항 연산자, 조건 연산자
        String status=(age>=18)?"성인":"미성년자";
        System.out.println("age = " + age + ", status = " + status);

        int x =2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + result);
    }
}
