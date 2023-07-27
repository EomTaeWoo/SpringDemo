package hello.demo.discount;

import hello.demo.member.Grade;
import hello.demo.member.Member;

public class FIxDiscountPolicy implements DiscountPolicy{

    private int discountDixAmount = 1000;   //1000원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountDixAmount;
        } else {
            return 0;
        }
    }
}
