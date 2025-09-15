package ex4;

public abstract class BulletBase {
    private String material;

    public BulletBase(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


    public abstract void fly();
}
