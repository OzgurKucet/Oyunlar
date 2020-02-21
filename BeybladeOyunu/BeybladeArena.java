import java.util.Random;
import java.util.Scanner;


public class BeybladeArena {
	
	public void Savas(Beyblade beyblade1,Beyblade beyblade2){
		
		System.out.println("-----------------------------");
		System.out.println("Savassacak Beybladeler");
		System.out.println();
		beyblade1.bilgileri_goster();
		System.out.println();
		beyblade2.bilgileri_goster();
		System.out.println("-----------------------------");
		
		int i=1;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String islem = "1.saldir\n"
				+ "2.birsey yapma\n"
				+ "3.savun\n";
		
		int canavar_kullanma_hakký=1;
		int bot_canavar_hakký=1;
		int gizli_yetenek =1;
		
		while(beyblade1.getDonus_hizi()>0 && beyblade2.getDonus_hizi()>0){
			
			int secilen;
			int secilen_bot;
			
			while(true){
				System.out.println("-----------------------");
				System.out.println(i + " ninci el");
				System.out.println("-----------------------");
				if(i>3 && canavar_kullanma_hakký == 1){
					System.out.println("Canavarlar cagrýlabilir...");
				}
				System.out.println(islem);
				if(i>3 && canavar_kullanma_hakký == 1){
					System.out.println("4.Canavar cagirma");
				}
				if(i>6 && gizli_yetenek ==1 && beyblade1 instanceof Dragon){
					System.out.println("5.Gizli yetenek cagirma");
				}
				System.out.print("islemi girin:");
				secilen = scan.nextInt();
				secilen_bot = rand.nextInt(3)+1;
				if(i>3 && bot_canavar_hakký > 0){
					secilen_bot = rand.nextInt(4)+1;
				}
				
				if(secilen == 4 && canavar_kullanma_hakký == 1){
					break;
				}
				else if(secilen == 4 && canavar_kullanma_hakký !=1){
					continue;
				}
				else if(i>6 && gizli_yetenek ==1 && beyblade1 instanceof Dragon && secilen==5){
					break;
				}
				else if(secilen > 3 || secilen < 0){
					System.out.println("birdaha girin yanlýs secim.");
					continue;
				}
				i++;
				break;
			}
			
			if(secilen == 3 && secilen_bot == 3){
				
			}			
			else if(secilen == secilen_bot){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/14);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/14);
							
			}
			else if(secilen == 1 && secilen_bot == 2){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/14);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/7);
			}
			else if(secilen == 1 && secilen_bot == 3){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/7);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/14);
			}
			else if(secilen == 2 && secilen_bot == 1){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/7);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/14);
			}
			else if(secilen == 2 && secilen_bot == 3){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/14);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/7);
			}
			else if(secilen == 3 && secilen_bot == 1){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/14);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/7);
			}
			else if(secilen == 3 && secilen_bot == 2){
				beyblade1.yenilen_sayi(beyblade2.getSaldiri_gucu()/7);
				beyblade2.yenilen_sayi(beyblade1.getSaldiri_gucu()/14);
			}
			if(i>3){
				if(secilen == 4){
					beyblade1.kutsal_canavari_ortaya_cikar();
					beyblade2.yenilen_sayi(beyblade1.canavarvurus());
					canavar_kullanma_hakký--;
				}
				if(secilen_bot==4){
					beyblade2.kutsal_canavari_ortaya_cikar();
					beyblade1.yenilen_sayi(beyblade2.canavarvurus());
					bot_canavar_hakký--;
				}
				if(secilen == 5){
					beyblade1.Gizli_yetenek();
					gizli_yetenek--;
				}
								
			}
			
			System.out.println();

			
			
			if(secilen ==3 && secilen_bot==3){
				System.out.println("2 beyblade savunma yaptý saldýrý olmadý...");
							
			}
			else if(secilen == 1 && secilen_bot == 2){
				System.out.println(beyblade1.getBeybladeci() + "Saldiriyi secti...");
				System.out.println(beyblade2.getBeybladeci() + "Birsey yapmadý...");
				System.out.println(beyblade2.getBeybladeci()+ "nin yedigi hasar 2 ile carpildi...");
			}
			else if(secilen == 1 && secilen_bot == 3){
				System.out.println(beyblade1.getBeybladeci() + "Saldiriyi secti...");
				System.out.println(beyblade2.getBeybladeci() + "Savunma yaptý...");
				System.out.println(beyblade1.getBeybladeci()+ "nin yedigi hasar 2 ile carpildi...");
			}
			else if(secilen == 2 && secilen_bot == 1){
				System.out.println(beyblade1.getBeybladeci() + "Durmayý secti...");
				System.out.println(beyblade2.getBeybladeci() + "Saldiri yapti...");
				System.out.println(beyblade1.getBeybladeci()+ "nin yedigi hasar 2 ile carpildi...");
			}
			else if(secilen == 2 && secilen_bot == 3){
				System.out.println(beyblade1.getBeybladeci() + "Durmayý secti...");
				System.out.println(beyblade2.getBeybladeci() + "Savunma yaptý...");
				System.out.println(beyblade2.getBeybladeci()+ "nin yedigi hasar 2 ile carpildi...");
			}
			else if(secilen == 3 && secilen_bot == 1){
				System.out.println(beyblade1.getBeybladeci() + "Savunmayý secti...");
				System.out.println(beyblade2.getBeybladeci() + "Saldýrýyý secti...");
				System.out.println(beyblade2.getBeybladeci()+ "nin yedigi hasar 2 ile carpildi...");
			}
			else if(secilen == 3 && secilen_bot == 2){
				System.out.println(beyblade1.getBeybladeci() + "Savunmayý secti...");
				System.out.println(beyblade2.getBeybladeci() + "Durmayý secti...");
				System.out.println(beyblade1.getBeybladeci()+ "nin yedigi hasar 2 ile carpildi...");
			}
			
			
			System.out.println("-----------------------------");
			System.out.println("Savas sonrasý Beybladeler");
			System.out.println();
			beyblade1.bilgileri_goster();
			System.out.println();
			beyblade2.bilgileri_goster();
			System.out.println("-----------------------------");
			
			
		}
		
		
		if(beyblade1.getDonus_hizi() < 0 && beyblade2.getDonus_hizi() <0){
			System.out.println("------------------");
			System.out.println("Berabere Kaldý...");
			System.out.println("------------------");
		}
		
		else if(beyblade1.getDonus_hizi() < 0){
			System.out.println("------------------");
			System.out.println("Kaybettiniz...");
			System.out.println("------------------");
		}
		else{
			System.out.println("------------------");
			System.out.println("Kazandýnýz...");
			System.out.println("------------------");
		}
		
		
	}

}
