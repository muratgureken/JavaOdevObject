package murat.vectorList;

import java.util.Comparator;

public class VectorList<T>{
	public Object[] dizi, dizi2, dizi3;
	T degisken;
	int ofset; //vektorun nereden baslayacagi. constructor'da 0 olarak ilklendirilsin.
	int indis;
                
	public VectorList(T temp, int boy) {
		dizi = new Object[boy];
	}
	
	public void ekle(T gelenveri, int indis)
	{
		//gelenveri = (T)dizi[0];
		dizi[indis] = gelenveri;
	}
	
        public void yerdegistir(int indis, int indis2)
	{
            T degisken;
            if(dizi instanceof Object)
            {
                
            }
            degisken = (T)dizi[indis];
            dizi[indis] = dizi[indis2];
            dizi[indis2] = degisken;            
	}
        
	//boyut
	
	//matris topla
	//matris carp
	//matris cikar
	//maxbul
	//minbul
        //degistir
        //yerdegistir
	
	//vektor sirala
	
	//degistir
	
	public T cikar()
	{		
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
        
        public Integer maksbul(Integer[] dizi)
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

        public Float maksbul(Float[] dizi)
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
        
        public Double maksbul(Double[] dizi)
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
        
        public Integer minbul(Integer[] dizi)
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

        public Integer minbul(Integer[] dizi, int indisBas, int indisBitis)
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
        
        public Float minbul(Float[] dizi)
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
        
        public Float minbul(Float[] dizi, int indisBas, int indisBitis)
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
                
        public Double minbul(Double[] dizi)
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
        
        public Double minbul(Double[] dizi, int indisBas, int indisBitis)
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
                
        public void sirala(Integer[] dizi)
        {
            //indisi kaybetmemek icin saklanir.
            int indisSakla=indis;
            for(int i=0;;)
            {
                
            }
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
}
