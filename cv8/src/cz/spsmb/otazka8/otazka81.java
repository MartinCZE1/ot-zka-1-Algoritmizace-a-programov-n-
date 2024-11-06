package cz.spsmb.otazka8;

import java.util.ArrayList;
import java.util.Arrays;

public class otazka81 {
    public static void main(String[] args) {
        Integer[] numbers = {154, 21, 41, 20, 124, 214, 2, 32, 12, 19};
        int help = 0;
        ArrayList<Integer> suda = new ArrayList<>();
        ArrayList<Integer> licha = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > help) {
                help = numbers[i];
            }

            if (numbers[i] % 2 == 0) {
                suda.add(numbers[i]);
            } else {
                licha.add(numbers[i]);
            }
        }

        System.out.println("Nejvyšší hodnota pole je: " + help);

        System.out.print("Všechna sudá čísla: ");
        for (int i = 0; i < suda.size(); i++) {
            System.out.print(suda.get(i) + ", ");
        }
        System.out.println("Celkem sudých čísel je: " + suda.size());


        System.out.print("Všechna lichá čísla: ");
        for (int i = 0; i < licha.size(); i++) {
            System.out.print(licha.get(i) + ", ");

        }
        System.out.println("Celkem lichých čísel je: " + licha.size());

        Arrays.sort(numbers);
        System.out.println("Druhé nejmenší: " + numbers[1]);
        System.out.println("Druhé největší: " + numbers[numbers.length - 2]);
    }
}
