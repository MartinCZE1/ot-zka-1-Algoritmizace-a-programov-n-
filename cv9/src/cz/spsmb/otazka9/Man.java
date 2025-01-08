package cz.spsmb.otazka9;

public class Man extends Human{
    public Man(String name, int age, String colorOfEyes) {
        super(name, age, colorOfEyes);
    }

    public static void startMorningRoutine() {
       System.out.println("1. Vstát z postele");
       System.out.println("2. Umýt se");
       System.out.println("3. Odejít z domu");
    }
}
