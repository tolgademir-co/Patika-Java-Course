package patika_4_oop._1_practices.game;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1000, 350);
    }

    @Override
    public void attack() {
        System.out.println(name + " büyü yapıyor! HASAR: " + attackPower);
    }

    public void castSpell() {
        System.out.println(name + " ateş topu büyüsü yapıyor!");
    }
}