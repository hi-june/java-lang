package com.hi_june.choi.ch23;

import java.util.*;
import java.util.stream.Collectors;

public class SetCollectionFeature {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,1,1,1};

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());


//        set.add("Toy");
//        set.add("Box");
//        set.add("Robot");
//        set.add("Box");
//
//        for (Iterator<String> itr = set.iterator(); itr.hasNext(); ) {
//            System.out.println(itr.next());
//        }
    }
}
