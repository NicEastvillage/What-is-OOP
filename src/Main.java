public class Main {

    public static void main(String[] args) {

        // Create characters
        Character player = new Character("Player", 20, 3, 8);
        Character monster = new Character("Monster", 18, 3, 6);

        // Start fighting
        System.out.println("Let the battle begin!");
        while (!player.isDead() || !monster.isDead()) {

            int dmg;

            // The player attacks the monster
            dmg = player.getAttack();
            monster.takeDamage(dmg);
            System.out.println(player.name + " deals " + dmg + " damage to " + monster.name + " (Absorbs " + monster.armor + ", " + monster.health + " hp left)");

            // Did the monster die?
            if (monster.isDead()) {
                System.out.println(monster.name + " died!");
                break;
            }

            // The monster attacks the player
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
