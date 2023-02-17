package com.hi_june.choi.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarBinarySearch {
    public static void main(String[] args) {
        List<ECar> eCars = new ArrayList<>();
        eCars.add(new ECar(3000, 55));
        eCars.add(new ECar(1800, 87));
        eCars.add(new ECar(1200, 99));

        Collections.sort(eCars);
        int idx = Collections.binarySearch(eCars, new ECar(1800, 87));
        System.out.println(eCars.get(idx));
    }
}
