package cz.spsmb.otazka9;

public class Woman extends Human {
    public Woman(String name, int age, String colorOfEyes) {
        super(name, age, colorOfEyes);
    }

    public static void startMorningRoutine() {
        System.out.println("1. Vst�t z postele");
        System.out.println("2. Um�t se");
        System.out.println("3. Nal��it se");
        System.out.println("4. Zm�nit 457x oble�en�");
        System.out.println("5. Dal��ch 1597 v�c�");
        System.out.println("6. Odej�t z domu");
    }
}
