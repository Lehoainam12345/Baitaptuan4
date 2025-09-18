import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        int x = a, y = b;

        // Thuật toán Euclid để tìm UCLN
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        int UCLN = x;
        int BCNN = (a * b) / UCLN;

        System.out.println("UCLN của " + a + " và " + b + " = " + UCLN);
        System.out.println("BCNN của " + a + " và " + b + " = " + BCNN);
    }
}
