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
public class Encryption_file {
    
    public static void  encryption_Dec() {
    String key =Encryption.a;
        File inputFile = new File(Encryption.path);
        String name=inputFile.getName();
        File encryptedFile = new File(name);
  //      File decryptedFile = new File("document1.jpg");
         
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
         //   CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
         JOptionPane.showMessageDialog(null,"Encryption Sucessfull");
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
