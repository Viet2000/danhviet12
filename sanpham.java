import java.util.Scanner;

public class sanpham {
    public static void main(String[] args) {
        final SP sp = new SP();
        sp.nhapThongTin();
        sp.xuatThongTin();
        final main mi = new main();
        mi.nhap();

    }
}
class SP{
    String tensp;
    double donGia;
    double giamGia;
    private double thuenk;
    public void setTT(String tensp, double donGia, double giamGia, double thuenk){
        this.tensp = tensp;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.thuenk = thuenk;
    }
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên sản phẩm");
        this.tensp = sc.nextLine();
        System.out.println("Nhập vào đơn giá");
        this.donGia = sc.nextDouble();
        System.out.println("Nhập vào giảm giá");
        this.giamGia = sc.nextDouble();
        }

    private double getThuenk() {
        return thuenk = donGia / 10;
    }

    public void xuatThongTin(){
        System.out.println("Tên sản phẩm:"+this.tensp );
        System.out.println("Dơn giá:"+this.donGia);
        System.out.println("Giảm giá:"+this.giamGia);
        System.out.println("Thuế nhập khẩu:"+getThuenk());}


}
    class main extends SP{
    void nhap(){
       nhapThongTin();
       nhapThongTin();

    }
    void xuat(){
       xuatThongTin();
       xuatThongTin();
    }
}








