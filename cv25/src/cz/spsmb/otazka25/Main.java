package cz.spsmb.otazka25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej èíslo: ");
        CountThread countThread = new CountThread();
        countThread.start();

        do {
            System.out.println("Zadej èíslo: ");
            int cislo1 = sc.nextInt();
            int cislo2 = countThread.getCounter();
            System.out.println(cislo1 + cislo2);
        } while (true);
    }
}
