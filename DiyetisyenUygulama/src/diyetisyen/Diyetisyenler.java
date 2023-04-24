package diyetisyen;


public class Diyetisyenler extends Hastalar implements IHesaplamalar{
	Hastalar hastalar;

    public Diyetisyenler(Hastalar hastalar) {
        this.hastalar = hastalar;
    }

    @Override
    public double vucutKitleIndeks(double kilo, double boy) {
        return kilo / (boy * boy / (100 * 100));
    }

    @Override
    public double gunlukSuIhtiyaci(double kilo) {
        return 33 * kilo / 1000;
    }

    @Override
    public double kaloriIhtiyaci(double kilo, double boy, int yas, int cinsiyet, double aktiviteDurumu) {
        if (aktiviteDurumu == 1.0) {
            aktiviteDurumu = 1.2;
        } else if (aktiviteDurumu == 2.0) {
            aktiviteDurumu = 1.375;
        } else {
            aktiviteDurumu = 1.55;
        }

        return bazalMetabolizmaHesapla(kilo, boy, yas, cinsiyet) * aktiviteDurumu;
    }

    @Override
    public double bazalMetabolizmaHesapla(double kilo, double boy, int yas, int cinsiyet) {
        if (cinsiyet == 1) { // Erkek ise
            return 66.5 + (13.75 * kilo) + (5 * boy) - (6.77 * yas);
        } else {
            return 655.1 + (9.56 * kilo) + (1.85 * boy) - (4.67 * yas);
        }
    }

    class KiloAlma {

        public void kiloAlma(int gelenCinsiyet, int gelenYas, double gelenKilo, double gelenBoy) {
            if (hastalar.hastalikVarMi(false) == false) {
                if (gelenYas > 15 && gelenYas <= 25) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    }
                } else if (gelenYas > 25 && gelenYas <= 35) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas > 35 && gelenYas < 55) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas >= 55) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else {
                        System.out.println("15 yasindan kucukler icin sistemimiz uygun degildir.");
                    }
                }
            } else {
                if (gelenYas > 15 && gelenYas <= 25) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else {
                        System.out.println("Istenilenleri lutfen dogru giriniz.");
                    }
                } else if (gelenYas > 25 && gelenYas <= 35) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas > 35 && gelenYas < 55) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas >= 55) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) < 20) {
                        System.out.println("cikan sonuclara gore hastaliginiz bulundugu için kilo almaniza uygun menu asagida verilmistir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    }
                } else {
                    System.out.println("15 yasindan kucukler icin sistemimiz uygun degildir.");
                }
            }
        }
    }

    class KiloVerme {

        public void kiloVerme(int gelenCinsiyet, int gelenYas, double gelenKilo, double gelenBoy) {
            if (hastalar.hastalikVarMi(false) == false) {
                if (gelenYas > 15 && gelenYas <= 25) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else {
                        System.out.println("Istenilenleri lutfen dogru giriniz.");
                    }
                } else if (gelenYas > 25 && gelenYas <= 35) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas > 35 && gelenYas < 55) {
                    if (gelenYas == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas >= 55) {
                    if (gelenYas == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore kilo vermeniz uygun görülmüstür.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else {
                        System.out.println("15 yasindan kucukler icin sistemimiz uygun degildir.");
                    }
                }
            } else {
                if (gelenYas > 15 && gelenYas <= 25) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "3 yemek kaşığı lor peynirli salata (kırmızı kaypa biber, maydanoz, 2 adet ceviz, 2 kiraz domates )\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "1 fincan yeşil çay\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "Sade Türk kahvesi\r\n"
                        		+ "5 adet çiğ badem\r\n"
                        		+ "\r\n"
                        		+ "Öğlen\r\n"
                        		+ "\r\n"
                        		+ "Izgara tavuklu salata\r\n"
                        		+ "1 kase yoğurt\r\n"
                        		+ "1 tane wasa\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 adet yeşil elma\r\n"
                        		+ "1 su bardağı kefir\r\n"
                        		+ "\r\n"
                        		+ "Akşam\r\n"
                        		+ "\r\n"
                        		+ "1 kase çorba\r\n"
                        		+ "8 yemek kaşığı kabak sote\r\n"
                        		+ "1 dilim tam buğday ekmeği\r\n"
                        		+ "");
                    } else {
                        System.out.println("Istenilenleri lutfen dogru giriniz.");
                    }
                } else if (gelenYas > 25 && gelenYas <= 35) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenYas == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas > 35 && gelenYas < 55) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("Kahvaltı\r\n"
                        		+ "\r\n"
                        		+ "1 dіlіm pеynіr ya da 1 tаnе yumurta\r\n"
                        		+ "2 tаnе dіlіm еkmеk (kеpеklі vеyа çаvdаr olаbіlіr)\r\n"
                        		+ "Bolcа mаydаnoz, rokа vе dеrеotu, tеrе limon soslu\r\n"
                        		+ "4 tаnе zеytіn yağsız olmalı\r\n"
                        		+ "Şеkеrsіz çаy ya da bitki çayı\r\n"
                        		+ "\r\n"
                        		+ "Ara Öğün\r\n"
                        		+ "\r\n"
                        		+ "1 çаy bаrdаğı süt\r\n"
                        		+ "Süt kahveli ya da tarçınlı içilebilir.\r\n"
                        		+ "\r\n"
                        		+ "Öğle\r\n"
                        		+ "\r\n"
                        		+ "Izgаrа еt (Tаvuk, bаlık, kırmızı еt)\r\n"
                        		+ "1 tаnе dіlіm еkmеk (kеpеklі ya da çаvdаr)\r\n"
                        		+ "Yağsız bol sаlаtа limon soslu ve baharatlı\r\n"
                        		+ "1 bаrdаk tuzsuz аyrаn\r\n"
                        		+ "\r\n"
                        		+ "İkindi\r\n"
                        		+ "\r\n"
                        		+ "1 bаrdаk yoğurt vе 2 kаşık yulаf tarçın eklenebilir\r\n"
                        		+ "1 tane mеvsіm mеyvеsі\r\n"
                        		+ "\r\n"
                        		+ "Αkşam\r\n"
                        		+ "\r\n"
                        		+ "1 kаsе çorbа\r\n"
                        		+ "5 kаşık zеytіn yаğlı yеmеk\r\n"
                        		+ "1 kаsе yoğurt vе\r\n"
                        		+ "1 аdеt mevsim meyvesi\r\n"
                        		+ "");
                    }
                } else if (gelenYas >= 55) {
                    if (gelenCinsiyet == 0 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else if (gelenCinsiyet == 1 && vucutKitleIndeks(gelenKilo, gelenBoy) > 20) {
                        System.out.println("cikan sonuclara gore hastalığınıza uygun kilo verme diyeti asagidaki menudedir.");
                        System.out.println("Gunluk su ve kalori ihtiyacinizda diyet menunuz ile birlikte verilmistir.");
                        System.out.println("KAHVALTI: 50 Gr az tuzlu ve yağlı peynir, 2 Dilim ekmek, 1 Adet haşlanmış yumurta, 2 Yemek kaşığı bal ya da reçel, 1 Bardak sıcak bitki çayı.\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "\r\n"
                        		+ "ÖĞLE: 1 Porsiyon etli sebze yemeği (Sevmeyenler et yemeği ya da sadece sebze yemeği olarak tüketebilir), 1 Porsiyon sütlü tatlı, 2 Dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 50 Gr az tuzlu ve yağlı peynir, 1 Adet galeta\r\n"
                        		+ "\r\n"
                        		+ "AKŞAM: 1 Kase çorba, 1 Porsiyon etli sebze yemeği (Öğle yemeğinde ki seçenek geçerli), 5 Kaşık pilav ya da makarna, 1 Kase yoğurt, Salata ve 1 dilim ekmek\r\n"
                        		+ "\r\n"
                        		+ "ARA: 1 Tane meyve\r\n"
                        		+ "");
                    } else {
                        System.out.println("15 yasindan kucukler icin sistemimiz uygun degildir.");
                    }
                }
            }
        }
    }
}
