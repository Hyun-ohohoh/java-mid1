package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); //내부클래스는 바깥 클래스 인스턴스를 만들어야 생성 가능
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerclass = " + inner.getClass());
    }
}
