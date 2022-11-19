package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		
		String test = "I am a software tester"; 
		String array[]= test.split(" ");
		String a[];
		System.out.println(array.length);
		for(int i=0;i<=array.length-1;i++)
		{
			if(i==1||i%2==1)
			{
			
			}
		}
	}
	
}
