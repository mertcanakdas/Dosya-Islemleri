package dosyalar2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosyalar2 {

    public static void main(String[] args) throws IOException {
        /*  File f = new File("dosyalar2.txt");
        if(!f.exists()){
            f.createNewFile();   
        }
        FileReader fr = new FileReader(f);
        int ascıı = fr.read();
        while(ascıı != -1){
            char k = (char)ascıı;
            System.out.print(k);
            ascıı= fr.read();
           
        } fr.close();
        FileWriter fw = new FileWriter(f);
        fw.write("asddsada");
        fw.close();*/

 /* File f = new File("deneme.txt");
      f.createNewFile();
      FileWriter fw = new FileWriter(f);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("mertcan akdas\n");;
      String cmt = "malatya turgut özal üniverstitesi";
      bw.write(cmt);
      bw.close();
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr, 5);
      String line;
      while((line = br.readLine()) != null){
          System.out.println(line);
          
      }br.close();*/
 /*
        int count = 0;
       File f = new File("sayılar.txt");
       f.createNewFile();
       FileWriter fw = new FileWriter(f);
       BufferedWriter bw = new BufferedWriter(fw);
       for(int j=0;j<10;j++){
       for(int i=0;i<10;i++){
            bw.write(String.valueOf(count)+" ");
           count++;
       }
           System.out.println();
       }
        bw.close();
        FileReader fr = new FileReader(f);
       BufferedReader br = new BufferedReader(fr);
       String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
            if((line = br.readLine()) == null){
                System.out.println("dosya okuma bitti");
            }
        }
        br.close();
       /* if(f.exists()){
            f.delete();
            System.out.println("dosya silindi");
        }*/
 /* File f = new File("dosya.txt");
       if(!f.exists()){
           f.createNewFile();
       }
       FileWriter fw = new FileWriter(f,true);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("merhaba,\njava dosya yazma ve okumaya hoşgeldiniz...\nmertcan akdas");
       bw.close();*/
 /*  Scanner ınput = new Scanner(System.in);
        try {
            System.out.println("1.sayıyı giriniz");
        double n1 = ınput.nextInt();
        System.out.println("2.sayıyı giriniz");
        double n2 = ınput.nextInt();
        
            System.out.println(n1/n2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("işlem bitti");
        }
         */
 /*
            hasNext() - işaretçinin  bir sonraki adımı var mı diye kontrol eder
            hasNextInt() - int mi diye bakar
            hasNextLine() - hasNext ile aynı
            nextLine() - alt satıra geçer
    
         */
        File f = new File("notlar.txt");

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int dönem1;
        int dönem2;
       while(br.readLine() != null ){
        
    }
    }
}
