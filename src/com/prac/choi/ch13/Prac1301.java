package com.prac.choi.ch13;

class MinMaxSet{
    public static int minValue(int[] arr){  // 최솟값 반환
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }

        return min;
    }

    public static int maxValue(int[] arr){  // 최댓값 반환
        int max = arr[0];

        for(int v : arr){
            if(max < v)
                max = v;
        }

        return max;
    }
}

public class Prac1301 {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};

        System.out.println("min: " + MinMaxSet.minValue(test));
        System.out.println("max: " + MinMaxSet.maxValue(test));
    }
}
