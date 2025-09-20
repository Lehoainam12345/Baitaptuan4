import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhap x=");
        double x=sc.nextDouble();
        System.out.println("Nhap y=");
        double y=sc.nextDouble();
        System.out.print("Chon phep toan (+, -, *, /): ");
        char pheptoan = sc.next().charAt(0);
        switch(pheptoan){
            case '+':
            double ketqua = x + y;
            System.out.println("Ket qua = "+ketqua);
            break;
            case '-':
            ketqua = x - y;
            System.out.println("Ket qua = "+ketqua);
            break;
            case '/':
            ketqua = x / y;
            System.out.println("Ket qua = "+ketqua);
            break;
            case '*':
            ketqua = x * y;
            System.out.println("Ket qua = "+ketqua);
            break;

        }



    }
}
