package cz.spsmb.otazka9;

public class Man extends Human{
    public Man(String name, int age, String colorOfEyes) {
        super(name, age, colorOfEyes);
    }

    public static void startMorningRoutine() {
       System.out.println("1. Vst�t z postele");
       System.out.println("2. Um�t se");
       System.out.println("3. Odej�t z domu");
    }
}
