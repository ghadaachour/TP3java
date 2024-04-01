/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3java;

import java.util.ArrayList;

/**
 *
 * @author GHADA
 */
public class Ouexclusif {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatto
 */
    
 private String key ;
  public Ouexclusif(String key) {
    this.key = key ;
  
  }
  
  
   public String chiffrement (String plaintext) {
     StringBuilder sb = new StringBuilder();
  for (int i=0; i < plaintext.length(); i++) {
       sb.append((char) (plaintext.charAt(i)^ key.charAt(i % key.length())));
}
String result = sb.toString();
return result;
  }

    
     public String dechiffrement (String ciphertext) {
       StringBuilder sb = new StringBuilder();
       for (int i=0; i < ciphertext.length(); i++) {
         sb.append((char) (ciphertext.charAt(i)^ key.charAt(i % key.length())));
}
String result=sb.toString();
return result ;
}   

   
}

    
    

