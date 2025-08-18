package patika_4_oop._1_practices.game;

public class Game {

    /**
     * Savaşçı
     * Büyücü
     * Okçu
     */

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("Gandalf");
        Archer archer = new Archer("Legolas");

        warrior.showStats();
        mage.showStats();
        archer.showStats();

        // KARAKTERLER SALDIRI YAPIYOPR--
        System.out.println("=== Saldırılar Başlıyor ===");
        warrior.attack();
        mage.attack();
        archer.attack();

        // KARAKTERLERİN ÖZEL YETEKLERİ--
        System.out.println("=== Özel Yetenekler ===");
        warrior.shieldBlock();
        mage.castSpell();
        archer.multiShot();

    }
}
