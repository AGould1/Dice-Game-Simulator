import java.util.Scanner;

public class DoubleDice { // Created a class named DoubleDice
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Die die1 = new Die(); // Created a new Die object named die1
    Die die2 = new Die(); // Created a new Die object named die2

    double balance = 100.00; // Set the initial balance to $100.00

    while (balance > 0) { //While loop that runs as long as balance is greater than 0
      System.out.printf("You have $%.2f\n", balance);
      System.out.println("How much would you like to bet (Enter 0 to quit)? ");
      double bet = input.nextDouble(); // Asks the user for a bet amount and stores it in the variable bet

      if (bet == 0) { // If the user enters 0, the program will print a message and break the loop
        System.out.println("\nSee you around, " + (balance > 100 ? "winner!" : "better luck next time"));
        break;
      }
      if (bet > balance || bet < 0) { // If the user enters a bet greater than their balance or less than 0, the program will print a message and continue the loop
        System.out.println("Invalid bet amount.");
        continue;
      }
      die1.roll(); //Rolls die 1 and die 2 and prints the result
      die2.roll();
      System.out.println("You rolled a " + die1.toString() + " and " + die2.toString());

      if (die1.equals(die2)) { // If the dies are equal, the user wins and their balance is increased by the bet amount, printing a message and continuing the loop
        balance += bet;
        System.out.printf("You win $%.2f\n\n", bet);
      }
      else { // If the dies aren't equal, the user loses and their balance is decreased by the bet amount, printing a message and continuing the loop
        balance -= bet;
        System.out.printf("You lose $%.2f\n\n", bet);
      }
      if (balance == 0) { // If the user's balance is 0, the program will print a message and break the loop
        System.out.println("You are out of money!");
        System.out.println("Better luck next time");
        break;
      }
    }
    input.close();
  }
}
