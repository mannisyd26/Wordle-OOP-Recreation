import java.util.Scanner;
public class Wordle{

  private String word;
  
  public Wordle(){
    System.out.println("Enter a secret word");
    Scanner input = new Scanner(System.in);
    word = input.nextLine();
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
    play();
  }

  public String checkWord(String guess){
    String rv = "";
    for(int i=0; i<guess.length(); i++){
if(guess.substring(i,i+1).equals(word.substring(i,i+1))){
        rv += "X";
      }
      else if(word.indexOf(guess.substring(i,i+1))!=-1)
        rv += "/";
      else
        rv += "-";
    }
    System.out.println(rv);
    return rv;
  }

  public void play(){
    boolean win = false;
    String guess, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Guess");
    for(int i=0; i<6; i++){
      guess = input.nextLine();
      result = checkWord(guess);
      if("XXXXX".equals(result)){
        win = true; 
        i=6;
      }
      
    }
    if(win)
      System.out.println("Win");
    else
      System.out.println("Lose");
    
  }
}