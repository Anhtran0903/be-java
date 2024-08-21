package baiTap1;

import java.util.Scanner;

public abstract class DocGia {
        private int soThang;
        private  long gia;


    public DocGia() {
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }
    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.printf("nhap so thang: ");
        this.soThang= scanner.nextInt();

    }
    public  void  xuat(){

        System.out.println("so thang: "+this.soThang +"gia: "+this.gia);
    }

    abstract long tinhtien();

}
