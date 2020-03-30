//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		HistoNode temp = front;
		while (front != null) {
			if (front.getLetter() == let) { // if the letter being added is already in the histo list
				front.setLetterCount(front.getLetterCount()+1); // incremenent that letter's count by 1
				front = temp; // reset front pointer to the front
				return;
			} 
			front = front.getNext(); // move onto the next node (letter, in this case)
		}
		front = temp; // reset front pointer to the front
		front = new HistoNode(let, 1, front); // create a new node with count 1

	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		HistoNode temp = front;
		
		while (front != null) {
			output += front.getLetter() + " - " + front.getLetterCount() + "   |   ";
			front = front.getNext();
		}
		return output;
	}
}
