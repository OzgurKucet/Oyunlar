# -*- coding: utf-8 -*-

"""
Created on Sun Mar 22 17:48:30 2020

@author: Ozgur Kucet

Herkesin gazetede en az bir kere oynadığı klasik bulmaca oyunu.
soldan - sağa  ,  sağdan - sola  ,  yukarıdan - aşağıya  , aşağıdan -yukarıya
sıralanmış kelimeleri bulmaya çalıştığımız bir oyun...



"""
import random

def KelimeMatristeVarMı(matris,kelime):
   
    for i in range(len(matris)):        
         k = 0
         for j in range(len(matris[i])):
             t = j
             while kelime[k] == matris[i][t]:
                 t+=1
                 k+=1
                 if t == len(matris):
                     break
                 if(k == len(kelime)):
                     return 1
                
    for i in range(len(matris)):        
        k = 0
        for j in range(len(matris[i])-1,-1,-1):
            t = j
            while kelime[k] == matris[i][t]:
                t+=-1
                k+=1
                if t == 0:
                    break
                if(k == len(kelime)):
                    return 1            
 
    for i in range(len(matris)):        
        k = 0
        for j in range(len(matris[i])):
            t = i
            while kelime[k] == matris[t][j]:
                t+=1
                k+=1
                if t == 0:
                    break
                if(k == len(kelime)):
                    return 1   
                
    for i in range(len(matris)):        
        k = 0
        for j in range(len(matris[i])-1,-1,-1):
            t = i
            while kelime[k] == matris[t][j]:
                t+=-1
                k+=1
                if t == 0:
                    break
                if(k == len(kelime)):
                    return 1  
                
    return 0                

def KelimeMatriseSığıyorMuSoldanSaga(matris,kelime,satir,sütun):
    for i in range(len(kelime)):
        try:
            if matris[satir][sütun] != None:
                return -1
        except IndexError:
            return -1
        sütun+=1
    return 1   
        
def MatriseKelimeEkleSoldanSaga(matris,kelime):
    for i in range(30):        
        satir = random.randint(0,len(matris))
        sütun = random.randint(0,len(matris[0]))   
        if KelimeMatriseSığıyorMuSoldanSaga(matris, kelime, satir, sütun) == 1:
            for i in kelime:
                matris[satir][sütun] = i
                sütun+=1
            return 1        
    return 0


def KelimeMatriseSığıyorMuSagdanSola(matris,kelime,satir,sütun):
    for i in range(len(kelime)):
        try:
            if sütun < 0:
                return -1
            if matris[satir][sütun] != None:
                return -1
        except IndexError:
            return -1
        sütun-=1
    return 1   
        
def MatriseKelimeEkleSagdanSola(matris,kelime):
    for i in range(30):        
        satir = random.randint(0,len(matris))
        sütun = random.randint(0,len(matris[0]))   
        if KelimeMatriseSığıyorMuSagdanSola(matris, kelime, satir, sütun) == 1:
            for i in kelime:
                matris[satir][sütun] = i
                sütun-=1
            return 1        
    return 0

def KelimeMatriseSığıyorMuYukarıdanAs(matris,kelime,satir,sütun):
    for i in range(len(kelime)):
        try:
            if matris[satir][sütun] != None:
                return -1
        except IndexError:
            return -1
        satir+=1
    return 1   
        
def MatriseKelimeEkleYukarıdanAs(matris,kelime):
    for i in range(30):        
        satir = random.randint(0,len(matris))
        sütun = random.randint(0,len(matris[0]))   
        if KelimeMatriseSığıyorMuYukarıdanAs(matris, kelime, satir, sütun) == 1:
            for i in kelime:
                matris[satir][sütun] = i
                satir+=1
            return 1        
    return 0


def KelimeMatriseSığıyorMuAsagıdanYu(matris,kelime,satir,sütun):
    for i in range(len(kelime)):
        try:
            if satir < 0:
                return -1
            if matris[satir][sütun] != None:
                return -1
        except IndexError:
            return -1
        satir-=1
    return 1   
        
def MatriseKelimeEkleAsagıdanYu(matris,kelime):
    for i in range(30):        
        satir = random.randint(0,len(matris))
        sütun = random.randint(0,len(matris[0]))   
        if KelimeMatriseSığıyorMuAsagıdanYu(matris, kelime, satir, sütun) == 1:
            for i in kelime:
                matris[satir][sütun] = i
                satir-=1
            return 1        
    return 0


def MatriseKelimeAt(matris):
    with open("1.txt","r",encoding='utf8') as dosya:
        tümKelimeler = []
        matrisKelimeleri = []
        icerik = dosya.read()
        tümKelimeler = icerik.lower().split()
        kelimeSayisi = 0
        while kelimeSayisi != 10:
            randomKelime = tümKelimeler[random.randint(0,len(tümKelimeler)-1)]
            sayi = random.randint(0,4)
            if sayi == 0:
                if MatriseKelimeEkleSoldanSaga(matris,randomKelime) == 1:
                    kelimeSayisi+=1
                    matrisKelimeleri.append(randomKelime)
            elif sayi == 1:
                if MatriseKelimeEkleSagdanSola(matris,randomKelime) == 1:
                    kelimeSayisi+=1
                    matrisKelimeleri.append(randomKelime)
            elif sayi == 2:
                if MatriseKelimeEkleYukarıdanAs(matris,randomKelime) == 1:
                    kelimeSayisi+=1
                    matrisKelimeleri.append(randomKelime)
            else:
                if MatriseKelimeEkleAsagıdanYu(matris,randomKelime) == 1:
                    kelimeSayisi+=1
                    matrisKelimeleri.append(randomKelime)
                               
    print()
    """
    for i in range(satir):
        print(matris[i])  
    """
    return matrisKelimeleri        
    
        

harfler = ["a","b","c","ç","d","e","f","g","ğ","h","ı","i","j","k","l",
           "m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z"]


while(True):
    satir = int(input("lütfen satiri ve sütünu giriniz 7 den büyük giriniz..."))
    
    if satir < 7:
        break
    
    matris = [[0 for x in range(satir)]for y in range(satir)] 
    
    for i in range(satir):
        for j in range(satir):
            matris[i][j] = None #harfler[random.randint(0,28)]
    """
    for i in range(satir):
        print(matris[i])
    """
    matrisKelimeleri = MatriseKelimeAt(matris)
    
    
    for i in range(satir):
        for j in range(satir):
            if matris[i][j] == None:    
                matris[i][j] = harfler[random.randint(0,28)]
    
    tanım = "Oyuna hoş geldiniz oyunun 2 seçeneği var 1 e basarsanız verilen kelimeleri"
    tanım2 =" bulmacada bulmanız istenir 2.seçenek ise kelimeler verilmez sizden bulmacadaki"
    tanım3 =" kelimeleri bulmanız istenir..."
    
    print(tanım,tanım2,tanım3)


    secenek = int(input("Lütfen 1.oyun için 1 i 2.oyun için 2 yi tıklayın çıkış için farklı birşey tıklayın..."))
    
    if secenek == 1:
        print("Bulunacak kelimeler:")
        print(matrisKelimeleri)
        for i in range(satir):
            print(matris[i])
        while len(matrisKelimeleri)!=0:
            istenilenKelime = input("lütfen matriste hangi kelimeyi bulduğunuzu yazın...")
            for i in matrisKelimeleri:
                if istenilenKelime == i:
                    matrisKelimeleri.remove(i)
                    print("Doğru buldun")
        print("Oyunu Başarıyla Tamamladınız Tebrikler...")
    
    elif secenek == 2:
        for i in range(satir):
            print(matris[i])
        while len(matrisKelimeleri)!=0:
            istenilenKelime = input("lütfen matriste hangi kelimeyi bulduğunuzu yazın...")
            for i in matrisKelimeleri:
                if istenilenKelime == i:
                    matrisKelimeleri.remove(i)
                    print("Doğru buldun")
        print("Oyunu Başarıyla Tamamladınız Tebrikler...")
        
    else:
        print("Programdan çıkılıyor....")
        break
    
print("Oyun Kapanıyor....") 
