package SinhVien;

public class sinhvien {
    private String ten;
    private float toan;
    private float van;

    public sinhvien(){

    }


    public sinhvien(String ten, float toan, float van) {
        this.ten = ten;
        this.toan = toan;
        this.van = van;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }
    public  void xuat(){
        System.out.println("ho ten: "+this.ten+ "--toan: "+this.toan +"van: "+this.van);
    }
    public float dtb(){
        return (this.toan+this.van)/2;
    }
    public float dtb(sinhvien a){
        return (this.dtb()+a.dtb())/2;
    }
    public float dtb(sinhvien a,sinhvien b){
        return (this.dtb()+a.dtb()+b.dtb())/3;
    }
}
