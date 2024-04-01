/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp3java;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author GHADA
 */
//tests dans main
public class TP3java {
public static void main(String[] args) throws FileNotFoundException {
        FileHander fileHandler = new FileHander ("file.log");
        int lineIndexToReverse=1;
        fileHandler.reverseString(lineIndexToReverse);
        int  lineIndexToRemoveDuplicates=2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);
        String pattern="epoch";
        ArrayList<String> linesWithPattern =fileHandler.findLinesWithPattern( pattern );
        String str1="hello";
        String str2="Hello";
        System.out.println("comparaison avec equals :"+fileHandler.CompareStrings1(str1,str2));
        String str5="hello";
        String str6="HELLO";
         System.out.println("comparaison avec equalsIgnoreCase :"+fileHandler.CompareStrings3(str5,str6));
          String str7="hello";
        String str8="hello";
         System.out.println("comparaison avec == :"+fileHandler.CompareStrings2(str7,str8));
         System.out.println("comparaison avec == :"+fileHandler.CompareStrings2(new String ("hello"),"hello"));
         
       System.out.println("comparaison avec == :"+fileHandler.CompareStrings2(new String ("hello"),new String ("hello")));  
        System.out.println("ligne contenant le motif '"+pattern+"':"+linesWithPattern.get(0));  

        
        
        
String key ="secret";
String plaintext ="Hello , world";
   
Ouexclusif Ouexclusif = new Ouexclusif (key);
String encryptedtext = Ouexclusif.chiffrement (plaintext);
System.out.println("Texte chiffré : " + encryptedtext);
String decryptedtext =Ouexclusif.dechiffrement (encryptedtext);
System.out.println("Texte dechiffré: "+ decryptedtext);
        
    }
    
}
