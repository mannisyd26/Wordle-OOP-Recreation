import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    Wordle w;
    String playAgain = "";
    while(!playAgain.equals("no")){
      System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      w = new Wordle();
      System.out.println("Play again?");
      playAgain = input.nextLine();
    }

  
  }
}