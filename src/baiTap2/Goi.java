package baiTap2;

public class Goi {
    protected long phi_co_ban;
    protected  long chi_phi_lop_hoc;
    protected boolean     dich_vu_xong_hoi;
    protected  long ho_tro_PT;

    public long tinhTien(){
            return phi_co_ban +chi_phi_lop_hoc+ho_tro_PT;
    }
}
