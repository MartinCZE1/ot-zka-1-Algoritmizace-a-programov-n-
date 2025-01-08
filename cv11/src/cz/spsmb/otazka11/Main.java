package cz.spsmb.otazka11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();

       /* SimpleMonth.values();
        for (int i = 0; i < SimpleMonth.values().length; i++) {
            System.out.println(SimpleMonth.values()[i] + " " + SimpleMonth.values()[i].getDays());
        }*/
        /**
         * Vytvoøte dvourozmìrné pole int[10][10]
         * Pole projdeme prvek po prvku a najdìte první prvoèíslo
         * Pokud se v poli prvoèíslo nenalézá, vypište hlášku - žádné prvoèíslo
         */

        int[][] pole = new int[10][10];

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[0].length; j++) {
                pole[i][j] = rd.nextInt(100) + 1;
            }
        }

        outer:
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[0].length; j++) {
                int cislo = pole[i][j];
                if (MathUtils.isPrimeNumber(cislo)) {
                    System.out.println("Prvoèíslo je " + cislo);
                    break outer;
                }
            }
        }
    }
}
