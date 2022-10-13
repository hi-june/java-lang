package com.hi_june.choi.ch11;

public class ReturnStringBuilder {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("123");
        StringBuilder stb2 = stb1.append(45678);

        System.out.println(stb1);
        System.out.println(stb2);


        // 인덱스 0~4까지의 문자 삭제
        stb2.delete(0, 5);

        System.out.println(stb1);
        System.out.println(stb2);

        // 참조 값의 비교
        if(stb1 == stb2)
            System.out.println("same instance");
        else
            System.out.println("diff instance");
    }
}
