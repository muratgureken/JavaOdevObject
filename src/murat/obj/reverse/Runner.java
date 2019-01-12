package murat.obj.reverse;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=789101230;
		int bolum=sayi;		

		for(int i=0;i<String.valueOf(sayi).length();i++)
		{
			int kalan = bolum%10;
			bolum = bolum/10;
			if((i==0)&&(kalan==0))
			{
				continue;
			}
			System.out.print(kalan);
		}
	}

}
