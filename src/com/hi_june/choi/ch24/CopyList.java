package com.hi_june.choi.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        // 복사본을 만든다.
        List<String> dest = new ArrayList<>();
        dest.add("");dest.add("");dest.add("");dest.add("");dest.add("");
        Collections.copy(dest,src);

        System.out.println(src);
        System.out.println(dest);
    }
}
