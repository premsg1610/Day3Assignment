package com.masai;

public class CheckLetter {

	String lower = "bcdfghjklmnpqrstvwxyz";
	String upper = "BCDFGHJKLMNPQRSTVWXYZ";
	
	void checkType(char value) {
		
		boolean flag = false;
		
		for(int i=0; i<lower.length(); i++)
		{
			if(value == lower.charAt(i) || value == upper.charAt(i))
			{
				System.out.println("Character is Consonant");
				flag = true;
				break;
			}
		}
		
		if(flag == false)
		{
			if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U')
			{
				System.out.println("Character is Vowel");
			}
			else{
				System.out.println("Error: Invalid character");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		CheckLetter c1 = new CheckLetter();
		
		c1.checkType('a');
		c1.checkType('b');
		c1.checkType('*');
		
	}
}
