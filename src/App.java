import ex1.BanThietKe;
import ex1.NhaGo;
import ex1.NhaHienDai;
import ex2.ArrowGold;
import ex2.ArrowNormal;
import ex2.Bow;

public class App {
    public static void main(String[] args) throws Exception {
        Bow bow = new Bow(new ArrowNormal());
        bow.shoot();
        bow.changeArrow(new ArrowGold());
        bow.shoot();
    }
}
