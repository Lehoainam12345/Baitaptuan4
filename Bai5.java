import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();

        boolean laNguyenTo = true;

        if (n < 2) {
            laNguyenTo = false;
        } else {
            // dùng vòng lặp để kiểm tra ước
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                    break; // dừng khi tìm thấy ước
                }
            }
        }

        if (laNguyenTo) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }
}
