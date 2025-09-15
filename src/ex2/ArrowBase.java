package ex2;

public abstract class ArrowBase {
    private String material;

    public ArrowBase(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    public abstract void fly();
}
