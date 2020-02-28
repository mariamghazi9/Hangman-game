package eg.edu.alexu.csd.datastructure.hangman.cs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public String[] read(){
	String [] words=new String[10];
	try {
		int i=0;
		BufferedReader br= new BufferedReader (new FileReader("filename.txt"));
		String s;
		while((s=br.readLine()) != null && i<words.length) {
			words[i] =s;
			i++;
		}
	}
	catch(IOException e) {	
		e.printStackTrace();
	}
	
return words;
}
}

