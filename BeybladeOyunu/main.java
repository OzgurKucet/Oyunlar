import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		//
		
		BeybladeFabrikasi beyblade = new BeybladeFabrikasi();
		BeybladeArena arena  = new BeybladeArena();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir gün bir göktaþý dünyaya çarpar ve 10 parçaya bölünüp, "
				+ "beybladelere inanýlmaz güc verir.\nBu gücler efsanevi beybladeçileri uyandýrýr.\n"
				+ "Bu parçacýktan 4'ü ,4 mevsim evsanevi beybiladelere,5 i,efsanevi beybladelere "
				+ "ve kalan 1 parçacýksa,nemessise geçer.\nEfsanevi beybladeçiler,nemessisin mühürlenmesi "
				+ "için birleþib onu durdurmaya çalýþýr\n");
		
		System.out.println("Nemesis:Ünvaný:Yýkým Efendisi Ünvaný:EN GÜÇLÜ BEYBLADE \nHakkýnda:"
				+ "Radesin beybladesidir.Ama yýkým efendisi diablo nemesis yenilince mühürlenir.\n"
				+ "Ama sonra diablo nemesisin mühürlenme süresi dolar.\nArtýk Diablo Nemesis ragonun "
				+ "beyblade i olmuþtur");
		
		System.out.println("Su anda Nemessise karsi kaznamazsýn...\n"
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
