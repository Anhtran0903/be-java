package baiTap2;

public class Basic extends Goi{
    private int SoLop;
    public Basic(int SoLop) {

        this.ho_tro_PT =100;
        this.chi_phi_lop_hoc=100;
        this.dich_vu_xong_hoi=true;
        this.phi_co_ban=500;
        this.SoLop=SoLop;
    }

    public int getSoLop() {
        return SoLop;
    }

    public void setSoLop(int soLop) {
        SoLop = soLop;
    }
    public long tinhTien(){
        return phi_co_ban +chi_phi_lop_hoc*SoLop+ho_tro_PT;
    }
}
