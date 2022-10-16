package com.prac.choi.ch13;

public class Prac130202 {
    public static void changeStructure(int[][] arr) {
        int[] temp = arr[arr.length - 1];   // 마지막 행의 내용을 임시로 저장!
        int i = arr.length - 2;

        while (i >= 0){ // 마지막 행을 비워두고 한 칸 씩 아래로 내림
            arr[i + 1] = arr[i];
            i -= 1;
        }

        arr[0] = temp;  // 마지막 행에 있었던 내용을 첫 번째 행으로 이동시킴
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        changeStructure(arr);

        // 배열 내용 출력부
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
