package ex4;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();


        gun.changeBullet(new BulletNormal());
        gun.reload(3);
        gun.shoot();
        gun.shoot();


        gun.changeBullet(new BulletArmorPiercing());
        gun.reload(2);
        gun.shoot();
        gun.shoot();
        gun.shoot(); 
    }
}
