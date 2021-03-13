import java.util.Scanner;
import java.lang.Math;
public class BAI1 {
    public static void main(String[] args) {
        Diem diem = new Diem();
        diem.nhap();
        diem.xuat();
        diem.diemdoixung();
        diem.khoangcachhaidiem();

    }
}
class Diem {
    int x, y;
    int x1, x2;

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tọa độ x");
        x = sc.nextInt();
        System.out.println("Nhập vào tọa độ y");
        y = sc.nextInt();
    }

    void xuat() {
        System.out.println("(" + x + "," + y + ")");
    }

    void diemdoixung() {
        x1 = -x;
        x2 = -y;
        System.out.println("Tọa độ đối xứng (" + x1 + "," + x2 + ")");
    }

    void khoangcachhaidiem() {
        double delta;
        delta = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((x2 - y), 2));
        System.out.println("Khoảng cach giữa hai điểm là : " + delta);
        double dt = 0;
        if (x == 0 || y == 0) {
            System.out.println("Hai điểm  nằm trên trục tọa độ");
            dt = 0.5 * delta * x;
            System.out.println("Diện tích tam giác"+dt);
        } else {
            System.out.println("Điểm này 2" + " nằm trên trục tọa độ");
        }
    }
}