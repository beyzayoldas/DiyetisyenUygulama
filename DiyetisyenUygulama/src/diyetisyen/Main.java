package diyetisyen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hastalar hastalar = new Hastalar();
        Diyetisyenler diyetisyenler = new Diyetisyenler(hastalar);
        Diyetisyenler.KiloAlma innerObject = diyetisyenler.new KiloAlma();
        Diyetisyenler.KiloVerme innerObject2 = diyetisyenler.new KiloVerme();

        System.out.println("*******DIYETISYEN UYGULAMASI******");
        System.out.println("Uygulamamiza hos geldiniz. Lutfen sorulari dogru cevaplayiniz, bizde size yardimci olalim!");

        try (Scanner klavye = new Scanner(System.in)) {
			System.out.print("Adinizi giriniz: ");
			hastalar.setAd(klavye.nextLine());
			System.out.print("Soyadinizi giriniz: ");
			hastalar.setSoyad(klavye.nextLine());
			System.out.print("Cinsiyetinizi giriniz(kadin=0 erkek=1): ");
			try {
			    hastalar.setCinsiyet(klavye.nextInt());
			} catch (Exception e) {
			    System.err.println("Cinsiyetiniz 0 veya 1 olmalidir!");
			    return;
			}
			System.out.print("Yasinizi giriniz: ");
			hastalar.setYas(klavye.nextInt());
			System.out.print("Guncel kilonuzu giriniz: ");
			hastalar.setKilo(klavye.nextDouble());
			System.out.print("Santimetre cinsinden boyunuzu giriniz: ");
			hastalar.setBoy(klavye.nextDouble());
			System.out.print("Aktivite durumunuzu giriniz(1=az, 2=orta, 3=cok): ");
			try{
			    hastalar.setAktiviteDurumu(klavye.nextInt());
			} catch (Exception e) {
			    System.err.println("Aktivite durumunuz 1,2 veya 3 olmalidir!");
			    return;
			}
			System.out.println("Hastaliginiz var mi?");
			hastalar.setHastalik(klavye.nextBoolean());
		}

        System.out.println(hastalar.getCinsiyet() == 1 ? "Erkek" : "Kadin");
        System.out.println("Vucut Kitle Indeksiniz:"+new DecimalFormat(".###").format(diyetisyenler.vucutKitleIndeks(hastalar.getKilo(),hastalar.getBoy())).replace(",","."));
        System.out.println("Gunluk su ihtiyaciniz:"+new DecimalFormat(".###").format(diyetisyenler.gunlukSuIhtiyaci(hastalar.getKilo())).replace(",",".")+" litre");
        System.out.println("Kalori ihtiyaciniz:"+new DecimalFormat(".###").format(diyetisyenler.kaloriIhtiyaci(hastalar.getKilo(),hastalar.getBoy(), hastalar.getYas(),hastalar.getCinsiyet(), hastalar.getAktiviteDurumu())).replace(",","."));	

        if (diyetisyenler.vucutKitleIndeks(hastalar.getKilo(), hastalar.getBoy()) < 20) {
            innerObject.kiloAlma(hastalar.getCinsiyet(), hastalar.getYas(), hastalar.getKilo(), hastalar.getBoy());
        } else
            innerObject2.kiloVerme(hastalar.getCinsiyet(), hastalar.getYas(), hastalar.getKilo(), hastalar.getBoy());
    

	
	
	
	hesapla(hastalar.getKilo());
	hesapla(hastalar.getBoy());
	hesapla(hastalar.getAd());
	}
	
	

	
	private static void hesapla(double kilo,double boy,String ad) {
		System.out.println(kilo+boy+ad);
		
	}
	
	private static void hesapla(String ad) {
		System.out.println("Hastanın Bilgileri: "+ad);
		
	}
	

	private static void hesapla(double kilo) {
		System.out.println("Hastanın Bilgileri: "+kilo);
		
	}
	
	
	

}