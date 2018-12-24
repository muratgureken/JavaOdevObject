package murat.obj.validUsername;

import java.util.Scanner;

public class users {
	public String adi;
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789";
	boolean valid=true;
	private Scanner scan; 
	int inputNumber;

	public users(String adi) {

		if((adi.length()<8)||(adi.length()>30))
		{
			System.out.println("Invalid");				
		}
		else
		{
			for(int i=0;i<adi.length();i++)
			{
				if(!(alphabet.contains(adi.substring(i, i+1))))
				{
					valid = false;
					break;
				}

				if((i==0)&&(alphabet.indexOf(adi.substring(i,i+1))>51))
				{
					valid = false;
					break;
				}
				valid = true;
				this.adi = adi;
			}
			if(valid)
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
	}
}
