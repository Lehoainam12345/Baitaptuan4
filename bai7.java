public class bai7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int tong = 0;

        for (int x : arr) {
            tong += x;
        }

        System.out.println("Tong cac phan tu trong mang la: " + tong);
    }
}
