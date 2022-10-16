package com.prac.choi.ch13;

public class Prac130201 {
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
            System.out.print(arr[i] + "\t");
        }
    }

    public static void addTwoDArr(int[][] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            addOneDArr(arr[i], add);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        addOneDArr(arr1, 1);
        System.out.println('\n');
        addTwoDArr(arr2, 1);
    }
}
