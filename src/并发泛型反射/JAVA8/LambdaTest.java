package 并发泛型反射.JAVA8;



/**
 * @ClassName LambdaTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/26 18:26
 */
public class LambdaTest {

    public static void main(String[] args) {
        LambdaTest tester = new LambdaTest();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (int a , int b) -> {return a*b;};

        MathOperation division =  (int a, int b) -> a/b;
        System.out.println("10+5="+tester.operate(10,5,addition));
        System.out.println("10-5="+tester.operate(10,5,subtraction));
        System.out.println("10*5="+tester.operate(10,5,multiplication));
        System.out.println("10/5="+tester.operate(10,5,division));
        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google Facebook");
    }


    interface MathOperation {
        int operation(int a, int b);
    }
    interface GreetingService {
        void sayMessage(String message);
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}