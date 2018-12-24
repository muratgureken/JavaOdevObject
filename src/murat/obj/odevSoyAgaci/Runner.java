package murat.obj.odevSoyAgaci;

import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;

public class Runner {

	public static void main(String[] args) {
		SoyAgaci ben = new SoyAgaci();
		ben.setAdi("Murat");
		ben.setAnne(new SoyAgaci());
		ben.getAnne().setAdi("Anne");
		ben.getAnne().setAnne(new SoyAgaci());
		ben.getAnne().getAnne().setAdi("A Annesi");
		ben.getAnne().setBaba(new SoyAgaci());
		ben.getAnne().getBaba().setAdi("A Babasý");
		ben.getAnne().getAnne().setAnne(new SoyAgaci());
		ben.getAnne().getAnne().getAnne().setAdi("AA Annesi");
		ben.getAnne().getAnne().setBaba(new SoyAgaci());
		ben.getAnne().getAnne().getBaba().setAdi("AA Babasi");
		ben.getAnne().getBaba().setAnne(new SoyAgaci());
		ben.getAnne().getBaba().getAnne().setAdi("AB Annesi");	
		ben.getAnne().getBaba().setBaba(new SoyAgaci());
		ben.getAnne().getBaba().getBaba().setAdi("AB Babasý");

		ben.setBaba(new SoyAgaci());
		ben.getBaba().setAdi("Baba");
		ben.getBaba().setAnne(new SoyAgaci());
		ben.getBaba().getAnne().setAdi("B Annesi");
		ben.getBaba().setBaba(new SoyAgaci());
		ben.getBaba().getBaba().setAdi("B Babasý");
		ben.getBaba().getAnne().setAnne(new SoyAgaci());
		ben.getBaba().getAnne().getAnne().setAdi("BA Annesi");
		ben.getBaba().getAnne().setBaba(new SoyAgaci());
		ben.getBaba().getAnne().getBaba().setAdi("BA Babasý");
		ben.getBaba().getBaba().setAnne(new SoyAgaci());
		ben.getBaba().getBaba().getAnne().setAdi("BB Annesi");
		ben.getBaba().getBaba().setBaba(new SoyAgaci());
		ben.getBaba().getBaba().getBaba().setAdi("BB Babasý");
		
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");		
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");		
		System.out.print("\t");
		System.out.println(ben.getAdi());
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");	
		System.out.print(ben.getAnne().getAdi());
		System.out.print("\t");
		System.out.print("\t");	
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.println(ben.getBaba().getAdi());
		System.out.print("\t");
		System.out.print(ben.getAnne().getAnne().getAdi());
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.print(ben.getAnne().getBaba().getAdi());
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.print(ben.getBaba().getAnne().getAdi());
		System.out.print("\t");
		System.out.print("\t");
		System.out.print("\t");
		System.out.println(ben.getBaba().getBaba().getAdi());
		System.out.print(ben.getAnne().getAnne().getAnne().getAdi());
		System.out.print("\t");
		System.out.print(ben.getAnne().getAnne().getBaba().getAdi());
		System.out.print("\t");
		System.out.print(ben.getAnne().getBaba().getAnne().getAdi());
		System.out.print("\t");
		System.out.print(ben.getAnne().getBaba().getBaba().getAdi());
		System.out.print("\t");
		System.out.print(ben.getBaba().getAnne().getAnne().getAdi());
		System.out.print("\t");
		System.out.print(ben.getBaba().getAnne().getBaba().getAdi());
		System.out.print("\t");
		System.out.print(ben.getBaba().getBaba().getAnne().getAdi());
		System.out.print("\t");
		System.out.print(ben.getBaba().getBaba().getBaba().getAdi());		
	}
}
