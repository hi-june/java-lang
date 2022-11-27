package com.hi_june.choi.ch20;

import java.math.BigInteger;

public class SoBigInteger {
    public static void main(String[] args) {
        // long형으로 표현 가능한 값의 크기 출력
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // 매우 큰 수를 BigInteger 인스턴스로 표현
        BigInteger bigInteger = new BigInteger("10000000000000000000000000");
    }
}
