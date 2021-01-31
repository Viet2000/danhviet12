import java.util.Scanner;

import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        int number , sum = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Nhập vào số nguyên bất kì");
            number = sc.nextInt();
            sum+=number;
        } while (sum <= 100);
        System.out.println("Tổng của các số là: "+ sum);
    }
}
