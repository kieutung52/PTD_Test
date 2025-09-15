package ex2;

public class Bow {
    private ArrowBase arrow;

    public Bow(ArrowBase arrow) {
        this.arrow = arrow;
    }

    public void changeArrow(ArrowBase newArrow) {
        this.arrow = newArrow;
    }

    public void shoot() {
        System.out.println("Shooting an arrowNormal!");
        arrow.fly();
    }
}
