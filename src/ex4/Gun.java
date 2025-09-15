package ex4;

public class Gun {
    private BulletBase bullet; 
    private int ammo;          

    public Gun() {
        this.bullet = null;
        this.ammo = 0;
    }

 
    public void changeBullet(BulletBase bullet) {
        this.bullet = bullet;
        System.out.println("da thay doi dan: " + bullet.getClass().getSimpleName());
    }
  public void reload(int ammo) {
        this.ammo = ammo;
        System.out.println("Da nap " + ammo + " vien dan.");
    }

    public void shoot() {
        if (bullet == null) {
            System.out.println("chua chon loai đan");
            return;
        }
        if (ammo > 0) {
            ammo--;
            System.out.print("Ban ");
            bullet.fly();
        } else {
            System.out.println("het dan.");
        }
    }
}
