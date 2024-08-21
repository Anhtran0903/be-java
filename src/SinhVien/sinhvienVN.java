package SinhVien;

public class sinhvienVN extends sinhvien {
    private float  trietHoc;

    public sinhvienVN(){
        super();
    }


    public sinhvienVN(float trietHoc) {
        super();
        this.trietHoc = trietHoc;
    }


    @Override
    public void xuat() {
            super.xuat();
            System.out.println("triet hoc: "+trietHoc);
    }
}
