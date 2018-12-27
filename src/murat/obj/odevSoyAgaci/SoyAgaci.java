package murat.obj.odevSoyAgaci;

public class SoyAgaci {
	private String adi;
	private SoyAgaci anne;
	private SoyAgaci baba;
	
	public void sayiAl(int []a,int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public SoyAgaci getAnne() {
		return anne;
	}
	public void setAnne(SoyAgaci anne) {
		this.anne = anne;
	}
	public SoyAgaci getBaba() {
		return baba;
	}
	public void setBaba(SoyAgaci baba) {
		this.baba = baba;
	}
}
