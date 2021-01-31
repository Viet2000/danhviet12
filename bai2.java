import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        a = sc.nextInt();
        System.out.println("Nhập vào số b");
        b = sc.nextInt();
        if(a%2==0)
            System.out.println("A là số chẵn ");
        if(b%2==0)
            System.out.println("B là số chẵn");
        if(a%2!=0)
            System.out.println("A là số lẻ");
        else
            System.out.println("B là số lẻ");
    }
}
