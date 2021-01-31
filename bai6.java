import java.util.Scanner;

import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

            System.out.println("Nhập vào số a:");

            a = sc.nextInt();
            long gt = 1;
            for (int i = 1; i <= a; i++) {

                gt = gt * i;
            }
            System.out.println("Giai thừa của " + a + " là: " + gt);



    }}



