package eg.edu.alexu.csd.datastructure.hangman.cs;
import java.util.Random; 

public class Hangman implements IHangman {		
	String secretWord;
	String word;
    String[] dictionary = new String[10];
    int wrongGuess;
    int x=0;
    
	@Override
	public void setDictionary(String[] words) {
		dictionary=words;
	}

	@Override
	public String selectRandomSecretWord() {
        Random random = new Random(); 
        int i=random.nextInt(9);
        secretWord=dictionary[i];
        word = secretWord.replaceAll(".", "-");
        System.out.println(word);
		return secretWord;
	}

	@Override
	public String guess(Character c) throws Exception {
		int found=0;
		char []arr=word.toCharArray();

		for (int i=0;i<secretWord.length();i++)
		{
			if (secretWord.charAt(i)==c)
			{
				arr[i]=c;
				word=String.copyValueOf(arr);
				found=1;
				
			}
		}
		
		if(found==0 && c != null) {
			x++;		
			}
		
		
		if (x == wrongGuess) {
            System.out.println("You Lost!");
            System.exit(0);
            return null;
        }
		else if (word.compareToIgnoreCase(secretWord)==0){
			System.out.println(secretWord);
            System.out.println("You Won!");
          System.exit(0);
            return null;
        }
		else {
            return word;
        }
	}
		
		
	
	@Override
	public void setMaxWrongGuesses(Integer max) {
		if (max==null)
			wrongGuess=1;
		else
		    wrongGuess=max;
	}

}
