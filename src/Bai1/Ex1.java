package Bai1;

import java.util.Scanner;

/**
 * @author: lemanhiep
 * @date: 25/07/2023
 **/

public class Ex1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        BT1();
        BT2();
    }

    public static void BT1() {
        //    Bài 1: Cho số n nhập từ bàn phím > 0, Tính tổng từ 1 đến n.
        int n;
        long sum = 1;
        do {
            System.out.println("Nhập N : ");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum " + sum);
        sc.close();
    }

    public static void BT2() {
//        Bài 2: Nhập vào 1 số N > 0.
//        a. In ra các số lẻ < N
//        b. Tính tổng bình phương của các số lẻ đó.
        int n;
        long sum = 0;
        do {
            System.out.println("Nhập N : ");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        for (int i = 1; i <= n; i++) {
            sum += i * i;
            i++;
        }
        System.out.println("Tổng " + sum);
    }
}
