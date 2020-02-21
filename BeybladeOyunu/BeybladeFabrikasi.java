import java.util.Scanner;


public class BeybladeFabrikasi {

	public Beyblade BeybladeUret(String beyblade_turu){
		
		if(beyblade_turu.equals("Dranza")){
			return new Dranza("Kai",600,400,"Kirmizi Anka Kusu");
		}
		else if(beyblade_turu.equals("Dragon")){
			return new Dragon("Takao",800,300,"Mavi ejderha","Kutsal Canavarla konusma");
		}
		else if(beyblade_turu.equals("Drayga")){
			return new Drayga("Rei",800,250,"Beyaz Kaplan");
		}
		else if(beyblade_turu.equals("Draciel")){
			return new Draciel("Max",400,1000,"Kara Kaplumbaga");
		}
		else{
			return null;
		}
		
	}
public Beyblade Diablo_uret(){
	
	return new DiabloNemesis("rago",600,1000,"Nemesis");
}
	
public Beyblade BeybladeUretsec(){
		
		System.out.println("1-Dranza olustur\n"
					    + "2-Dragon olustur\n"
					    + "3.Drayga olustur\n"
					    + "4.Draciel olusur");
		Scanner scan = new Scanner(System.in);
		
		String islem = scan.next();
		
	
		if(islem.equals("1")){
			return new Dranza("Kai",600,400,"Kirmizi Anka Kusu");
		}
		else if(islem.equals("2")){
			return new Dragon("Takao",800,300,"Mavi ejderha","Kutsal Canavarla konusma");
		}
		else if(islem.equals("3")){
			return new Drayga("Rei",800,250,"Beyaz Kaplan");
		}
		else if(islem.equals("4")){
			return new Draciel("Max",1000,200,"Kara Kaplumbaga");
		}
		else{
			return null;
		}
		
	}
	
}
