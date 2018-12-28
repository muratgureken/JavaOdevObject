package murat.obj.urunZinciri;

public class GoruntuUnitesi extends Urun{
	String cozunurluk;
	String goruntuTeknolojisi;
	int hdmi;
}

class Televizyon extends GoruntuUnitesi{
	boolean curved;
	boolean dahiliUyduAlici;
	String ekranBoyutu;
	String girisCikisPortlari;
	int goruntuTaramaHizi;
	int modelYili;
	boolean pcBaglantisi;
	boolean scart;
	int sesCikisi;
	boolean smartTv;
	boolean wifi;
}

class ProjeksiyonCihazi extends GoruntuUnitesi{
	boolean d3D;
	String cozunurluk;
	int fanSesi;
	String isikKaynagi;
	String kontrastOrani;
	boolean manuelZoom;
	int parlaklik;
	boolean usb;
	int vgaCikisi;
}