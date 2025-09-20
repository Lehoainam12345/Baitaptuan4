import java.util.Scanner;

public class Bai1 {

    //Hàm kiểm tra
    public static void KT(int x)
    {
        if (x>0)
            System.out.println("La so duong ");
        else
            if (x<0)
                System.out.println("la so am");
            else
                System.out.println("bang khong");         
        }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhap vao mot so");
        int x=sc.nextInt();
        KT(x);
    }
}
