package patika_4_oop._1_practices.game;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 1500, 250);

    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(name + " Kılıcıyla Saldırıyor! HASAR: " + attackPower);
    }

    public void shieldBlock() {
        System.out.println(name + " Kalkanı Kullanarak Savunma Yapıyor!");
    }
}
