/**
 * Ad Soyad: Süleyman DENİZHAN
 * Kullanıcı No : 
 * Program Tanımı : Java Programla 3. Ödev - Java Sayı Tahmin Oyunu
 */
package btspsayitahminoyunu;

import javax.swing.JOptionPane;

public class BtspSayiTahminOyunu {

    public static void main(String[] args) {
        
        int rastgeleSayi = 1 + (int) (Math.random() * 100);
        boolean tahminDurum = false;
        int tahminSayisi = 1;
        String message = "";
        
        JOptionPane.showMessageDialog(null, "1 ile 100 Arasında Bir Sayı Tuttum.");
        JOptionPane.showMessageDialog(null, "Sayıyı Tahmin Edebilir misin?");
        JOptionPane.showMessageDialog(null, "Hadi ilk tahminini yap!");         
        
        do {
            
            String kullaniciSayisi = JOptionPane.showInputDialog(null, "Sayınızı Giriniz");
            int reelSayi = Integer.parseInt(kullaniciSayisi);
            
            if ( reelSayi != rastgeleSayi )
            {
                if ( reelSayi < rastgeleSayi )
                {
                    message = "Az Söyledin ! Tekrar Dene !";
                }
                else
                {
                    message = "Çok Söyledin ! Tekrar Dene !";
                }
                
                JOptionPane.showMessageDialog(null, message, "Hatalı Tahmin", JOptionPane.ERROR_MESSAGE);
                tahminDurum = false;
            }
            else
            {
                message = "Harika ! Sayıyı Bildin ! "+ tahminSayisi +" Tahminde Buldun!";
                JOptionPane.showMessageDialog(null, message, "Bravo!", JOptionPane.INFORMATION_MESSAGE);
                tahminDurum = true;
            }
            
            tahminSayisi++;
            
        } while ( tahminDurum == false);
    }
}
