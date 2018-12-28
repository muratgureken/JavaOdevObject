package murat.obj.urunZinciri;

public class BeyazEsya extends Urun{
	int derinlik;
	int genislik;
	String enerjiSinifi;
	int enerjiTuketimi;
	int sesSeviyesi;
	int yukseklik;
}

class CamasirMakinesi extends BeyazEsya{
	boolean kurutmaOzelligi;
	int kurutmaKapasitesi;
	int maksimumDevirHizi;
	int yikamaKapasitesi;
}

class BulasikMakinesi extends BeyazEsya{
	boolean dijitalEkran;
	int kapasite;
	int programSayisi;
	int suTuketimi;
}

class Buzdolabi extends BeyazEsya{
	int dondurucuKapasitesi;
	int hacim;
	int sogutucuKapasitesi;
	String kapiSayisi;
}

class DerinDondurucu extends BeyazEsya{
	int cekmeceSayisi;
	String dondurucuOzelligi;
	int gunlukDondurmaKapasitesi;
	boolean hizliDondurma;
	int kapiSayisi;
	String kullanimSekli;
	int toplamHacim;
}

class Firin extends BeyazEsya{
	boolean elektrikliOcak;
	boolean gazliOcakGozu;
	int hacim;
	String kullanimSekli;
	int programSayisi;
}