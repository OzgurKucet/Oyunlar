import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		//
		
		BeybladeFabrikasi beyblade = new BeybladeFabrikasi();
		BeybladeArena arena  = new BeybladeArena();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir g�n bir g�kta�� d�nyaya �arpar ve 10 par�aya b�l�n�p, "
				+ "beybladelere inan�lmaz g�c verir.\nBu g�cler efsanevi beyblade�ileri uyand�r�r.\n"
				+ "Bu par�ac�ktan 4'� ,4 mevsim evsanevi beybiladelere,5 i,efsanevi beybladelere "
				+ "ve kalan 1 par�ac�ksa,nemessise ge�er.\nEfsanevi beyblade�iler,nemessisin m�h�rlenmesi "
				+ "i�in birle�ib onu durdurmaya �al���r\n");
		
		System.out.println("Nemesis:�nvan�:Y�k�m Efendisi �nvan�:EN G��L� BEYBLADE \nHakk�nda:"
				+ "Radesin beybladesidir.Ama y�k�m efendisi diablo nemesis yenilince m�h�rlenir.\n"
				+ "Ama sonra diablo nemesisin m�h�rlenme s�resi dolar.\nArt�k Diablo Nemesis ragonun "
				+ "beyblade i olmu�tur");
		
		System.out.println("Su anda Nemessise karsi kaznamazs�n...\n"
				+ "nemesis ile savamak istiyorsan nemesis yaz.. nemesisi gecmek icin baska birsey yaz");
		
		String sec = scan.next();
		
		if(sec.equals("nemesis")){
			System.out.println("Hangi beybladeciyi istiyorsun");
			Beyblade beyblade1 = beyblade.BeybladeUretsec();
			
			Beyblade beyblade2 = beyblade.Diablo_uret();
			arena.Savas(beyblade1, beyblade2);
		}
		
		else{
			System.out.println("Hangi beybladeciyi istiyorsun");
			Beyblade beyblade1 = beyblade.BeybladeUretsec();
			
			System.out.println("Rakibini Sec");
			Beyblade beyblade2 = beyblade.BeybladeUretsec();
			
			arena.Savas(beyblade1, beyblade2);
		}
		
		
		
	}
}
