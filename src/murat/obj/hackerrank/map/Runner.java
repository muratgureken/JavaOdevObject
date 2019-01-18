package murat.obj.hackerrank.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> kullanici = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			kullanici.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(kullanici.containsKey(s))
			{
			System.out.println(s+"="+kullanici.get(s));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
}

