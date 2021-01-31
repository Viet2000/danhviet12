import java.util.Scanner;

public class bai3 {

        public static void main(String[] args) {

            int nam, namht,tuoi;
            String ten;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào tên");
            ten = sc.nextLine();
            System.out.println("Bạn ten la: "+ ten );
            System.out.println("Nhập vào số năm hiện tại");
            namht = sc.nextInt();
            System.out.println("Nhập vào năm sinh");
            nam = sc.nextInt();
            tuoi = namht - nam;
            if(tuoi < 16){
                System.out.println("Bạn "+ ten + " ở độ tuổi vị thành niên");
            }
            if(tuoi >=16 && tuoi <18){
                System.out.println("Bạn "+ ten + " ở độ tuổi trưởng thành");
            }
            else{
                System.out.println("Bạn  " + ten + " đã già");
            }
        }

    }

