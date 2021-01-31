
public class Hesap {
    private String kullanici_adi;
    private String parola;
    private int bakiye;
    
    // counstroctur fonksiyonunu tanımladım burada...
    public Hesap(String kullani_adi, String parola, int bakiye){
    
        this.kullanici_adi = kullani_adi;
        this.parola =  parola;
        this.bakiye = bakiye;
    }
    
    // şimdi burada set ve get fonksiyonlarını kullanacağım.
    
    public String getKullanici_adi(){
        return kullanici_adi;
    }
    public void setKullanici_adi(String kullanici_adi){
        this.kullanici_adi = kullanici_adi;
    }
    public String getParola(){
        return parola;
    }
    public void setParola(String parola){
        this.parola = parola;
    }
    public int getBakiye(){
    return bakiye;  
    }
    public void setBakiye(int bakiye){
        this.bakiye = bakiye;
    }
    public void ParaYatir(int tutar){
        bakiye +=tutar;
        System.out.println("Yeni Bakiyeniz:" + bakiye);
    }
    public void ParaCekme(int tutar){
        if(bakiye - tutar < 0){
            System.out.println("Yeterli Bakiye Yok...");
        }
        else{
            bakiye -= tutar;
            System.out.println("Güncel Bakiyeniz: " + bakiye);
        }
    }

    
}