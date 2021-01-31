import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập một chuỗi kí tự bất kì: ");
            s = sc.nextLine();
        } while (s.length() > 80);
        System.out.println("Nhập một kí tự bất kì: ");
        char a = sc.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if (check == a) {
                dem++;
            }
        }
        if (dem > 0) {
            System.out
                    .println("Số lần xuất hiện của kí tự \"" + a + "\" trong chuỗi \"" + s + "\" là: " + dem + " lần.");
        } else {
            System.out.println("Không xuất hiện kí tự \"" + a + "\" trong chuỗi \"" + s + "\"");
        }
    }

}

