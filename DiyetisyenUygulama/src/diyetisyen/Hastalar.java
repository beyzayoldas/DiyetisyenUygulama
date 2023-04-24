package diyetisyen;

public class Hastalar {
	private String ad;
    private String soyad;
    private int cinsiyet;
    private int yas;
    private double kilo;
    private double boy;
    private double aktiviteDurumu;
    private boolean hastalik;

    public Hastalar() {
    }

    public Hastalar(String ad, String soyad, int cinsiyet, int yas, double kilo, double boy, double aktiviteDurumu, boolean hastalik) {
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
        this.aktiviteDurumu = aktiviteDurumu;
        this.hastalik = hastalik;
    }

    public double getAktiviteDurumu() {
        return aktiviteDurumu;
    }

    public void setAktiviteDurumu(double aktiviteDurumu) {
        if (aktiviteDurumu == 1 || aktiviteDurumu == 2 || aktiviteDurumu == 3)
            this.aktiviteDurumu = aktiviteDurumu;
        else {
            throw new IllegalArgumentException("Aktivite durumu 1,2 veya 3 olmalidir!");
        }
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public boolean isHastalik() {
        return hastalik;
    }

    public void setHastalik(boolean hastalik) {
        this.hastalik = hastalik;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(int cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public boolean hastalikVarMi(boolean hastalik) {
        return hastalik;
    }

	public double gunlukSuIhtiyaci(double kilo) {
		return 0;
	}
}
