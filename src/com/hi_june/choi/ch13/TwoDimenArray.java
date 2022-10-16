package com.hi_june.choi.ch13;

public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] ar = new int[3][4];
        int num = 1;

        // 배열에 값을 저장 및 참조
        for (int i = 0; i < ar.length; i++) {   // 행의 수: 3
            for (int j = 0; j < ar[i].length; j++) {   // 열의 수: 4
                ar[i][j] = num;
                num++;
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
