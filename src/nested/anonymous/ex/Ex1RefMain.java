package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public static void hello(Code code) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        code.dice();
        code.sum();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }


    public static class Code {

        public void dice() {
            int randomvalue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomvalue);
        }

        public void sum() {
            for (int i = 0; i < 3; i++){
                System.out.println("i = " + i);
            }
        }
    }


    public static void main(String[] args) {
        Code code = new Code();
        hello(code);
        hello(code);
    }


}
