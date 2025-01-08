package cz.spsmb.otazka16;

public class Main {
    public static void main(String[] args) throws Exception {
        /*String pozdrav = null;
        pozdrav.toUpperCase(); //NullPointerException - dame do try catch*/

        try {
            String pozdrav = null;
            pozdrav.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Pozdrav je null");
        }

        /*int[] pole = new int[10];
        System.out.println(pole[1]); - index je mimo pole - IndexOutOfBoundsException */

        try {
            int[] pole = new int[10];
            System.out.println(pole[11]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je mimo pole");
        }

        /*String text = "Ahoj";
        int num = Integer.parseInt(text); - NumberFormatException */

        try {
            String text = "Ahoj";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Zadaný String je text a ne èíslo");
        }

        throwErrorMethod();
    }

    public static int throwErrorMethod() throws CustomException {
        throw new CustomException("Moje vyjimka");
    }
}
