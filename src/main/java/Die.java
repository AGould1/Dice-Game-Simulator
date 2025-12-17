import java.util.Random;

public class Die { // Created a class named Die
  private int value; // Created a private int variable named value
  private Random rand; // Created a private Random variable named rand

  public Die() { // Created a constructor method for the Die class
    value = 0; // Assigned value to 0
    rand = new Random(); //Instantiated rand as a new Random object
  }
  public void roll() { // Created a roll method for the Die class
    value = rand.nextInt(6) + 1; // Simulates a roll between 1 and 6
  }
  public boolean equals(Die die2) { // Created an equals method for the Die class
    return this.value == die2.value; // Returns true if both values are equal, false otherwise
  }
  public String toString() { // Created toString method for the Die class
    switch (value) { // Switch statement to return the string "one" though "six" depending on the value of the die
      case 1:
        return "one";
      case 2:
        return "two";
      case 3:
        return "three";
      case 4:
        return "four";
      case 5:
        return "five";
      case 6:
        return "six";
      default: return "error";
    }
  }
  public int getValue() {
    return value; // Returns the value of the die
  }
}