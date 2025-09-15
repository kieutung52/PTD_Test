package ex2;

public class ArrowGold extends ArrowBase {
    public ArrowGold() {
        super("Gold");
    }

    @Override
    public void fly() {
        System.out.println("The golden arrow is flying!");
    }
    
}
