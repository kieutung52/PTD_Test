package ex1;
public abstract class BanThietKe {
    private String ChatLieu;
    private String MauSac;
    private String KieuDang;

    public BanThietKe() {
    }

    public BanThietKe(String ChatLieu, String MauSac, String KieuDang) {
        this.ChatLieu = ChatLieu;
        this.MauSac = MauSac;
        this.KieuDang = KieuDang;
    }

    public abstract void DaoMong();
    public abstract void LopMai();
}
