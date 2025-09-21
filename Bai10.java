import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();

        // Nhập số lượng phan tu ban đau
        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = scanner.nextInt();

        // Nhập các phan tu
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            danhSach.add(scanner.nextInt());
        }

        System.out.println("\nDanh sach ban đau: " + danhSach);

        // Menu thao tác
        while (true) {
            System.out.println("\nChon thao tac:");
            System.out.println("1. Them phan tu");
            System.out.println("2. Xoa phan tu");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Thêm phan tu
                    System.out.print("Nhap phan tu can them: ");
                    int valueAdd = scanner.nextInt();
                    System.out.print("Nhap vi tri muon them (từ 0 đến " + danhSach.size() + "): ");
                    int indexAdd = scanner.nextInt();
                    if (indexAdd >= 0 && indexAdd <= danhSach.size()) {
                        danhSach.add(indexAdd, valueAdd);
                        System.out.println("Danh sach sau khi them: " + danhSach);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 2: // Xoá phan tu
                    System.out.print("Nhap vi tri muon xoa (tu 0 đen " + (danhSach.size() - 1) + "): ");
                    int indexRemove = scanner.nextInt();
                    if (indexRemove >= 0 && indexRemove < danhSach.size()) {
                        danhSach.remove(indexRemove);
                        System.out.println("Danh sach sau khi xoa: " + danhSach);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 3: // Thoát
                    System.out.println("Ket thuc chuong trinh.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}