import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int tong = 0;

        // dùng vòng lặp for
        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tổng từ 1 đến " + n + " = " + tong);
    }
}
