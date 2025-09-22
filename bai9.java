import java.util.ArrayList;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println("Danh sách các số nguyên vừa nhập là: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
