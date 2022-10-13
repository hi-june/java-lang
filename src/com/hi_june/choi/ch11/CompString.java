package com.hi_june.choi.ch11;

public class CompString {
    /**
     1. equals
     2. compareTo
     3. compareToIgnoreCase
     */

    public static void main(String[] args) {
        String st1 = "Lexicographically";
        String st2 = "lexicographically";
        int cmp1, cmp2;

        if(st1.equals(st2)) // 두 인스턴스가 지니는 문자열이 같이면 true, 다르면 false를 반환함
            System.out.println("두 문자열은 같음");
        else
            System.out.println("두 문자열은 다름");


        /*
        두 문자열의 내용이 일치하면 0
        호출된 인스턴스의 문자열(st1)이 인자로 전달된 문자열(st2)보다 앞서면 0보다 작은 값 반환
        호출된 인스턴스의 문자열(st1)이 인자로 전달된 문자열(st2)보다 뒤서면 0보다 큰 값 반환
         */
        cmp1 = st1.compareTo(st2);   // 두 문자열의 사전 편찬 상 순서를 비교함.

        if(cmp1 == 0)
            System.out.println("두 문자열은 일치합니다.");
        else if (cmp1 < 0)
            System.out.println("사전의 앞에 위치하는 문자: " + st1);
        else
            System.out.println("사전의 앞에 위치하는 문자: " + st2);


        /*
        사전 편찬 순서상 대문자는 소문자보다 앞에 위치한다.
        하지만 compareToIgnoreCase는 이름 그대로, 문자열 비교에 있어서 대소문자 구분을 하지 않는다.
        그 외에 부분에 대해서는 compareTo와 동일하다.
         */
        cmp2 = st1.compareToIgnoreCase(st2);

        if(cmp2 == 0)
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");
    }
}
