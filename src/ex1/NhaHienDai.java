package ex1;
public class NhaHienDai extends BanThietKe {
    public NhaHienDai() {
    }

    public NhaHienDai(String ChatLieu, String MauSac, String KieuDang) {
        super("Be tong", MauSac, KieuDang);
    }

    @Override
    public void DaoMong() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DaoMong'");
    }

    @Override
    public void LopMai() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'LopMai'");
    }

    public void MuaBeTong() {
        System.out.println("Mua be tong");
    }
    
}
