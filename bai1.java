import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        a = sc.nextInt();
        System.out.println("Nhập vào số b");
        b = sc.nextInt();
        int tong, tich, hieu, thuong;
        tong = a+ b;
        tich = a * b;
        hieu = a - b;
        thuong = a/ b;
        System.out.println("Tổng của hai số " +tong);
        System.out.println("Hiệu của hai số " +hieu);
        System.out.println("Tích của hai số" +tich);
        System.out.println("Thương của hai số" +thuong);
        if(a>b)
            System.out.println("A lớn hơn B");
        else
            System.out.println("B lớn hơn A");
    }
}
