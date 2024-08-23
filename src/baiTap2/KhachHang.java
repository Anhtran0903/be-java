package baiTap2;

import java.util.Scanner;

public class KhachHang {
    private String ten;
    private  int cccd;
    private int thang;
    private  Goi Goia;
    public KhachHang() {


    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap ten: ");
        this.ten=  scanner.nextLine();
        System.out.print("nhap nhap cccd: ");
        this.cccd=  scanner.nextInt();
        System.out.print("nhap thang: ");
        this.thang=  scanner.nextInt();


        int  flag=1;
        System.out.print("1:Premiun ||");
        System.out.print("|| 2:Basic ");
        System.out.print("|| 3:Non-menber ");
        System.out.print("chon goi dich vu: ");
       flag =  scanner.nextInt();
        if (flag ==1 ){
            this.Goia = new Premium();

        } else if (flag ==2) {
            System.out.print("mhap so lop: ");
            int SoLop =scanner.nextInt();
            this.Goia=new Basic(SoLop);
        }else if(flag==3) this.Goia = new Non();

    }
    public void  xuat(){

        System.out.print("--ho ten: "+getTen());
        System.out.print("--CCCD: "+getCccd());
        System.out.println("--thang : "+getThang());

    }
    public long tinhTien(){

        return Goia.tinhTien()*this.thang;
    }

}
