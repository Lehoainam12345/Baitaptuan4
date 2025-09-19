import java.util.HashMap;
import java.util.Map;

public class bai8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 2, 5, 3, 3};

        Map<Integer, Integer> dem = new HashMap<>();
        for (int x : arr) {
            dem.put(x, dem.getOrDefault(x, 0) + 1);
        }

        int phanTu = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : dem.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                phanTu = entry.getKey();
            }
        }

        System.out.println("phan tu xuat hien nhieu nhat la: " + phanTu +
                           " voi so lan: " + maxCount);
    }
}
