package Bai1;

import java.util.Scanner;

/**
 * @author: lemanhiep
 * @date: 25/07/2023
 **/
public class Ex4 {
    //    Kiểm tra 1 số hoàn hảo (là số có tổng các ước nhỏ hơn nó, bằng chính nó) (Ex: 6 = 1+2+3).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai báo biến a là số cần kiểm tra, sum là tổng các ước số của a
        int sum = 0, a;
        System.out.println("Nhập vào số cần kiểm tra: ");
        a = sc.nextInt();
        //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0)
                //tổng các ước số của a
                sum += i;
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if (sum == a) {
            System.out.println(a + " là số hoàn hảo");
        }
        //ngược lại không phải là số hoàn hảo
        else {
            System.out.println(a + " không phải là số hoàn hảo");
        }
    }
}
