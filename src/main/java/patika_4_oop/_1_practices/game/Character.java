package patika_4_oop._1_practices.game;

public class Character {

    protected String name;

    protected int healt;

    protected int attackPower;

    public Character(String name, int healt, int attackPower) {
        this.name = name;
        this.healt = healt;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + "Saldırıyor! HASAR: " + attackPower);
    }

    public void showStats() {
        System.out.println("Karakter: " + name);
        System.out.println("Can: " + healt);
        System.out.println("Saldırı Gücü: " + attackPower);
        System.out.println("-------------------------------");
    }
}
