package com.hi_june.choi.ch13;

class Bucket{
    private String contents;
    private int bucketNum;

    Bucket(int bucketNum, String contents) {
        this.bucketNum = bucketNum;
        this.contents = contents;
    }

    public int getBucketNum() {
        return bucketNum;
    }

    public String toString() {
        return contents;
    }
}

public class EnhancedForInst {
    public static void main(String[] args) {
        Bucket[] buckets = new Bucket[3];

        buckets[0] = new Bucket(101, "Coffee");
        buckets[1] = new Bucket(202, "Computer");
        buckets[2] = new Bucket(303, "Apple");

        // 배열에서 번호가 202인 Bucket을 찾아 그 내용물을 출력하는 반복문
        for(Bucket b : buckets){
            if(b.getBucketNum() == 202){
                System.out.println(b);
            }
        }
    }
}
