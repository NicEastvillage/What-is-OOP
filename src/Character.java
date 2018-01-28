public class Character {

    public String name;
    public int health;
    public int armor;

    private Dice attackRoll;

    /**
     * @param name The name of the character eg. "Player", "Arthur" or "Dragon".
     * @param health Amount of health (hit points).
     * @param armor Amount of armor. Any damage taken is reduced by this amount.
     * @param strength The strength of this characters attacks.
     */
    public Character(String name, int health, int armor, int strength) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.attackRoll = new Dice(strength);
    }

    /**
     * Rolls the characters attack die and returns the result.
     * @return Rolled damage
     */
    public int getAttack() {
        return attackRoll.roll();
    }

    /**
     * Deal damage to the character. It wont lose hit points if damage is less than or equal its armor
     * @param dmg The amount of damage
     */
    public void takeDamage(int dmg) {
        if (dmg > armor) {
            health = health - (dmg - armor);
        }
    }

    /**
     * @return Whether the character is dead
     */
    public boolean isDead() {
        return health <= 0;
    }
}
