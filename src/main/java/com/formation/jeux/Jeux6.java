package com.formation.jeux;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jeux6 {
    public void Jeux6() {
    }

    String Original_Message, Encrypted_Message = "";
    String messageCrypte;
    int Cipher_Key;
    char Message_Char;

    /**
     * méthode qui chiffre un message d'après une clé donné
     */
    public void Caesar_Cipher_Encrypt(String... s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a message: ");
        Original_Message = sc.nextLine();
        System.out.println("Enter the key: ");
        Cipher_Key = sc.nextInt();

        for (int i = 0; i < Original_Message.length(); ++i) {
            Message_Char = Original_Message.charAt(i);
            if (Message_Char >= 'a' && Message_Char <= 'z') {
                Message_Char = (char) (Message_Char + Cipher_Key);

                if (Message_Char > 'z') {
                    Message_Char = (char) (Message_Char - 'z' + 'a' - 1);
                }

                Encrypted_Message += Message_Char;
            } else if (Message_Char >= 'A' && Message_Char <= 'Z') {
                Message_Char = (char) (Message_Char + Cipher_Key);

                if (Message_Char > 'Z') {
                    Message_Char = (char) (Message_Char - 'Z' + 'A' - 1);
                }

                Encrypted_Message += Message_Char;
            } else {
                Encrypted_Message += Message_Char;
            }
        }
        System.out.println("The Encrypted Message is : " + Encrypted_Message);
        this.messageCrypte = Encrypted_Message;
    }

    /**
     * méthode qui déchiffre un message d'après la clé utilisé pour le chiffré
     */
    public void Caesar_Cipher_Decrypt(String... s) {
        String Original_Message, Decrypted_Message = "";
        int Cipher_Key;
        char Message_Char;
        Scanner sc = new Scanner(System.in);

        // System.out.println("Please enter an encrypted message: ");
        Original_Message = this.messageCrypte;

        // System.out.println("Enter the key: ");
        // Cipher_Key = sc.nextInt();

        for (int i = 0; i < Original_Message.length(); ++i) {
            Message_Char = Original_Message.charAt(i);
            if (Message_Char >= 'a' && Message_Char <= 'z') {
                Message_Char = (char) (Message_Char - this.Cipher_Key);

                if (Message_Char < 'a') {
                    Message_Char = (char) (Message_Char + 'z' - 'a' + 1);
                }

                Decrypted_Message += Message_Char;
            } else if (Message_Char >= 'A' && Message_Char <= 'Z') {
                Message_Char = (char) (Message_Char - this.Cipher_Key);

                if (Message_Char < 'A') {
                    Message_Char = (char) (Message_Char + 'Z' - 'A' + 1);
                }

                Decrypted_Message += Message_Char;
            } else {
                Decrypted_Message += Message_Char;
            }
        }
        System.out.println("The Decrypted Message is : " + Decrypted_Message);
    }
}
