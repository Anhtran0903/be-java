package baiTap1;

import java.util.Scanner;

public class DocGia_TreEm extends DocGia {
    private String NGB;
    public DocGia_TreEm() {
            this.setGia(5000);
    }

    public String getNGB() {
        return NGB;
    }

    public void setNGB(String NGB) {
        this.NGB = NGB;
    }

    @Override
    public void nhap() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap nguoi bao ho: ");
        this.NGB =scanner.nextLine();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.print("nguoi bao ho: "+this.NGB);
        super.xuat();
    }

    @Override
    long tinhtien() {
        return getGia()*getSoThang();
    }

}
