
public class Main {
    public static void main(String[] args) {
        Die die = new Die();
        System.out.println("Rolling the die...");
        die.roll();
        System.out.println("You rolled a " + die.toString() + " (" + die.getValue() + ")");
    }
}
