package dosyalar2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DosyaOkumaÖdev {

    public void fileReader(String filePath) {

        File f = new File(filePath);
        try {
            if (!f.canRead()) {
                System.out.println("bu dosya okunamaz");
            }
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
            if ((line = br.readLine()) == null) {
                System.out.println("**** Okuma Bitti ****");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bu dosya bulunamıyor");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DosyaOkumaÖdev f1 = new DosyaOkumaÖdev();
        try {
              f1.fileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\Dosyalar2\\notlar.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
