package murat.obj.urunZinciri;

public class Runner {

	public static void main(String[] args) {
		Buzdolabi bd = new Buzdolabi();
		Televizyon tv = new Televizyon();
		CepTelefonu cep = new CepTelefonu();
		
		bd.agirlik = 100;
		bd.derinlik = 60;
		bd.dondurucuKapasitesi = 100;
		
		tv.agirlik = 10;
		tv.hdmi = 2;
		tv.curved = true;
		
		cep.agirlik = 0.200f;
		cep.ram = 4;
		cep.ciftHat = false;
	}

}
