package ex1;
public class NhaGo extends BanThietKe {
    public NhaGo() {
    }

    public NhaGo(String ChatLieu, String MauSac, String KieuDang) {
        super("Go", MauSac, KieuDang);
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

    public void XeGo() {
        System.out.println("Xe go");
    }
}
