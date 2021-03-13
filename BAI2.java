import java.util.Scanner;
import java.util.Collections;
public class BAI2 {
    public static void main(String[] args) {
        thoigian tg = new thoigian();
        tg.nhap();
        tg.xuat();
        tg.doi();
        tg.sosanh();

        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số vận động viên: ");
            n = scanner.nextInt();
        } while (n >50);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập thời gian(s): ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập thời gian của vận động viên thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\nThời gian: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        // tính trung bình thời gian
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("\nTrung bình thời gian  = " + sum/n);

         int max = 0;
         max = array[0];
        for(int i = 0;i<array.length;i++){

            if(max<array[i]) max = array[i]; i++;
        }
        System.out.println("\nSố lớn nhất trong mảng"+max);

    }
}


class thoigian {
    private int gio, phut, giay;
    Scanner sc = new Scanner(System.in);

    void nhap() {
        System.out.println("Nhập vào giờ");
        gio = sc.nextInt();
        System.out.println("Nhập vào phút");
        phut = sc.nextInt();
        System.out.println("Nhập vào giây");
        giay = sc.nextInt();
    }

    void xuat() {
        System.out.println(gio + "," + phut + "," + giay);
    }

    void setGio(int gio) {
        this.gio = 0;
    }

    void setGiay(int giay) {
        this.giay = 0;
    }

    void setPhut(int phut) {
        this.phut = 0;
    }

    void doi() {
        int doigio = gio * 3600;
        int doiphut = phut * 60;
        int doigiay = giay;
        System.out.println("Giờ đổi ra giây " + doigio);
        System.out.println("Phút đổi ra giây" + doiphut);
        System.out.println("Giây đổi ra giây" + doigiay);
    }
    void sosanh() {
        if (gio > phut || gio > giay){
            System.out.println("Lớn hơn");
        }
        else{
            System.out.println("Nhỏ hơn");
        }
    }
}