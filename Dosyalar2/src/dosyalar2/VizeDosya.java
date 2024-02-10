/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosyalar2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class VizeDosya {
    
    public static String ad;
    public static String soyad;
    public static String bölüm;
    public static String sınıf;
    public static int vize;
    public static int fnal;
    
    public void  dosyaOku(String file) throws FileNotFoundException{
        File f = new File(file);
        Scanner reader = new Scanner(f);
        while(reader.hasNext()){
            ad = reader.next();
            soyad = reader.nextLine();
            System.out.println("\t"+ad+" "+soyad);
            for(int i=0;i<5;i++){
                bölüm = reader.next()+" "+reader.next();
                sınıf = reader.next();
                vize = reader.nextInt();
                fnal = reader.nextInt();
                
            }
            
            System.out.println(bölüm+" "+sınıf+" "+vize+" "+fnal);
        }
    }
    public void dosyaYaz(File file) throws FileNotFoundException, IOException{
        File f = new File("vize fixed.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        
    }
   
    public static void main(String[] args) throws FileNotFoundException {
     VizeDosya vd  =new VizeDosya();
     vd.dosyaOku("vize.txt");
    
    }
    
}