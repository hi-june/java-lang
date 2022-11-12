package com.hi_june.choi.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/june/Study/java-lang");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file); // IOException 발생 가능
            writer.write('A');
            writer.write('Z');
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // 예외가 발생하든 안 하든 무조건 실행해야 하는 구문
            try {
                if (writer != null) {
                    writer.close(); // 파일을 열었으면 닫아주어야 함
                }
            } catch (IOException e) {   // close 하는 중에도 IOException 발생 가능하기 때문
                e.printStackTrace();
            }
        }
    }
}
