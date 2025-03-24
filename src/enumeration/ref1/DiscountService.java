package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price){
//        int discountPercent = classGrade.getDiscountPercent();
//        return price * discountPercent / 100;

        //inline variable 단축키 옵션 커맨드 N
        return price * classGrade.getDiscountPercent() / 100;
    }
}
