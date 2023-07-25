package Bai1;
import java.util.Scanner;
/**
 * @author: lemanhiep
 * @date: 25/07/2023
 **/
public class Ex2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số a = ");
        int a = sc.nextInt();
        System.out.print("Nhập số  b = ");
        int b = sc.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }
    public static int USCLN(int a, int b) {
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int uscln = temp1;
        return uscln;
    }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
