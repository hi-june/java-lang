package com.hi_june.choi.ch11;

public class BuildString {
    public static void main(String[] args) {
        StringBuilder stbuf = new StringBuilder("123");

        stbuf.append(45678);    // 문자열 추가
        System.out.println(stbuf);

        stbuf.delete(0, 2); // 문자열 일부 삭제
        System.out.println(stbuf);

        stbuf.replace(0, 3, "AB");  // 문자열 일부 교체
        System.out.println(stbuf);

        stbuf.reverse();    // 문자열 내용 뒤집기
        System.out.println(stbuf);

        String sub = stbuf.substring(2, 4); // 일부만 문자열로 반환
        System.out.println(sub);
    }
}
