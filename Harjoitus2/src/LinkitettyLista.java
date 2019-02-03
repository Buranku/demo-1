
public class LinkitettyLista {
	Alkio juuri;
	
	public void lisaa(int a) {
		Alkio a = new Alkio(arvo);
		if(juuri==null) {
			juuri=a;
			return;
		}
		Alkio nykyinen = juuri;
		while(nykyinen.seuraava!=null) {
			nykyinen=nykyinen.seuraava;
		}
		
		nykyinen.asetaSeuraava(a);
	}
	public void poista(int a) {
		Alkio nykyinen = juuri;
		while(nykyinen.seuraava!=null) {
			
		nykyinen=nykyinen.seuraava;
		nykyinen=juuri;
		if(arvo==a) {
			nykyinen.asetaSeuraava(nykyinen.seuraava.seuraava);
		}
		else {
			nykyinen = nykyinen.seuraava;	
		}
		}
	}
	public Alkio etsi(int a) {
		Alkio nykyinen = juuri;
		while(arvo!=a) {
			nykyinen=nykyinen.seuraava;
		}
		if(AlkioArvo==a) {
			return nykyinen;
		}
	}
		
}
