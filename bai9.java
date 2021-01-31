import java.util.Scanner;
public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hoa = 0;
        int thuong = 0;
        int so = 0;
        System.out.println("Nhập vào chuỗi kí tự bất kì: ");
        String name = new String(sc.next());
        for (int i = 0; i < name.length(); i++) {
            char check = name.charAt(i);
            if (Character.isDigit(check)) {
                so++;
            }
            else if (Character.isUpperCase(check)) {
                hoa++;
            }
            else if (Character.isLowerCase(check)) {
                thuong++;
            }
        }
        System.out.println("Kí tự thường: "+thuong);
        System.out.println("Kí tự hoa: "+hoa);
        System.out.println("Kí tự số: "+so);
    }


}

