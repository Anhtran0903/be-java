import SinhVien.sinhvien;
import SinhVien.sinhvienNN;
import SinhVien.sinhvienVN;
import baiTap1.DocGia;
import baiTap1.ListDocGia;

public class Main1 {

    public static void main(String[] args) {
//        sinhvien a = new sinhvien();
//        a.setTen("le maoa");
//        sinhvien b =new sinhvien("le mao",3,5);
//        b.xuat();
//    System.out.println("DTB: "+b.dtb());
//        System.out.println("DTB: "+a.dtb(b));
//        System.out.println("DTB: "+a.dtb(a,b));
//
//        sinhvienVN  c =new sinhvienVN();
//        c.xuat();
//       sinhvienNN d = new sinhvienNN();
//       d.noinhieu();

        ListDocGia a = new ListDocGia();
        a.nhap();
        a.xuat();
        System.out.println("Tổng tiền = " + a.tongtien());


    }
}