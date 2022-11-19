package week2.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String str1,str2,str3;
		str1="madam";
		str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
		System.out.println("reverse:  "+str2);
		//char[] charArray= str1.toCharArray();
	
	}		

}
