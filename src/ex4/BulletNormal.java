package ex4;

public class BulletNormal extends BulletBase {
    public BulletNormal() {
        super("Lead"); // chì
    }

    @Override
    public void fly() {
        System.out.println("dan thuong bay đi :  " + getMaterial() + ")");
    }
}
