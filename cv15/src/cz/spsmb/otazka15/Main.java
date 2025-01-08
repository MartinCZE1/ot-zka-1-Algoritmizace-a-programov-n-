package cz.spsmb.otazka15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte 10 jmen oddìlené èárkou");
        String text = sc.nextLine();
        List<String> pole = new ArrayList<>();
        String poleText[];

        poleText = text.split(",");

        for (int i = 0; i < poleText.length; i++) {
            pole.add(poleText[i]);
        }

        for (int i = 0; i < pole.size(); i++) {
            pole.remove(pole.size() - 1 - i);
        }

        for (int i = 0; i < pole.size(); i++) {
            System.out.println(pole.get(i));
        }
    }
}
