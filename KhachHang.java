import java.util.Scanner;

public  abstract class KhachHang {
    int makhachhang;
    String tenkhachhang;
    int dienthoai;
    Scanner sc = new Scanner(System.in);
    void nhapthongtin(){
        System.out.println("Nhập tên khách hàng");
        tenkhachhang = sc.nextLine();
        System.out.println("Nhập mã khách hàng");
        makhachhang = sc.nextInt();
        System.out.println("Nhập số điện thoại");
        dienthoai = sc.nextInt();
    }
    void setKhachHang(int makhachhang,String tenkhachhang,int dienthoai){
        this.dienthoai = dienthoai;
        this.makhachhang = makhachhang;
        this.tenkhachhang = tenkhachhang;
    }
    void HienThi(){
        System.out.println("Tên khách hàng"+this.tenkhachhang);
        System.out.println("Mã khách hàng"+this.makhachhang);
        System.out.println("Số điện thoại"+this.dienthoai);
    }
}
class HoaDon{
    int sohoadon;
    int ngayban;
    String Tenkhachhang;
    Scanner sc = new Scanner(System.in);
    void nhapHoaDon(){
        System.out.println("Nhập số hóa đơn");
        sohoadon = sc.nextInt();
        System.out.println("Nhập ngày bán");
        ngayban = sc.nextInt();
        System.out.println("Nhập tên khách hàng");
        Tenkhachhang = sc.nextLine();
    }
    public void setHoaDon(int sohoadon,int ngayban,String Tenkhachhang){
        this.sohoadon = sohoadon;
        this.ngayban = ngayban;
        this.Tenkhachhang = Tenkhachhang;
    }
    void HienThiHoaDon(){
        System.out.println("Tên khách hàng"+this.Tenkhachhang);
        System.out.println("Số hóa đơn"+this.sohoadon);
        System.out.println("Ngày bán"+this.ngayban);
    }

}
 class ChiTietDonHang extends HoaDon {
     int masanpham;
     String tensanpham;
     int soluong;
     float dongia;

     void nhapChiTietDonHang() {
         super.nhapHoaDon();
         System.out.println("Nhập mã sản phẩm");
         masanpham = sc.nextInt();
         System.out.println("Nhập tên sản phẩm");
         tensanpham = sc.nextLine();
         System.out.println("Nhập số lượng");
         soluong = sc.nextInt();
         System.out.println("Nhập đơn giá");
         dongia = sc.nextFloat();
     }

     public void setChiTietDonhang(int masanpham, String tensanpham, int soluong, float dongia) {
         super.setHoaDon(sohoadon, ngayban, Tenkhachhang);
         this.masanpham = masanpham;
         this.tensanpham = tensanpham;
         this.soluong = soluong;
         this.dongia = dongia;
     }

     public float thanhtien() {
         return dongia * soluong;
     }

     void HienThiChiTiet(){
         super.HienThiHoaDon();
         System.out.println("Mã sản phẩm" + this.masanpham);
         System.out.println("Tên sản phẩm" + this.tensanpham);
         System.out.println("Số lượng" + this.soluong);
         System.out.println("Đơn giá" + this.dongia);
         System.out.println("Thành tiền" + thanhtien());
     }

 public static void main (String[] args) {
    ChiTietDonHang chitiet = new ChiTietDonHang();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập đơn hàng: ");
         int array[] = new int[3];
         for (int i = 0; i < 3; i++) {
             System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
             chitiet.nhapChiTietDonHang();
         }

         for (int i = 0; i < array.length; i++) {
             System.out.println("\nThông tin đơn hàng thứ " + (i + 1) + ": ");
             chitiet.HienThiChiTiet();
         }
         int temp;
     for (int i = 0; i < (chitiet.thanhtien() - 1); i++) {
         for (int j = 0; j < chitiet.thanhtien() - i - 1; j++) {
             if (array[j] > array[j + 1]) {
                 temp = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = temp;
             }
         }
     }
     System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
     for (int i = 0; i < chitiet.thanhtien(); i++) {
         System.out.print(array[i] + "\t");
     }

 }}