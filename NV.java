
import java.util.Scanner;
public class NV {
    protected String name;
    protected long luong;
    Scanner scanner = new Scanner(System.in);

    public NV() {
        super();
    }

    public NV(String name,long luong) {
        super();
        this.name = name;
        this.luong = luong;

    }

    public void nhap() {
        System.out.print("Nhập tên nhân viên: ");
        name = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        luong = scanner.nextLong();

    }

    public long tinhLuong() {
        return 0;
    }

    @Override
    public String toString() {
        return "Tên nhân viên: " + this.name + ", Lương: " + this.luong;
    }
    protected String loainhanvien(){
        return "";
    }
}
class parttime extends NV {
    private int soGioLamThem;

    public parttime() {
        super();
    }

    public parttime(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số giờ làm thêm: ");
        soGioLamThem = scanner.nextInt();
    }

    @Override
    public   long tinhLuong() {
        this.luong =  this.soGioLamThem * 200000;
        return this.luong ;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, số giờ làm thêm: " + this.soGioLamThem +
                ", lương: " + this.luong;
    }
}
class fulltimesep extends NV {

    @Override
    public String toString() {
       return super.toString()+"Lương của sếp là 20000000";
    }

}
class fulltimenhanvien extends NV {

    @Override
    public String toString() {
       return super.toString()+ "Lương của nhân viên là 10000000";
    }


    public static void main(String[] args) {
        int luongTrungBinh = 0, tongLuong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        NV[] nhanVien = new NV[soNhanVien];

        System.out.println("Nhập thông tin cho nhân viên");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Chọn loại nhân viên (1 - parttime, 2 - fulltimesep, 3- fulltimenhanvien): ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                nhanVien[i] = new parttime();
            } else if (choose == 2) {
                nhanVien[i] = new fulltimesep();
            } else if (choose == 3) {
                nhanVien[i] = new fulltimesep();

            nhanVien[i].nhap();
            nhanVien[i].tinhLuong();
        }

        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for ( i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }


    }}}



