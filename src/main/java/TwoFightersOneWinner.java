/**
 * 7 kyu. Two fighters, one winner.
 * https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java
 */
public class TwoFightersOneWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (!fighter1.name.equals(firstAttacker)) {
            return declareWinner(fighter2, fighter1, firstAttacker);
        }

        fighter2.health -= fighter1.damagePerAttack;
        if (fighter2.health <= 0) {
            return firstAttacker;
        }
        return declareWinner(fighter2, fighter1, fighter2.name);
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
