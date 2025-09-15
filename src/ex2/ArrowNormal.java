package ex2;

public class ArrowNormal extends ArrowBase {
    public ArrowNormal() {
        super("Normal");
    }

    @Override
    public void fly() {
        System.out.println("The normal arrow is flying!");
    }
    
}
