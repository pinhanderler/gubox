import  java.util.Scanner;

public class Login {
    private Scanner input;
    
    public boolean login(Hesap hesap) {
        
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullanici Adı: ");
        kullanici_adi = input.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        parola = input.nextLine();
        
        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
          return true;
        }
        else{
            return false;
        }
    
    } 
}