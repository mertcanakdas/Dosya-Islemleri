package dosyalar2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotHesaplayici {

    public static File f;
    public static double vizeNot = 0;
    public static double finalNot = 0;
    public static String number;

    public double average(double not1, double not2) {
        double ortalama = (not1 + not2) / 2;
        return ortalama;
    }

    public void fileWriter(String filePath) throws IOException {
        File f2 = new File(filePath);
        
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2,true));

            bw.append(number + "\t" + vizeNot + "\t" + finalNot + "\t" + average(vizeNot, finalNot));
            bw.newLine();
            bw.close();
        
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("soru2.txt");
        Scanner reader = new Scanner(f);
        NotHesaplayici fw = new NotHesaplayici();
        
        while (reader.hasNext()) {
            try {
                number = reader.next();
                vizeNot = Double.valueOf(reader.next());
                finalNot = Double.valueOf(reader.next());
                System.out.println(number + "\t" + vizeNot + "\t" + finalNot);
                fw.fileWriter("notlar2.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
