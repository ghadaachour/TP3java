/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3java;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author chams
 */
public class FileHander {
    private String filePath;
    private Integer fileSizeInKb;
    private Integer numberOfLines;
    private ArrayList<String> fileContent;
     public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getFileSizeInKb() {
        return fileSizeInKb;
    }

    public void setFileSizeInKb(Integer fileSizeInKb) {
        this.fileSizeInKb = fileSizeInKb;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public ArrayList<String> getFileContent() {
        return fileContent;
    }

    public void setFileContent(ArrayList<String> fileContent) {
        this.fileContent = fileContent;
    }
    private void readFile(File fichier){
  this.fileContent=new ArrayList<>();
     try { 
         this.fileSizeInKb=(int) fichier.length()/1024;
         this.numberOfLines=0;
    
       Scanner r = new Scanner(fichier);
        
        String scan;
        while(r.hasNextLine()) {
            scan = r.nextLine();
           
             this.numberOfLines++;
                this.fileContent.add(scan);
        }
       
         } catch (FileNotFoundException ex) {
        Logger.getLogger(FileHander.class.getName()).log(Level.SEVERE, "le fichier n'existe pas", ex);
    }
       

}
   
public FileHander(String filePath){
    File fichier =new File(filePath);
   if(fichier.exists()){
       
   this.filePath= filePath;
  this.readFile(fichier);
   }
   else{
       System.out.println("le fichier n'existe pas");
   }

}

public ArrayList<String> findLinesWithPattern(String pattern){
    //parcourir chaque ligne du contenu du fichier et utilise une expression régulière pour vérifier si le motif est présent dans chaque ligne.
    //Si une correspondance est trouvée, la ligne est ajoutée à une liste
    ArrayList<String> liste=new ArrayList<String>();
    for(String line :this.fileContent){
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(line);
if (matcher.find()) {
    liste.add(line);
}
    }
    
    return liste;
    
}
 public boolean compareString1(String str1,String str2){
    return str1==str2;
    
 }
 public boolean compareString2(String str1,String str2){
  
     return str1.equalsIgnoreCase(str2);
 }
 public boolean compareString3(String str1,String str2){
  
      return str1.equals(str2);
   
 }
public void reverseString(int lineIndex){
    
  String a =  this.fileContent.get(lineIndex);
 StringBuilder S = new StringBuilder();
 
        
        S.append(a);
 
        S.reverse();
        
       this.fileContent.set(lineIndex, S.toString()) ;
        Path pa = Paths.get(this.filePath); 
        try {
      Files.write(pa,this.fileContent,StandardCharsets.UTF_8);
      } catch (IOException e) {
            e.printStackTrace();
            //écrire le contenu modifié de fileContent dans le fichier spécifié par filePath 
            // j'ai utilisé l'encodage UTF-8 pour écrire le fichier
        }
}
public void removeDuplicates(int lineIndex){
   
 if (lineIndex >= 0 && lineIndex < numberOfLines) {
            String line = fileContent.get(lineIndex);
            StringBuilder clean = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char Char = line.charAt(i);
                if (clean.indexOf(String.valueOf(Char)) == -1) {
                    clean.append(Char);
                }
            }
            fileContent.set(lineIndex, clean.toString());
           
        } 
    }

    String CompareStrings1(String str1, String str2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String CompareStrings3(String str3, String str5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String CompareStrings2(String str6, String str7) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}


   
    