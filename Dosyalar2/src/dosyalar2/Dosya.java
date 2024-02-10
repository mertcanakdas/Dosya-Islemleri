package dosyalar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dosya {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Dosyalar2\\notlar.txt");
        Scanner s = new Scanner(f);
        String line;
        String name;
        int semester = 0;
        double average = 0;

        while (s.hasNext()) {
            name = s.nextLine();
            line = s.nextLine();
            System.out.println(name + "\n" + line);

            for (int i = 0; i < 2; i++) {
                if (s.hasNextInt()) {
                    semester = Integer.parseInt(s.next());
                }
                if (s.hasNextDouble()) {
                    average = s.nextDouble();
                }
                System.out.println(" "+semester+"\t\t"+average);
                s.nextLine();
            }

        }

    }

}
