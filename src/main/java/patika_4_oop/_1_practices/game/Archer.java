package patika_4_oop._1_practices.game;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 800, 375);
    }

    @Override
    public void attack() {
        System.out.println(name + " ok fırlatıyor! HASAR: " + attackPower);
    }

    public void multiShot() {
        System.out.println(name + " 3'lü ok fırlattı!");
    }
}
