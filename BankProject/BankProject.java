public class BankProject {
    //Benim Algoritma ve Programlama Sınav Sorum - Muhammed Hakan ÇELİK
        
        /**
     *
     */
    private static final Hesap HESAP2 = new Hesap(null, null, 0);

        public static void main(String[] args) {
            
            ATM atm = new ATM();
            Hesap hesap = HESAP2;
            
            atm.calis(hesap);
            System.out.println("Program Çıkılıyor... Güle Güle.");
        }
    }