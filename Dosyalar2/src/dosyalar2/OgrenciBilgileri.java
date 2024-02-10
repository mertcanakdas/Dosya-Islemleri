
package dosyalar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class OgrenciBilgileri {

    
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("bilgiler.txt");
        Scanner reader = new Scanner(f);
        String number;
        String adSoyad;
        String department;
        while(reader.hasNext()){
            number = reader.next();
            adSoyad = reader.next()+" "+reader.next();
            department = reader.next()+" "+reader.next();
            System.out.println(number+" "+adSoyad+" "+department);
        }
        reader.close();
    }
    
}
