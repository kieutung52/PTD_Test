package ex4;

public class BulletArmorPiercing extends BulletBase {
    public BulletArmorPiercing() {
        super("Steel"); // thép
    }

    @Override
    public void fly() {
        System.out.println("dạn xuyen giap (: " + getMaterial() + ")");
    }
}
