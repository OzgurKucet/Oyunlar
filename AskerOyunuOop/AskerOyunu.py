# -*- coding: utf-8 -*-
"""
Created on Sun Mar 29 19:24:58 2020

@author: Ozgur Kucet
"""

import random,os

turSayısı = 1

class Düşman():
    def __init__(self):
        x = turSayısı*10
        y = turSayısı*2
        self.sağmi = True
        self.saglık = random.randint(30,70+x)
        self.kalkan = random.randint(0,10+turSayısı)
        self.guc = random.randint(20,50+y)
        
    def vur(self,player):
        damage = self.guc - player.kalkan
        player.saglık -= damage
        kalkanDamage = int(player.guc/20)
        if self.kalkan > 0:
            self.kalkan -= kalkanDamage
        if self.kalkan < 0:
            self.kalkan = 0
        if player.saglık <= 0:
            player.sağmi = False

class Player():
    def __init__(self):
        self.sağmi = True
        self.saglık = 5000
        self.kalkan = 30
        self.guc = 55
        
    def vur(self,düşman):
        damage = self.guc - düşman.kalkan
        kalkanDamage = int(düşman.guc/20)
        düşman.saglık -= damage
        if self.kalkan > 0:
            self.kalkan -= kalkanDamage
        if self.kalkan < 0:
            self.kalkan = 0
        if düşman.saglık <= 0:
            düşman.sağmi = False
            düşmanlar.remove(düşman)

düşmanlar = list()

for i in range(10):
    düşmanlar.append(Düşman())

player = Player()

while True:
    os.system("clear")
        
    if player.sağmi == False:
        print("Game Over! :( ")
        break
    if not düşmanlar and turSayısı == 10:
        print("Kazandınız Tebrikler...")
        break
    if not düşmanlar:
        print("{}.round sona erdi".format(turSayısı))
        turSayısı+=1
        player.saglık+=200
        player.kalkan+=15
        while True:
            sec = int(input("Bu el hangi özelliği almak istiyorsun ?\n1.+10 kalkan 2.200 can 3.+10 vuruş"))
            if sec == 1:
                player.kalkan += 10
                break
            if sec == 2:
                player.saglık+= 200
                break
            if sec == 3:
                player.guc += 10
                break            
            
        for i in range(10):
            düşmanlar.append(Düşman())
        
    print("Player Durumu--->>> Sağlık:{} ------ Güç:{} ----- Kalkan:{}".format(player.saglık,player.guc,player.kalkan))
    
    for i in düşmanlar:
        print("{}.Düşman--->>> Sağlık:{} ------ Güç:{} ----- Kalkan:{}".format(düşmanlar.index(i)+1,i.saglık,i.guc,i.kalkan ))                
    
    secim = int(input("Düşman seçiniz"))
    düşman = düşmanlar[secim-1]
    player.vur(düşman)
    
    if düşmanlar:
        saldıran = düşmanlar[random.randint(0,len(düşmanlar)-1)]
        saldıran.vur(player)
    
        
        
        
        

