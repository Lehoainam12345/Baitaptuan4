import java.util.Scanner;

public class Bai2 {

    //Hàm tìm số nhỏ nhất trong 3 số
    public static float TIM (float x, float y, float z){
        float min=x;
        if (min > y)
            min=y;
        if (min > z)
                min = z;
    return min;
    }
    public static void main(String[] args)  
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhap x=");
        float x=sc.nextFloat();
        System.out.println("Nhap y=");
        float y=sc.nextFloat();
        System.out.println("Nhap z=");
        float z=sc.nextFloat();
        System.out.println("So nho nhat trong 3 so = "+ TIM(x,y,z));

    }
}
