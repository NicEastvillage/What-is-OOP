import java.util.Random;

public class Dice {

    private int sides;

    private Random rand;

    /**
     * @param sides Number of sides.
     */
    public Dice(int sides) {
        setSides(sides);
        rand = new Random();
    }

    /**
     * Roll the die, return the result.
     * @return Result. Between 1 and number of sides inclusive.
     */
    public int roll() {
        return rand.nextInt(sides) + 1;
    }

    /**
     * @return Returns the greater of two rolls.
     */
    public int rollWithAdvantage() {
        return Math.max(roll(), roll());
    }

    /**
     * @return Returns the lower of two rolls.
     */
    public int rollWithDisadvantage() {
        return Math.min(roll(), roll());
    }

    /**
     * @return Returns the dice name as the formula "dN" where N is the number of sides.
     */
    @Override
    public String toString() {
        return "d" + sides;
    }

    /**
     * @return Number of sides.
     */
    public int getSides() {
        return sides;
    }

    /**
     * @param sides Number of sides. Must the 1 or greater.
     */
    public void setSides(int sides) {
        this.sides = Math.max(1, sides);
    }
}