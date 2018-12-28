package murat.obj.urunZinciri;

public class BilgisayarTelefon extends Urun{
	boolean bluetooth;
	String boyutlar;
	int ram;
	int dahiliHafiza;
	float ekranBoyutu;
	String ekranCozunurlugu;
	boolean hdmi;
	int islemciHizi;
	String isletimSistemi;
}

class DizustuBilgisayar extends BilgisayarTelefon{
	int bellekHizi;
	boolean dokunmatikEkran;
	String ekranKarti;
	String ekranOzelligi;
	String islemciTipi;
	boolean parmakIziOkuyucu;
	int ssdKapasitesi;
	boolean webcam;
}

class MasaustuBilgisayar extends BilgisayarTelefon{
	int bellekHizi;
	String ekranKarti;
	boolean ethernet;
	String islemciTipi;
	boolean klavyeMouse;
	boolean monitor;
	String optikSurucu;
	int ssdKapasitesi;
	boolean webcam;
	boolean wireless;
}

class Tablet extends BilgisayarTelefon{
	boolean g3g;
	String artirilabilirHafiza;
	String ekranTipi;
	boolean gps;
	String hafizaKartiTipi;
	int islemciCekirdekSayisi;
	float kameraCozunurlugu;
	int kameraSayisi;
	String ekranCozunurlugu;
	boolean mobilBaglanti;
}

class CepTelefonu extends BilgisayarTelefon{
	String artirilabilirHafiza;
	boolean gps;
	boolean ciftHat;
	boolean dahiliModem;
	String ekranTipi;
	boolean gozTaramasi;
	String hafizaKartiTipi;
	boolean kablosuzSarj;
	float kameraCozunurlugu;
	boolean klavye;
	int konusmaSuresi;
	boolean parmakIziOkuyucu;
	String pilGucu;
	boolean radyo;
	String sarjGirisi;
	boolean tvOzelligi;
	boolean yuzTanima;	
}