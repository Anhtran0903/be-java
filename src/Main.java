import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static int inputNumber(String name) {
//        Scanner scanner = new Scanner(System.in);
//        boolean vaiidInput = false;
//        int value = 0;
//
//        while (!vaiidInput) {
//            try {
//                System.out.printf("nhap %s", name);
//                value = scanner.nextInt();
//                scanner.nextLine();
//                vaiidInput = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Loi");
//                scanner.next();
//            }
//        }
//        return value;
//    }
//
//    public static void nhapxuat() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap ten cua ban: ");
//        String name = scanner.nextLine();
//        int age = 0;
//        int hieght = 0;
//        age = inputNumber("tuoi: ");
//        hieght = inputNumber("chieu cao: ");
//        System.out.println("ten: " + name);
//        System.out.println("tuoi: " + age);
//        System.out.println("chieu cao: " + hieght);
//        scanner.close();
//    }
//
//    public static String getZodiacSign(int ngaysinh, int thang) {
//
//        if (thang == 1) {
//            return (ngaysinh <= 19) ? "Ma Kết" : "Bảo Bình";
//        } else if (thang == 2) {
//            return (ngaysinh <= 18) ? "Bảo Bình" : "Song Ngư";
//        } else if (thang == 3) {
//            return (ngaysinh <= 20) ? "Song Ngư" : "Bạch Dương";
//        } else if (thang == 4) {
//            return (ngaysinh <= 19) ? "Bạch Dương" : "Kim Ngưu";
//        } else if (thang == 5) {
//            return (ngaysinh <= 20) ? "Kim Ngưu" : "Song Tử";
//        } else if (thang == 6) {
//            return (ngaysinh <= 20) ? "Song Tử" : "Cự Giải";
//        } else if (thang == 7) {
//            return (ngaysinh <= 22) ? "Cự Giải" : "Sư Tử";
//        } else if (thang == 8) {
//            return (ngaysinh <= 22) ? "SƯ TỬ" : "XỬ NỮ";
//        } else if (thang == 9) {
//            return (ngaysinh <= 22) ? "Xử Nữ" : "Thiên Bình";
//        } else if (thang == 10) {
//            return (ngaysinh <= 22) ? "Thiên Bình" : "Bọ Cạp";
//        } else if (thang == 11) {
//            return (ngaysinh <= 21) ? "Bọ Cạp" : "Nhân Mã";
//        } else if (thang == 12) {
//            return (ngaysinh <= 21) ? "Nhân Mã" : "Ma Kết";
//        } else {
//        }
//        return "Ngày hoặc tháng không hợp lệ";
//
//    }
//
//    public static void nhapNgThg() {
//        Scanner scanner = new Scanner(System.in);
//
//
//
//
//        System.out.print("nhap thang: ");
//        int thang = scanner.nextInt();
//        System.out.print("nhap ngay: ");
//        int ngaysinh = scanner.nextInt();
//
//        String getZodiacSign =   getZodiacSign(ngaysinh,thang);
//
//        System.out.println("cung cuat ban:"+   getZodiacSign);
//
//    }

//    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap chieu dai: ");
//        int d = scanner.nextInt();
//        System.out.print("nhap chieu rong : ");
//        int r = scanner.nextInt();
//        HCN a =new HCN(d,r);
//        System.out.println("dai "+ a.dai);
//        System.out.println("rong "+ a.rong);
//        System.out.println("dien tich "+ a.dai * a.rong);
//    }
}