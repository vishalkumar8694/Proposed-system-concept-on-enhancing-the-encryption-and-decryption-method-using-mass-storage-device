/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author MADHURENDRA PURBAY
 */
public class Decryption_file {
     public static void  decryption_Dec() {
    String key =Decryption.a;
        File encryptedFile = new File(Decryption.path);
      // File encryptedFile = new File("document.jpg");
              String name=encryptedFile.getName();
      System.out.println("madhu mkp"+Decryption.path);
    File decryptedFile = new File("actual__"+name);
         
        try {
  //          CryptoUtils.encrypt(key, inputFile, encryptedFile);
       CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
                JOptionPane.showMessageDialog(null,"Decryption Sucessfull");

        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
