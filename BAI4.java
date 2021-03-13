import java.util.Scanner;

public class BAI4 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số học sinh: ");
        n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
            sv.nhap();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("\nThông tin học sinh thứ " + (i + 1) + ": ");
            sv.xuat();
        }
    }

    static class SinhVien {
        public String hoTen, lop, gioiTinh;
        public float ngaySinh, diemToan, diemLy, diemHoa;

        void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào tên sinh viên");
            hoTen = sc.nextLine();
            System.out.println("Nhập vào lớp");
            lop = sc.nextLine();
            System.out.println("Nhập vào giới tính");
            gioiTinh = sc.nextLine();
            System.out.println("Nhập vào ngày sinh");
            ngaySinh = sc.nextInt();
            System.out.println("Nhập vào điểm toán");
            diemToan = sc.nextFloat();
            System.out.println("Nhập vào điểm lý");
            diemLy = sc.nextFloat();
            System.out.println("Nhập điểm hóa");
            diemHoa = sc.nextFloat();
        }

        void xuat() {
            System.out.println("Tên sinh viên" + hoTen);
            System.out.println("Lớp" + lop);
            System.out.println("Giới tính" + gioiTinh);
            System.out.println("Ngày sinh" + ngaySinh);
            System.out.println("Điểm toán" + diemToan);
            System.out.println("Điểm lý" + diemLy);
            System.out.println("Điểm hóa" + diemHoa);
            System.out.println("Trung bình cộng" + dtb());

        }

        public float dtb() {
            return (diemLy + diemHoa + diemToan) / 3;
        }

        public void setSinhVien(String hoTen, String lop, String gioiTinh, int ngaySinh, float diemToan, float diemHoa
                , float diemLy) {
            this.hoTen = hoTen;
            this.lop = lop;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diemToan = diemToan;
            this.diemHoa = diemHoa;
            this.diemLy = diemLy;
        }
    }
}
