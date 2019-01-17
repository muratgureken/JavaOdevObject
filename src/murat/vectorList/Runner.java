package murat.vectorList;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		/*VectorList h = new VectorList(5); */// Hesapla yanina koseli parantez koymadigimiz icin class bizden default olarak object bekliyor.
		VectorList<Integer> sayi = new VectorList<Integer>(5);
		/*int gelen = sayi.cikar();*/
		sayi.ekle(6,0);
		sayi.ekle(3,1);
		sayi.ekle(1,2);
		sayi.ekle(4,3);
		sayi.ekle(5,4);
		sayi.yazdir();
		System.out.println("maks: "+sayi.maksbul());
		
		sayi.sirala();
		System.out.println("siralanmis veri");
		sayi.yazdir();
		int toplam = (Integer)sayi.dizi[0]+(Integer)sayi.dizi[1];
		System.out.println("Toplam:" + toplam+" dizi boy:"+sayi.boy());
		
		sayi.yazdir();
		sayi.terscevir();
		sayi.yazdir();
		Integer sayi2 = sayi.getir(1);
		Integer sayi3 = sayi.getir(2);
		int toplam2 = sayi2+sayi3;
		System.out.println("Toplam:" + toplam2);
		
		System.out.println("eleman:"+sayi2);
		System.out.println(sayi.toString());
		System.out.println(sayi.icerir(8));
		
		List<Integer> liste = new ArrayList<Integer>();
	}

}
