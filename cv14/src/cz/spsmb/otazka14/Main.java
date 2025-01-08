package cz.spsmb.otazka14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("names.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.append("Radek\r\nPavel");
        fileWriter.close();

        Scanner sc = new Scanner("names.txt");
        int i = 0;
        String[] data = new String[2];
        while (sc.hasNextLine()) {
            data[i] = sc.nextLine();
            i++;
        }
        System.out.println(data[1]);
    }
}
