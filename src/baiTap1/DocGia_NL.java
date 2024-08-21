package baiTap1;

import java.util.Scanner;

public class DocGia_NL extends DocGia{
    private String soCCCD;

    public DocGia_NL() {
        this.setGia(10000);
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }
    @Override
    public void nhap() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap so CCCD: ");
        this.soCCCD =scanner.nextLine();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.print("so CCCD: "+this.soCCCD);
        super.xuat();
    }

    @Override
    long tinhtien() {
        return getGia()*getSoThang();
    }
}
