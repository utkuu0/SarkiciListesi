package SarkiciListesi;

import java.util.Scanner;

public class Main {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner s = new Scanner(System.in);

    public static void islemleri_bastir() {

        System.out.println("\t 0- işlemleri görüntüle");
        System.out.println("\t 1- şarkıcıları görüntüle");
        System.out.println("\t 2- şarkıcı ekle");
        System.out.println("\t 3- şarkıcı güncelle");
        System.out.println("\t 4- şarkıcı sil");
        System.out.println("\t 5- şarkıcı ara");
        System.out.println("\t 6- uygulamadan çık");
    }

    public static void goruntule() {

        sarkicilar.sarkicilari_bastir();
    }
    
    public static void sarkici_ekle() {
        
        System.out.println("Eklemek istediğiniz şarkıcının ismi");
        
        String isim = s.nextLine();
        
        sarkicilar.sarkici_ekle(isim);
    }
    
    public static void sarkici_guncelle() {
        
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3)");
        
        int pozisyon = s.nextInt();
        s.nextLine();
        
        String yeni_isim = s.nextLine();
        
        sarkicilar.sarkici_güncelle(yeni_isim, (pozisyon - 1));
    }
    
    public static void sil(){
        
        System.out.println("silmek istediğiniz pozisyon (1,2,3)");
        
        int pozisyon = s.nextInt();
        sarkicilar.sarkici_cikar((pozisyon - 1));
    }
    
    public static void ara(){
        
        System.out.println("Aramak istediğiniz şarkıcı");
        
        String isim = s.nextLine();
        
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) {

        System.out.println("\t Şarkıcı uygulamasına hoş geldiniz.");

        islemleri_bastir();

        boolean cikis = false;

        int islem;

        while (!cikis) {

            System.out.println("bir işlem seçiniz:");

            islem = s.nextInt();
            s.nextLine();

            switch (islem) {

                case 0: {

                    islemleri_bastir();
                    break;
                }

                case 1: {

                    goruntule();
                    break;
                }

                case 2: {

                    sarkici_ekle();
                    break;
                }

                case 3: {

                    sarkici_guncelle();
                    break;
                }

                case 4: {

                    sil();
                    break;
                }

                case 5: {

                    ara();
                    break;
                }

                case 6: {

                    cikis = true;
                    System.out.println("utgulamadan çıkılıyor");
                    break;
                }
            }
        }
    }
}