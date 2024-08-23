package baiTap2;

import baiTap1.DocGia;
import baiTap1.DocGia_NL;
import baiTap1.DocGia_TreEm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListKh {
    private List<KhachHang> arr;

    public ListKh() {
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        System.out.println("1:nhap so luong khach hang:");
        int soLuong = 0;
        Scanner scanner =new Scanner(System.in);
        soLuong =scanner.nextInt();
        for(int i=0;i<soLuong;i++){
            KhachHang a    =new KhachHang();
            a.nhap();
            arr.add(a);
        }
    }
    public void xuat() {
        for (KhachHang d : this.arr) {
            d.xuat();
            System.out.println("tinh tien: "+ d.tinhTien());
        }
    }

}


