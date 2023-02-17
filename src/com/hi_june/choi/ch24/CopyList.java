package com.hi_june.choi.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        /**
         주의!
         매개변수 dest에 전달되는 컬렉션 인스턴스의 저장 공간이 src에 전달되는 컬렉션 인스턴스의 저장공간보다 크거나 최소한 같아야 한다!
         */
        List<String> dest = new ArrayList<>();
        for (int i = 0; i < src.size(); i++) {
            dest.add("");
        }

        Collections.copy(dest,src);

        System.out.println(src);
        System.out.println(dest);
    }
}
