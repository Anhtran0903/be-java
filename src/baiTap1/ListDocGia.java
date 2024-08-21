package baiTap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDocGia {
    private List<DocGia> arr;

    public ListDocGia() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        System.out.println("1:nhap tre em:");
        System.out.println("2:nhap nguoi lon:");
        System.out.println("3:exit:");

        System.out.println("###############");

        int flag = 1;
        DocGia a;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("moi ban nhap: ");
            flag = scanner.nextInt();
            if (flag == 1) {
                a = new DocGia_TreEm();

            } else if (flag == 2) {
                a = new DocGia_NL();

            }

            else {
                System.out.println("###############");
                System.out.println("so luong tre em" + demSl());
                break;
            }
            a.nhap();
            arr.add(a);
        }


    }

    public void xuat() {
        for (DocGia d : this.arr) {
            d.xuat();
        }
    }

    public long tongtien() {
        long tong = 0;
        for (DocGia d : this.arr) {
            tong += d.tinhtien();
        }
        return tong;
    }

    public int demSl() {
        int count = 0;
        for (DocGia d : this.arr) {
            if (d instanceof DocGia_TreEm) {
                count++;
            }
        }
        return count;
    }
}


