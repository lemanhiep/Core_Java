package Bai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: lemanhiep
 * @date: 25/07/2023
 **/
public class Ex5 {
    //    In ra các số hoàn hảo từ 1 đến n
    public static void main(String[] args) throws IOException {
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap n: ");
        String s = kbd.readLine();
        int b = Integer.parseInt(s);
        for (int i = 1; i < b; i++) {
            int tong = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) tong += j;
            }
            if (i == tong) {
                System.out.println(i);
            }
        }

    }
}

