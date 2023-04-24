package diyetisyen;

public interface IHesaplamalar {
	 double vucutKitleIndeks(double kilo,double boy);
		
		double gunlukSuIhtiyaci(double kilo);
		
		double kaloriIhtiyaci(double kilo,double boy,int yas,int cinsiyet,double aktiviteDurumu);

	    double bazalMetabolizmaHesapla(double kilo, double boy, int yas, int cinsiyet);
}

