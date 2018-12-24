package murat.obj.odevSoyAgaci;

public class Aile {
	private String adi;
	private Aile anne;
	private Aile baba;
	
	public Aile(String adi, String anneAdi, String babaAdi){
		setAdi(adi);	
		anne.setAdi(anneAdi);
		baba.setAdi(babaAdi);
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Aile getAnne() {
		return anne;
	}

	public void setAnne(Aile anne) {
		this.anne = anne;
	}

	public Aile getBaba() {
		return baba;
	}

	public void setBaba(Aile baba) {
		this.baba = baba;
	}
}
