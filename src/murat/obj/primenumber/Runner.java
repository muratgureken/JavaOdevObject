package murat.obj.primenumber;
import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);
		int sayi,i,m=0,flag=0;
		boolean durum=true;
		while(durum)
		{
			System.out.println("Bir sayi girin.");
			sayi = scan.nextInt();
			if(sayi==-1)
			{
				durum=false;
				continue;
			}
			m = sayi/2;
			if(sayi==0||sayi==1)
			{
				flag = 1;
				System.out.println(sayi+" asal sayi degildir.");
			}
			else
			{
				for(i=2;i<=m;i++)
				{
					if(sayi%i==0)
					{
						System.out.println(sayi+" asal sayi degildir.");
						flag = 1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(sayi+" asal sayidir.");
				}
			}
			
			System.out.println();
		}

		scan.close();
	}

}
