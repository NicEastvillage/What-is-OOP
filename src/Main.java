public class Main {

    public static void main(String[] args) {

        // Create characters
        // These are instances of the Character class
        Character player = new Character("Player", 20, 2, 8);
        Character monster = new Character("Monster", 18, 3, 6);

        // Start fighting
        System.out.println("Let the battle begin!");
        while (!player.isDead() || !monster.isDead()) {

            int dmg;

            // The player attacks the monster
            // Characters have a getAttack() method, which we can call
            // to get the amount of damage they make on an attack
            dmg = player.getAttack();
            monster.takeDamage(dmg);
            // Concatenating strings are super easy in Java and similar languages!
            System.out.println(player.name + " deals " + dmg + " damage to " + monster.name + " (Absorbs " + monster.armor + ", " + monster.health + " hp left)");

            // Did the monster die?
            // We ask if the Character instance called 'monster'
            // has reached 0 hit points, if that is the case ...
            if (monster.isDead()) {
                // The isDead() method returns true
                System.out.println(monster.name + " died!");
                break;
            }

            // Now the monster attacks the player
            dmg = monster.getAttack();
            player.takeDamage(dmg);
            System.out.println(monster.name + " deals " + dmg + " damage to " + player.name + " (Absorbs " + player.armor + ", " + player.health + " hp left)");

            // Did the player die?
            if (player.isDead()) {
                System.out.println(player.name + " died!");
                break;
            }
        }
    }
}