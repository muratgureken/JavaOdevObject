package murat.obj.validUsername;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		final Scanner scan;
		String [] adi;
		int inputNumbers;
		
		scan = new Scanner(System.in);
		inputNumbers = scan.nextInt();
		adi = new String[inputNumbers];
		
		for(int j=0;j<inputNumbers;j++)
		{
			adi[j] = scan.next();
		}
		
		for(int j=0;j<inputNumbers;j++)
		{
			new users(adi[j]);
		}
		scan.close();
	}

}
