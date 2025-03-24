package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        String parts[] = fruits.split(",");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        String joinedString = String.join("->", parts);
        System.out.println("joinedString = " + joinedString);
        
    }
}
