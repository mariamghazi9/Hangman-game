package eg.edu.alexu.csd.datastructure.hangman.cs;

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) throws Exception {
	ReadFile obj=new ReadFile();
	String[] a = obj.read();
	
	Hangman game=new Hangman();
	game.setDictionary(a);
    
	game.selectRandomSecretWord();
	
	
	game.setMaxWrongGuesses(5);
	int max=game.wrongGuess;

    while(max > 0) {
    Scanner sc = new Scanner(System.in); 
    char c = sc.next().charAt(0);  
    System.out.print(game.guess(c));
		}
	}
}
