
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        
        var input = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz...");
        
        System.out.println("*************************");
        System.out.println("Kullanici Girişi");
        System.out.println("*************************");
        int giris_hakki = 3;
        
        while (true) {  
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı...");
                break;
                
            }
            else{
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkınız: " + giris_hakki);
                
            }
            if(giris_hakki == 0){
            
                System.out.println("Giriş Hakkınız Bitti.Daha sonra tekrar deneyin...");
                return;
            }
            
        }
        System.out.println("************************************");
        String islemler = "1. Bakiye Görüntüle\n"
                        + "2. Para Yatırma\n"
                        + "3. Para Çekme\n"
                        + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {
            System.out.println("İşlem Seçiniz:");
            String islem = input.nextLine();
            
            if (islem.equals("q")) {
                
                break;
                
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
                
            }
            else if (islem.equals("2")) {
                
                System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: ");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.ParaYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.print("Çekmek İstediğiniz Tutarı Giriniz:");
                
                
                int tutar = input.nextInt();
                input.nextLine();
                hesap.ParaCekme(tutar);

            }
            else{
                System.out.println("Geçersiz İşlem");
            }
            
        }
        
        
    }
}