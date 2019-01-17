package murat.vectorList;

import java.util.Comparator;

//DIKKAT boyutundan daha az deger girilirse hata veriyor. length degerini iceride ayrica tutmak
//gerekiyor. Bu deger ekle/cikar ile degisebilir.

public class VectorList<T>{
	public Object[] dizi, dizi2, dizi3;
	int ofset; //vektorun nereden baslayacagi. constructor'da 0 olarak ilklendirilsin.
	int indis;
	private int boy;

	public VectorList(int boy) {
		dizi = new Object[boy];
	}

	public void ekle(T gelenveri)
	{
		//DIKKAT range kontrol yap. boyutyetmiyorsa artirmak gerekiyor. ek fonksiyon yaz.
		dizi[dizi.length+1] = gelenveri;
	}
	
	public void ekle(T gelenveri, int indis)
	{
		dizi[indis] = gelenveri;
	}

	public void degistir(int indis, int indis2)
	{
		T degisken;

		degisken = (T)dizi[indis];
		dizi[indis] = dizi[indis2];
		dizi[indis2] = degisken;            
	}

	private void degistir(Integer[] dizi, int indis, int indis2)
	{
		Integer degisken;

		degisken = dizi[indis];
		dizi[indis] = dizi[indis2];
		dizi[indis2] = degisken;            
	}

	private void degistir(Float[] dizi, int indis, int indis2)
	{
		Float degisken;

		degisken = dizi[indis];
		dizi[indis] = dizi[indis2];
		dizi[indis2] = degisken;            
	}
	
	private void degistir(Double[] dizi, int indis, int indis2)
	{
		Double degisken;

		degisken = dizi[indis];
		dizi[indis] = dizi[indis2];
		dizi[indis2] = degisken;            
	}
	
	public T cikar()
	{		
		//DIKKAT yeniden yaz
		return (T)dizi[0];
	}

	public void terscevir()
	{

		for(int i=0;i<(dizi.length)/2;i++)
		{
			T sayi;
			sayi = (T)dizi[i];
			dizi[i] = dizi[(dizi.length)-i-1];
			dizi[(dizi.length)-i-1] = sayi;
		}
	}

	public int boy()
	{
		return dizi.length;
	}

	public T  maksbul()
	{        	
		T sonuc=null; 

		if(dizi[0].getClass().toString().contains("Integer"))
		{
			Integer[] dizi1 = new Integer[this.dizi.length];
			Kopyala(dizi1,1);
			Integer sonuc1 = maksbul(dizi1);
			sonuc = (T)sonuc1;
		}
		else if(dizi[0].getClass().toString().contains("Float"))
		{
			Float[] dizi1 = new Float[this.dizi.length];
			Kopyala(dizi1,1);
			Float sonuc1 = maksbul(dizi1);
			sonuc = (T)sonuc1;
		}
		else if(dizi[0].getClass().toString().contains("Double"))
		{
			Double[] dizi1 = new Double[this.dizi.length];
			Kopyala(dizi1,1);;
			Double sonuc1 = maksbul(dizi1);
			sonuc = (T)sonuc1;
		}

		return sonuc;
	}        
	
	public T  minbul()
	{        	
		T sonuc=null; 

		if(dizi[0].getClass().toString().contains("Integer"))
		{
			Integer[] dizi1 = new Integer[this.dizi.length];
			Kopyala(dizi1,1);
			Integer sonuc1 = minbul(dizi1);
			sonuc = (T)sonuc1;
		}
		else if(dizi[0].getClass().toString().contains("Float"))
		{
			Float[] dizi1 = new Float[this.dizi.length];
			Kopyala(dizi1,1);
			Float sonuc1 = minbul(dizi1);
			sonuc = (T)sonuc1;
		}
		else if(dizi[0].getClass().toString().contains("Double"))
		{
			Double[] dizi1 = new Double[this.dizi.length];
			Kopyala(dizi1,1);;
			Double sonuc1 = minbul(dizi1);
			sonuc = (T)sonuc1;
		}

		return sonuc;
	}       

	public void kopyala(T[] dizi)
	{
		//DIKKAT aynen minbul maksbul gibi yap
		for(int i=0; i<dizi.length; i++)
		{
			dizi[i] = (T)(this.dizi[i]);
		}
	}

	private void Kopyala(Integer[] dizi,int yon)
	{
		if(yon==1)
		{
			for(int i=0; i<this.dizi.length; i++)
			{
				dizi[i] = (Integer)(this.dizi[i]);
			}
		}
		if(yon==2)
		{
			for(int i=0; i<this.dizi.length; i++)
			{
				this.dizi[i] = (T)(dizi[i]);
			}
		}
	}

	private void Kopyala(Float[] dizi,int yon)
	{
		if(yon==1)
		{
			for(int i=0; i<this.dizi.length; i++)
			{
				dizi[i] = (Float)(this.dizi[i]);
			}
		}
		if(yon==2)
		{
			for(int i=0; i<this.dizi.length; i++)
			{
				this.dizi[i] = (T)(dizi[i]);
			}
		}
	}

	private void Kopyala(Double[] dizi,int yon)
	{
		if(yon==1)
		{
			for(int i=0; i<this.dizi.length; i++)
			{
				dizi[i] = (Double)(this.dizi[i]);
			}
		}
		if(yon==2)
		{
			for(int i=0; i<this.dizi.length; i++)
			{
				this.dizi[i] = (T)(dizi[i]);
			}
		}
	}

	private Integer maksbul(Integer[] dizi)
	{
		Integer maksimum, araDeger;

		maksimum = dizi[0];
		indis = 0;

		for(int i=1;i<dizi.length; i++)
		{
			araDeger = dizi[i];
			if(araDeger>maksimum)
			{
				maksimum = araDeger;
				indis = i;
			}
		}
		return maksimum;
	}

	private Float maksbul(Float[] dizi)
	{
		Float maksimum, araDeger;

		maksimum = dizi[0];
		indis = 0;

		for(int i=1;i<dizi.length; i++)
		{
			araDeger = dizi[i];
			if(araDeger>maksimum)
			{
				maksimum = araDeger;
				indis = i;
			}
		}
		return maksimum;
	}

	private Double maksbul(Double[] dizi)
	{
		Double maksimum, araDeger;

		maksimum = dizi[0];
		indis = 0;

		for(int i=1;i<dizi.length; i++)
		{
			araDeger = dizi[i];
			if(araDeger>maksimum)
			{
				maksimum = araDeger;
				indis = i;
			}
		}
		return maksimum;
	}

	private Integer minbul(Integer[] dizi)
	{
		Integer minimum, araDeger;

		minimum = dizi[0];
		indis = 0;

		for(int i=1;i<dizi.length; i++)
		{
			araDeger = dizi[i];
			if(araDeger<minimum)
			{
				minimum = araDeger;
				indis = i;
			}
		}
		return minimum;
	}

	private Integer minbul(Integer[] dizi, int indisBas, int indisBitis)
	{
		Integer minimum, araDeger;

		//range control ekle

		minimum = dizi[indisBas];
		indis = indisBas;

		for(int i=1;i<=(indisBitis-indisBas); i++)
		{
			araDeger = dizi[i+indisBas];
			if(araDeger<minimum)
			{
				minimum = araDeger;
				indis = i+indisBas;
			}
		}
		return minimum;
	}

	private Float minbul(Float[] dizi)
	{
		Float minimum, araDeger;

		minimum = dizi[0];
		indis = 0;

		for(int i=1;i<dizi.length; i++)
		{
			araDeger = dizi[i];
			if(araDeger<minimum)
			{
				minimum = araDeger;
				indis = i;
			}
		}
		return minimum;
	}

	private Float minbul(Float[] dizi, int indisBas, int indisBitis)
	{
		Float minimum, araDeger;

		//range control ekle

		minimum = dizi[indisBas];
		indis = indisBas;

		for(int i=1;i<=(indisBitis-indisBas); i++)
		{
			araDeger = dizi[i+indisBas];
			if(araDeger<minimum)
			{
				minimum = araDeger;
				indis = i+indisBas;
			}
		}
		return minimum;
	}

	private Double minbul(Double[] dizi)
	{
		Double minimum, araDeger;

		minimum = dizi[0];
		indis = 0;

		for(int i=1;i<dizi.length; i++)
		{
			araDeger = dizi[i];
			if(araDeger<minimum)
			{
				minimum = araDeger;
				indis = i;
			}
		}
		return minimum;
	}     

	private Double minbul(Double[] dizi, int indisBas, int indisBitis)
	{
		Double minimum, araDeger;

		//range control ekle

		minimum = dizi[indisBas];
		indis = indisBas;

		for(int i=1;i<=(indisBitis-indisBas); i++)
		{
			araDeger = dizi[i+indisBas];
			if(araDeger<minimum)
			{
				minimum = araDeger;
				indis = i+indisBas;
			}
		}
		return minimum;
	}

	public boolean sirala()
	{        	
		//siralama yapamazsa false doner (type mismatch)
		boolean durum=false;
		
		if(dizi[0].getClass().toString().contains("Integer"))
		{
			Integer[] dizi1 = new Integer[this.dizi.length];
			Kopyala(dizi1, 1);;
			sirala(dizi1);
			Kopyala(dizi1, 2);
			durum = true;
		}
		else if(dizi[0].getClass().toString().contains("Float"))
		{
			Float[] dizi1 = new Float[this.dizi.length];
			Kopyala(dizi1,1);
			sirala(dizi1);
			Kopyala(dizi1, 2);
			durum = true;
		}
		else if(dizi[0].getClass().toString().contains("Double"))
		{
			Double[] dizi1 = new Double[this.dizi.length];
			Kopyala(dizi1,1);
			sirala(dizi1);
			Kopyala(dizi1, 2);
			durum = true;
		}        
		
		return durum;
	}

	public void sirala(Integer[] dizi)
	{
		//indisi kaybetmemek icin saklanir.
		int indisSakla=indis;
		for(int i=0; i<dizi.length; i++)
		{
			Integer sayi = minbul(dizi, i, dizi.length-1);
			if(i!=indis)
			{
				degistir(dizi, i, indis);
			}
		}
		indis = indisSakla;
	}

	public void sirala(Float[] dizi)
	{
		//indisi kaybetmemek icin saklanir.
		int indisSakla=indis;
		for(int i=0; i<dizi.length; i++)
		{
			Float sayi = minbul(dizi, i, dizi.length-1);
			if(i!=indis)
			{
				degistir(dizi, i, indis);
			}
		}
		indis = indisSakla;
	}

	public void sirala(Double[] dizi)
	{
		//indisi kaybetmemek icin saklanir.
		int indisSakla=indis;
		for(int i=0; i<dizi.length; i++)
		{
			Double sayi = minbul(dizi, i, dizi.length-1);
			if(i!=indis)
			{
				degistir(dizi, i, indis);
			}
		}
		indis = indisSakla;
	}

	public void yazdir()
	{
		for (int j = 0; j < dizi.length; j++) {
			System.out.print(dizi[j]+" ");
		}

		System.out.println();
	}

	public T getir(int indis)
	{
		return (T)dizi[indis];
	}

	public Boolean icerir(T aranan)
	{
		Boolean durum=false;

		for (int i = 0; i < dizi.length; i++) {
			if(aranan.equals(dizi[i]))
			{
				durum = true;
				break;
			}
		}
		return durum;
	}
	
	/*toplam ekle : tum vektorun toplam degeri, String ise false don */
}
