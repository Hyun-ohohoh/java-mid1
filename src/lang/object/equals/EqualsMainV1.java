package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        //Object가 기본으로 제공하는 equals는 동일성 비교임
        //동등성 비교를 사용하기 위해서는 equals 메서드 오버라이딩
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
